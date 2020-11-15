package com.javaguys.fastnotes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class MainController {

    @GetMapping("/main")
    public String main(Principal principal, Model model){
        return "main";
    }
}
