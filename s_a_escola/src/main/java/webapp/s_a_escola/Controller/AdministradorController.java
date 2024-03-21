package webapp.s_a_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import webapp.s_a_escola.Model.AdministradorHabilitado;
import webapp.s_a_escola.Repository.AdministradorRepository;

@Controller
public class AdministradorController {
    @Autowired
    private AdministradorRepository ar;

    @RequestMapping(value = "/administrador", method = RequestMethod.GET)
    public String abrirAdministrador(Model model) {
        model.addAttribute("administrador", new AdministradorHabilitado());
        return "administrador/administrador";
    }

    @RequestMapping(value = "/administrador", method = RequestMethod.POST)
    public String gravarAdministrador(@ModelAttribute("administrador") AdministradorHabilitado administrador) {
        ar.save(administrador);
        return "redirect:/administrador?success=true";
    }
}