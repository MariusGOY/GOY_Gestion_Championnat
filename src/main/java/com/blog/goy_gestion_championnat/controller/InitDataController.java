package com.blog.goy_gestion_championnat.controller;

import com.blog.goy_gestion_championnat.projos.*;
import com.blog.goy_gestion_championnat.serices.*;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;

import java.sql.Date;

@Controller
public class InitDataController {
    private ChampionnatService championnatService;
    private EquipeService equipeService;
    private JourneeService journeeService;
    private LeMatchService leMatchService;
    private PaysService paysService;
    private StadeService stadeService;
    private UserService userService;



    public InitDataController(ChampionnatService championnatService, EquipeService equipeService, JourneeService journeeService, LeMatchService leMatchService, PaysService paysService, StadeService stadeService, UserService userService) {
        this.championnatService = championnatService;
        this.equipeService = equipeService;
        this.journeeService = journeeService;
        this.leMatchService = leMatchService;
        this.paysService = paysService;
        this.stadeService = stadeService;
        this.userService = userService;
    }

    @PostConstruct
    private void init() {

        //User
        if (userService.recupererUser().isEmpty()) {
            User user = new User();
            user.setNom("GOY");
            user.setPrenom("Marius");
            user.setPseudo("marius22");
            user.setLogin("marius.goy@gmail.com");
            user.setEmail("marius.goy@gmail.com");
            user.setMdp("123456");
            userService.ajouterUser(user);

            User user2 = new User();
            user2.setNom("LEBOURG");
            user2.setPrenom("Matias");
            user2.setPseudo("Matiase234");
            user2.setLogin("Matias.LEBOURG@gmail.com");
            user2.setEmail("Matias.LEBOURG@gmail.com");
            user2.setMdp("7891011");
            userService.ajouterUser(user2);

        }

        // Stade
        if (stadeService.recupererStade().isEmpty()) {
            Stade stade = new Stade();
            stade.setNom("Groupama Stadium");
            stade.setAdresse("69100 Villeurbanne, France");
            stade.setCapacite(59185);
            stade.setTelephone("+33 4 72 77 40 00");
            stadeService.ajouterStade(stade);

            Stade stade2 = new Stade();
            stade2.setNom("Stade Vélodrome");
            stade2.setAdresse("3 Boulevard Michelet, 13008 Marseille, France");
            stade2.setCapacite(67394);
            stade2.setTelephone("+33 4 91 13 89 99");
            stadeService.ajouterStade(stade2);

            Stade stade3 = new Stade();
            stade3.setNom("Allianz Arena");
            stade3.setAdresse("Werner-Heisenberg-Allee 25, 80939 München, Allemagne");
            stade3.setCapacite(75000);
            stade3.setTelephone("+49 89 699 31 00");
            stadeService.ajouterStade(stade3);
        }

        // Pays
        if (paysService.recupererPays().isEmpty()) {
            Pays pays = new Pays();
            pays.setNom("France");
            paysService.ajouterPays(pays);

            Pays pays2 = new Pays();
            pays2.setNom("Italie");
            paysService.ajouterPays(pays2);

            Pays pays3 = new Pays();
            pays3.setNom("Espagne");
            paysService.ajouterPays(pays3);
        }

        // Match
        if (leMatchService.recupererLeMatch().isEmpty()) {
            LeMatch leMatch = new LeMatch();
            leMatch.setPointsEquipe1(2);
            leMatch.setPointsEquipe2(1);
            leMatchService.ajouterLeMatch(leMatch);

            LeMatch leMatch2 = new LeMatch();
            leMatch2.setPointsEquipe1(0);
            leMatch2.setPointsEquipe2(0);
            leMatchService.ajouterLeMatch(leMatch2);

            LeMatch leMatch3 = new LeMatch();
            leMatch3.setPointsEquipe1(3);
            leMatch3.setPointsEquipe2(1);
            leMatchService.ajouterLeMatch(leMatch3);
        }

        // Journée
        if (journeeService.recupererJournee().isEmpty()) {
            Journee journee = new Journee();
            journee.setNumero(1);
            journeeService.ajouterJournee(journee);

            Journee journee2 = new Journee();
            journee2.setNumero(2);
            journeeService.ajouterJournee(journee2);

            Journee journee3 = new Journee();
            journee3.setNumero(3);
            journeeService.ajouterJournee(journee3);
        }

        // Equipe
        if (equipeService.recupererEquipe().isEmpty()) {
            Equipe equipe = new Equipe();
            equipe.setNom("Olympique Lyonnais");
            equipe.setDateCreation(Date.valueOf("1950-06-30"));
            equipe.setNomEntraineur("Laurent Blanc");
            equipe.setPresident("Jean-Michel Aulas");
            equipe.setSiege("69100 Villeurbanne, France");
            equipe.setSiteWeb("https://www.ol.fr/");
            equipe.setStatu("Professionnel");
            equipe.setTelephone("+33 4 72 77 40 00");
            equipeService.ajouterEquipe(equipe);

            Equipe equipe2 = new Equipe();
            equipe2.setNom("Paris Saint-Germain");
            equipe2.setDateCreation(Date.valueOf("1970-08-12"));
            equipe2.setNomEntraineur("Christophe Galtier");
            equipe2.setPresident("Nasser Al-Khelaïfi");
            equipe2.setSiege("75016 Paris, France");
            equipe2.setSiteWeb("https://www.psg.fr/");
            equipe2.setStatu("Professionnel");
            equipe2.setTelephone("+33 1 47 43 70 00");
            equipeService.ajouterEquipe(equipe2);

            Equipe equipe3 = new Equipe();
            equipe3.setNom("FC Bayern Munich");
            equipe3.setDateCreation(Date.valueOf("1900-02-27"));
            equipe3.setNomEntraineur("Julian Nagelsmann");
            equipe3.setPresident("Herbert Hainer");
            equipe3.setSiege("80331 München, Allemagne");
            equipe3.setSiteWeb("https://fcbayern.com/");
            equipe3.setStatu("Professionnel");
            equipe3.setTelephone("+49 89 644 00 0");
            equipeService.ajouterEquipe(equipe3);
        }

        // Championnat
        if (championnatService.recupererChampionnat().isEmpty()) {
            Championnat championnat = new Championnat();
            championnat.setNom("Ligue 1 Uber Eats");
            championnat.setDateDebut(Date.valueOf("2023-08-05"));
            championnat.setDateFin(Date.valueOf("2024-06-04"));
            championnat.setPointGagne(3);
            championnat.setPointNul(1);
            championnat.setPointPerdu(0);
            championnat.setTypeClassement("Points");
            championnatService.ajouterChampionnat(championnat);

            Championnat championnat2 = new Championnat();
            championnat2.setNom("Serie A");
            championnat2.setDateDebut(Date.valueOf("2023-08-13"));
            championnat2.setDateFin(Date.valueOf("2024-06-04"));
            championnat2.setPointGagne(3);
            championnat2.setPointNul(1);
            championnat2.setPointPerdu(-1);
            championnat2.setTypeClassement("Points");
            championnatService.ajouterChampionnat(championnat2);

            Championnat championnat3 = new Championnat();
            championnat3.setNom("La Liga");
            championnat3.setDateDebut(Date.valueOf("2023-08-12"));
            championnat3.setDateFin(Date.valueOf("2024-06-04"));
            championnat3.setPointGagne(4);
            championnat3.setPointNul(2);
            championnat3.setPointPerdu(-2);
            championnat3.setTypeClassement("Différence de buts");
            championnatService.ajouterChampionnat(championnat3);
        }
    }

}
