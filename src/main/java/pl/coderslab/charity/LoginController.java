package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";

    }



    @GetMapping("/403")
    @ResponseBody
    public String notAccess(){
        return "403";

    }

    @PostMapping("/error")
    @ResponseBody
    public String error(){
        return "error";
    }
}
