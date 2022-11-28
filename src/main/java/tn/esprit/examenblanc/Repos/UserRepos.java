package tn.esprit.examenblanc.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblanc.entities.User;

public interface UserRepos extends JpaRepository
<User,Integer>{}
