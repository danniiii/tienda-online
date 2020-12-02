package soluciones.informacticas.project.controller.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import soluciones.informacticas.project.data.model.dto.CategoriaDto;
import soluciones.informacticas.project.data.model.entity.CategoriaEntity;
import soluciones.informacticas.project.data.model.repository.CategoriaRepository;

import javax.persistence.OrderBy;
import java.util.Optional;

@Controller
@RequestMapping("/admin/categorias")
public class CategoriasController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping({"","/"})
    public ModelAndView mostrarIndexCategorias(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("admin/categorias");
//        modelAndView.addObject("categorias", categoriaRepository.findAll(Sort.by(Sort.Direction.ASC,"nombreCategoria")));
        modelAndView.addObject("categorias", categoriaRepository.findAll(pageable).getContent());
        modelAndView.addObject("categoriaDto", new CategoriaDto());
        return modelAndView;
    }

}
