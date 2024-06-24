package systemePointage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import systemePointage.date.Calendrier;
import systemePointage.date.Jour;

import java.util.List;

@SpringBootApplication
public class SystemePointageApplication {

    public static void main(String[] args)
        /**{

            Calendrier calendrier = new Calendrier();
            List<Jour> jours = calendrier.getCalendrier();

            for (Jour jour : jours) {
                System.out.println("Date: " + jour.getDate() +
                        ", Férié: " + jour.isEstFerie() +
                        ", Week-end: " + jour.isEstWeekend());

            }

        }*/
    }
