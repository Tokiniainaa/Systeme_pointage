package systemePointage;


import lombok.*;
import systemePointage.categorie.Categorie;

import java.sql.Date;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Employe {

    private final String nom;
    private final String prenom;
    private final String numeroMatricule;
    private final LocalDate dateNaissance ;
    private final LocalDate dateEmbauche ;
    private final LocalDate dateFinContrat;
    private final Salaire montantSalaire;
    private Categorie categorie;



}
