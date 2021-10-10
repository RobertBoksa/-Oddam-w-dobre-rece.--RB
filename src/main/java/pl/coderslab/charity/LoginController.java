package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";

    }

    @PostMapping("/login")
    public String login2(){
        return "redirect:/";
    }

    @GetMapping("/403")
    public String notAccess(){
        return "403";

    }
}
