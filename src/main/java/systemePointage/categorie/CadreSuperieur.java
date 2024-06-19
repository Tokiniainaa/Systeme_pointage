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
public final class CadreSuperieur extends Categorie{
    public CadreSuperieur( int nombreHeureNormalParSemaine, double salaireParSemaine, double indamnite) {
        super("CadreSuperieur", nombreHeureNormalParSemaine, salaireParSemaine, indamnite);
    }


    @Override
    public double calculIndamnite() {
        throw new NotImplemented();
    }
}
