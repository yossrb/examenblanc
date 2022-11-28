package tn.esprit.examenblanc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenblanc.Service.IUser;
import tn.esprit.examenblanc.Service.UserService;
import tn.esprit.examenblanc.entities.User;
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    IUser iUser;
    @PostMapping("/ajouterutlisateur")


    public User ajouterUtilisateur (@RequestBody User utilisateur)
    {
        return iUser.ajouterUtilisateur(utilisateur);
    };

}
