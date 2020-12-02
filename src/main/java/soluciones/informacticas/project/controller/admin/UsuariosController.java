package soluciones.informacticas.project.controller.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import soluciones.informacticas.project.data.model.dto.UsuarioDto;
import soluciones.informacticas.project.data.model.entity.UsuarioEntity;
import soluciones.informacticas.project.data.model.repository.UsuarioRepository;
import soluciones.informacticas.project.service.ConvertirService;

@Controller
@RequestMapping("/admin/usuarios")
public class UsuariosController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ConvertirService convertirService;

    @GetMapping({"","/"})
    public ModelAndView showIndexAdmin(){
        ModelAndView modelAndView = new ModelAndView("admin/usuarios");
        modelAndView.addObject("usuarios", usuarioRepository.findAll(Sort.by(Sort.Direction.ASC,"nombreUsuario")));
        return modelAndView;
    }

    @GetMapping("/editar")
    public ModelAndView editarUsuario(@RequestParam(value = "user", required = true, defaultValue = "") String id){
        ModelAndView modelAndView = new ModelAndView("admin/editar-usuarios");
        modelAndView.addObject("usuarioDto", convertirService.convertirEntidadUsuarioADto(usuarioRepository.findByNombreUsuario(id)));
        return modelAndView;
    }

    @PostMapping("/editar")
    public String editarUsuario(@ModelAttribute UsuarioDto usuarioDto){

        UsuarioEntity usuarioEntity = new UsuarioEntity(usuarioDto); //convertirService.convertirDtoAEntity(usuarioDto);
        try {
            usuarioRepository.saveUser(usuarioEntity.getNombre(),usuarioEntity.getApellido(),
                    usuarioEntity.getTipoDocumento(),usuarioEntity.getDocumento(),
                    usuarioEntity.getCelular(),usuarioEntity.getEmail(),usuarioEntity.getActivo(),
                    usuarioEntity.getFechaActualizacion(), usuarioEntity.getNombreUsuario());
            return "redirect:/admin";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("/inactivar")
    public String inactivarUsuario(@RequestParam(value = "user", required = true, defaultValue = "") String id){

        try {
            usuarioRepository.inactivaUser(id);
            return "redirect:/admin";
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
