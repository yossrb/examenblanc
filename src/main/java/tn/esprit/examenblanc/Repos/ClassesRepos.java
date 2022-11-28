package tn.esprit.examenblanc.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblanc.entities.Classe;

public interface ClassesRepos extends JpaRepository<Classe,Integer> {

}
