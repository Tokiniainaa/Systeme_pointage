package systemePointage.categorie;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import systemePointage.NotImplemented;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class Chauffeur extends Categorie {
    public Chauffeur( int nombreHeureNormalParSemaine, double salaireParSemaine, double indamnite) {
        super("Chauffeur", nombreHeureNormalParSemaine, salaireParSemaine, indamnite);
    }

    @Override
    public double calculIndamnite() {
        throw new NotImplemented();
    }
}
