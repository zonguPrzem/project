package com.rental.project.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.rental.project.services.SecurityService;

@Controller
public class HomeController {

    private final SecurityService securityService;

    public HomeController(SecurityService securityService) {
        this.securityService = securityService;
    }

    @GetMapping("/")
    public String getWelcome() {
        return "welcome";
    }

//    @GetMapping("/home")
//    public String getHome() {
//        return "home";
//    }

    @GetMapping("/login")
    public String getLogin(Model model, @RequestParam(defaultValue = "false") boolean error) {
        model.addAttribute("error", error);
        return "login";
    }
    @GetMapping("/zasady")
    public String getZasady() {
        return "zasady";
    }

    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("user", securityService.getLoggedInUser());
        return "home";
    }
    @GetMapping("/cennik")
    public String getCennik() {
        return "cennik";
    }
    @GetMapping("/kontakt")
    public String getKontakt() {
        return "kontakt";
    }

}
