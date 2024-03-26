package webapp.s_a_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import webapp.s_a_escola.Model.Administrador;
import webapp.s_a_escola.Repository.AdministradorRepository;
import webapp.s_a_escola.Repository.PreCadRepository;


@Controller
public class AdministradorController {
    @Autowired
    private AdministradorRepository ar;
    
    @Autowired
    private PreCadRepository pcar;

    @PostMapping("cadastro-adm")
    public String postCadastroAdm(Administrador adm) {
        ar.save(adm);
        
        if (pcar.findByCpf(adm.getCpf()).equals(adm)) {
            System.out.println("Cadastro realizado com sucesso");            
        }
        
        return "login/login-adm";
    }
    

}
