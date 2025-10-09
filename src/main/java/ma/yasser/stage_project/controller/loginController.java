package ma.yasser.stage_project.controller;

import ma.yasser.stage_project.model.User;
import ma.yasser.stage_project.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class loginController {

    @Autowired
    private loginService loginService;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return loginService.verifyLogin(user);
    }
}
