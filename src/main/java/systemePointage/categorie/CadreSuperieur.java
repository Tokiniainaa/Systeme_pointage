package systemePointage.categorie;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class CadreSuperieur extends Categorie{
    public CadreSuperieur( int nombreHeureNormalParSemaine, double salaireParSemaine, double indamnite) {
        super("CadreSuperieur", nombreHeureNormalParSemaine, salaireParSemaine, indamnite);
    }

}
