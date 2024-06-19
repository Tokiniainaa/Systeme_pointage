package systemePointage.categorie;

import lombok.*;
import systemePointage.NotImplemented;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract sealed class  Categorie permits CadreSuperieur ,Normal,Gardien,Chauffeur {

    private final String nom;
    private int nombreHeureNormalParSemaine;
    private double salaireParSemaine;
    private double indamnite;

    public abstract double calculIndamnite ();

}
