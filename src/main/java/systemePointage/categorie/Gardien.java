package systemePointage.categorie;

import lombok.*;
@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class Gardien extends Categorie {
    public Gardien(int nombreHeureNormalParSemaine, double salaireParSemaine, double indamnite) {
        super("Gardien", nombreHeureNormalParSemaine, salaireParSemaine, indamnite);
    }


}
