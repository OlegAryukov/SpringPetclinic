package ru.aryukov.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.aryukov.sfgpetclinic.services.VetService;

@Controller
public class VetsController {
    private final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index", "/vets/index.html"})
    public String listOwners(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
