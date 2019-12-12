package com.rental.project.controllers;

import com.rental.project.model.Auto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.rental.project.dtos.AutoRegistration;
import com.rental.project.services.AutoService;
import com.rental.project.services.SecurityService;

import javax.validation.Valid;

@Controller
public class AutoController {
    SecurityService securityService;

    private final AutoService autoService;



    public AutoController(AutoService autoService) {
        this.autoService = autoService;
    }

    @GetMapping("/auto")
    public String getAutoRegistration(Model model) {
        var autoRegistration = new AutoRegistration();
        model.addAttribute("auto", autoRegistration);

        return "auto";
    }
    @PostMapping("/auto")
    public String postAuto(@ModelAttribute("auto") @Valid AutoRegistration registration, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "auto";
        } else {
            var cennik = autoService.createAuto(registration);
            return "redirect:/cennik";
        }
    }


}
