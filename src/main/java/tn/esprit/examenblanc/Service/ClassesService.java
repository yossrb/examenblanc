package tn.esprit.examenblanc.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.Repos.ClassesRepos;
import tn.esprit.examenblanc.entities.Classe;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class ClassesService  implements Iclasses{
    private ClassesRepos classesRepos;

    @Override
    public Classe ajouterClasse(Classe c) {
        return classesRepos.save(c);
    }
}
