package systemePointage;


import lombok.*;
import systemePointage.categorie.Categorie;

import java.sql.Date;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Employe {

    private final String nom;
    private final String prenom;
    private final String numeroMatricule;
    private final Date dateNaissance ;
    private final Date dateEmbauche ;
    private final Date dateFinContrat;
    private final Salaire montantSalaire;
    private Categorie categorie;



}
