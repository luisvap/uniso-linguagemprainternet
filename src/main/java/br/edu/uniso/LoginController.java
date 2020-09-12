package br.edu.uniso;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping(value="/login", method= RequestMethod.POST)
    public String vaiPraPaginaDeWelcome(@RequestParam String nome, @RequestParam String senha, ModelMap model){

        // se o nome for igual uniso e a senha igual uniso
        // faz login
        if(nome.equals("uniso") && senha.equals("uniso")){

            model.put("nome", nome);
            return "welcome";
        }

        return "login";
    }

    @RequestMapping(value="/home", method= RequestMethod.GET)
    public String vaiProLogin(){

        return "login";
    }


}
