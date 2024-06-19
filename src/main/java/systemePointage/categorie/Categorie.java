package systemePointage.categorie;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public sealed class  Categorie permits CadreSuperieur ,Normal,Gardien,Chauffeur {

    private final String nom;
    private int nombreHeureNormalParSemaine;
    private double salaireParSemaine;
    private double indamnite;

}
