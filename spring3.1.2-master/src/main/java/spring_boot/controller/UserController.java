package spring_boot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring_boot.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService usersService;

    @Autowired
    public UserController(UserService usersService) {
        this.usersService = usersService;
    }

    @GetMapping
    public String getUser(Model model, Authentication authentication) {
        model.addAttribute("user", usersService.getUserByUsername(authentication.getName()));
        return "userpage";
    }

}
