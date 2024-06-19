package systemePointage.categorie;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class Normal extends Categorie {
    public Normal( int nombreHeureNormalParSemaine, double salaireParSemaine, double indamnite) {
        super("Normal", nombreHeureNormalParSemaine, salaireParSemaine, indamnite);
    }

}
