package systemePointage.categorie;

import lombok.*;
import systemePointage.NotImplemented;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class Gardien extends Categorie {
    public Gardien(int nombreHeureNormalParSemaine, double salaireParSemaine, double indamnite) {
        super("Gardien", nombreHeureNormalParSemaine, salaireParSemaine, indamnite);
    }


    @Override
    public double calculIndamnite() {
        throw new NotImplemented();
    }
}
