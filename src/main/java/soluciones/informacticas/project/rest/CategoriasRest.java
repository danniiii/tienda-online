package soluciones.informacticas.project.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soluciones.informacticas.project.data.model.entity.CategoriaEntity;
import soluciones.informacticas.project.data.model.repository.CategoriaRepository;

import javax.validation.Valid;
import java.util.Date;

@RestController
@RequestMapping("/admin/categorias")
public class CategoriasRest {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping("/crear")
    public boolean crearCategoria(@RequestBody @Valid CategoriaEntity categoriaEntity){

        try {
            categoriaRepository.save(categoriaEntity);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @PostMapping("/editar")
    public boolean editarCategoria(@RequestBody @Valid CategoriaEntity categoriaEntity){

        try {
            categoriaEntity.setFechaActualizacion(new Date());
            categoriaRepository.save(categoriaEntity);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public boolean eliminaCategoria(@PathVariable("id") Integer id){

        try {
            categoriaRepository.deleteById(id);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
