package systemePointage;


import systemePointage.categorie.Categorie;
import lombok.*;

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
    private Categorie category;



}
