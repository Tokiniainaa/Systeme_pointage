package systemePointage.date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import systemePointage.Employe;
import systemePointage.categorie.Gardien;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Pointage {

    private final Calendrier calendrier;

    public int calculerHeuresTravailléesParMois(Employe employee , boolean estNuit) {

        List<Jour> jours = calendrier.getCalendrier();
        int totalHeures = 0;
        for (Jour jour : jours) {
           if(!estNuit){
               totalHeures=totalHeures+10;
           }
           else {
               totalHeures=totalHeures+14;
           }
        }
        return totalHeures;

    }
}
