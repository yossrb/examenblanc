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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idUtilisateur;
    String prenom;
    String nom;
    String password;

@ManyToOne
  private  Classe classe;
}
