package tn.esprit.examenblanc.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.Repos.UserRepos;
import tn.esprit.examenblanc.entities.User;

@Service
@AllArgsConstructor

@Slf4j
public class UserService implements IUser{
    private UserRepos userRepos;

    @Override
    public User ajouterUtilisateur(User utilisateur) {
        return userRepos.save(utilisateur);

    }
}
