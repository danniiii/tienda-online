package soluciones.informacticas.project.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import soluciones.informacticas.project.data.model.dto.ProductoDto;
import soluciones.informacticas.project.data.model.entity.CategoriaProductoEntity;
import soluciones.informacticas.project.data.model.entity.ProductoEntity;
import soluciones.informacticas.project.data.model.repository.CategoriaProductoRepository;
import soluciones.informacticas.project.data.model.repository.CategoriaRepository;
import soluciones.informacticas.project.data.model.repository.ProductoRepository;
import soluciones.informacticas.project.service.ConvertirService;

import javax.validation.Valid;
import java.util.Date;

@Controller
@RequestMapping("/admin/productos")
public class ProductosController {

    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private CategoriaProductoRepository categoriaProductoRepository;

    @Autowired
    private ConvertirService convertirService;

    @GetMapping({"","/"})
    public ModelAndView showIndexAdmin(){
        ModelAndView modelAndView = new ModelAndView("admin/productos/index-productos");
        modelAndView.addObject("productos", productoRepository.findAll(Sort.by(Sort.Direction.ASC, "codigoProducto")));
        return modelAndView;
    }

    @GetMapping("/crear")
    public ModelAndView crearProducto(){
        ModelAndView modelAndView = new ModelAndView("/admin/productos/inserta-producto");
        modelAndView.addObject("productoDto",new ProductoDto());
        modelAndView.addObject("categorias", categoriaRepository.findAll());
        return modelAndView;
    }

    @PostMapping("/crear")
    public String insertarProducto(@ModelAttribute ProductoDto productoDto){

        try {
            ProductoEntity productoEntity = new ProductoEntity(productoDto);
            CategoriaProductoEntity categoriaProductoEntity = new CategoriaProductoEntity();
            categoriaProductoEntity.setIdCategoria(productoDto.getIdCategoria());
            productoEntity.setUriImg("URL");
            ProductoEntity productoEntityTemp =  productoRepository.save(productoEntity);
            categoriaProductoEntity.setIdProducto(productoEntityTemp.getIdProducto());
            categoriaProductoRepository.save(categoriaProductoEntity);
            return "redirect:/admin/productos";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("/editar")
    public ModelAndView mostrarFormularioEdicion(@RequestParam("codigo") String codigoProducto){
        ModelAndView modelAndView = new ModelAndView("/admin/productos/edita-producto");
        ProductoEntity productoEntity = productoRepository.findByCodigoProducto(codigoProducto);
        modelAndView.addObject("productoDto", convertirService.convertirEntidadProductoADto(productoEntity));
        return modelAndView;
    }

    @PostMapping("/editar")
    public String editarProducto(@ModelAttribute @Valid ProductoDto productoDto,
                                 BindingResult bindingResult){

        if (bindingResult.hasErrors())
            return "redirect:/admin";

        try {
            ProductoEntity productoEntity =  new ProductoEntity(productoDto);
            productoEntity.setIdProducto(productoDto.getIdProducto());
            productoEntity.setFechaActualizacion(new Date());
            productoEntity.setUriImg("URL");
            productoRepository.save(productoEntity);
            return "redirect:/admin/productos";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("/eliminar")
    public String eliminarProducto(@RequestParam("codigo") String codigoProducto){

        try {
            ProductoEntity productoEntity = productoRepository.findByCodigoProducto(codigoProducto);
            productoRepository.deleteById(productoEntity.getIdProducto());
            return "redirect:/admin/productos";
        } catch (Exception e){
            return e.getMessage();
        }
    }
}
