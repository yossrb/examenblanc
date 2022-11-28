package tn.esprit.examenblanc.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter

public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
Integer codeClasse;
    String titre;
    @Enumerated(EnumType.STRING)
    Niveau niveau;


    @OneToMany(mappedBy = "classe")
    private Set<CoursClassroom> coursClassrooms= new HashSet<>();
}
