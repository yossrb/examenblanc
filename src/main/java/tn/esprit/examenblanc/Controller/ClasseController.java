package tn.esprit.examenblanc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.examenblanc.Service.Iclasses;
import tn.esprit.examenblanc.entities.Classe;
@RestController
@RequestMapping("/classe")
@AllArgsConstructor

public class ClasseController {

    Iclasses iclasses;
    @PostMapping("/ajouterclasse")
    public Classe ajouterClasse ( @RequestBody Classe c){
        return iclasses.ajouterClasse(c);
    }
}
