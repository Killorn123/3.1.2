package spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String startPage() {
        return "redirect:/login";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "loginpage";
    }
}
