package com.blog.goy_gestion_championnat.controller;

import com.blog.goy_gestion_championnat.projos.Championnat;
import com.blog.goy_gestion_championnat.projos.Equipe;
import com.blog.goy_gestion_championnat.serices.*;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Constructor;
import java.util.List;

@Controller
@RequestMapping("/")
public class GestionChampionnatController {

    private ChampionnatService championnatService;
    private EquipeService equipeService;
    private JourneeService journeeService;
    private LeMatchService leMatchService;
    private PaysService paysService;
    private StadeService stadeService;
    private UserService userService;
    private HttpSession httpSession;


    // Constructor
    public GestionChampionnatController(ChampionnatService championnatService, EquipeService equipeService, JourneeService journeeService, LeMatchService leMatchService, PaysService paysService, StadeService stadeService, UserService userService, HttpSession httpSession) {
        this.championnatService = championnatService;
        this.equipeService = equipeService;
        this.journeeService = journeeService;
        this.leMatchService = leMatchService;
        this.paysService = paysService;
        this.stadeService = stadeService;
        this.userService = userService;
        this.httpSession = httpSession;
    }



    @GetMapping({"/", "index"})
    public String index(Model model) {

        // récupère la liste des recettes
        List<Championnat> championnats = championnatService.recupererChampionnat();

        // récupère la liste des categories
        List<Equipe> equipes = equipeService.recupererEquipe();

        // envoie les données à la vue
        model.addAttribute("championnats", championnats);
        model.addAttribute("equipes", equipes);

        return "index";
    }

    @GetMapping("connexion")
    public String connexion(Model model) {
        return "connexion";
    }
    @GetMapping("creationEquipe")
    public String creationEquipe(Model model) {
        return "creationEquipe";
    }
    @GetMapping("creationMatch")
    public String creationMatch(Model model) {
        return "creationMatch";
    }
    @GetMapping("aficheResulta")
    public String aficheResulta(Model model) {
        return "aficheResulta";
    }
    @GetMapping("aficheInfo")
    public String aficheInfo(Model model) {
        return "aficheInfo";
    }

}
