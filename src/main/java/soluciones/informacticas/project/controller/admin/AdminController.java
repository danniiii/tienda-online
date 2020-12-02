package soluciones.informacticas.project.controller.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping({"","/"})
    public ModelAndView showIndexAdmin(){
        ModelAndView modelAndView = new ModelAndView("admin/index");
        return modelAndView;
    }
}
