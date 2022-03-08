package ds.com.app_deploy_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
    @GetMapping(value = { "", "/" })
    public String Gohome(Model model) {
        String myName = "우은빈";
        model.addAttribute("msg", myName);
        return "index";
    }

}