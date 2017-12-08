package com.epam.bohnat.simplespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {

    private static final String HELLO = "Welcome on student page";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        return "index";
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String showStudentPage(Model model) {
        model.addAttribute("message", HELLO);
        return "student";
    }

}
