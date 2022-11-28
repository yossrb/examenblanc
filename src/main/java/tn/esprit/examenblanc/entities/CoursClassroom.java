package tn.esprit.examenblanc.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter

public class CoursClassroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idCours;
    @Enumerated(EnumType.STRING)
    Specialite  specialite;
    String nom;
    Integer nbHeures;
    Boolean archive;

@ManyToOne
    private Classe classe;

}
