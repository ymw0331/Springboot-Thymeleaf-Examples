package com.wayneyong.thymeleaftutorial.controller;

import com.wayneyong.thymeleaftutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    //handler method to handle variable-expression request
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Wayne", "ymw0331@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    //handler method to handle selection-expression
    //http://localhost:8080/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("WayneSelection", "selection@gmail.com", "ADMIN", "Female");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    //handler method to message expressions request
    //http://localhost:8080/message-expression
    @GetMapping("message-expression")
    public String messageExpression(Model model) {
        return "message-expression";
    }

    //handler method to handle link expressions
    //http://localhost:8080/link-expression
    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";
    }

    //handler method to handle fragment expression request
    @GetMapping("fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }

    @GetMapping("/users")
    public String users(Model model) {
        User admin = new User("Admin", "admin@gmail.com", "ADMIN", "Male");
        User wayne = new User("Wayne", "wayne@gmail.com", "USER", "Male");
        User meena = new User("Meena", "meena@gmail.com", "USER", "Male");

        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(wayne);
        users.add(meena);
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        User admin = new User("Admin", "admin@gmail.com", "ADMIN", "Male");
        User wayne = new User("Wayne", "wayne@gmail.com", "USER", "Male");
        User meena = new User("Meena", "meena@gmail.com", "USER", "Male");

        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(wayne);
        users.add(meena);
        model.addAttribute("users", users);
        return "if-unless";
    }


    @GetMapping("/switch-case")
    public String switchCase(Model model) {
        User user = new User(
                "Wayne",
                "admin@gmail.com",
                "ADMIN",
                "Male"
        );

        model.addAttribute("user", user);
        return "switch-case";
    }

}
