package systemePointage.categorie;

import lombok.*;
import systemePointage.NotImplemented;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class Normal extends Categorie {
    public Normal( int nombreHeureNormalParSemaine, double salaireParSemaine, double indamnite) {
        super("Normal", nombreHeureNormalParSemaine, salaireParSemaine, indamnite);
    }

    @Override
    public double calculIndamnite() {
        throw new NotImplemented();
    }
}
