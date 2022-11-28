package tn.esprit.examenblanc.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblanc.entities.CoursClassroom;

public interface ClassroomRepos extends JpaRepository<CoursClassroom,Integer> {

}
