package tn.esprit.examenblanc.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.Repos.ClassesRepos;
import tn.esprit.examenblanc.Repos.ClassroomRepos;
import tn.esprit.examenblanc.entities.CoursClassroom;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class ClassroomService implements  Iclassroom{

ClassroomRepos classesRepos;
    @Override
    public CoursClassroom ajouterCoursClassroom(CoursClassroom cc, Integer codeClasse) {
        return classesRepos.save(cc);
    }
}
