package systemePointage.date;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendrier {
    private final List<LocalDate> JourFeries;
    private List<Jour> calendrier;

    public Calendrier() {
        JourFeries = new ArrayList<>();
        JourFeries.add(LocalDate.of(2024, 6, 17));
        JourFeries.add(LocalDate.of(2024, 6, 25));
        JourFeries.add(LocalDate.of(2024, 6, 26));
        calendrier = new ArrayList<>();
    }

    private void remplirCalendrier() {
        LocalDate debutMoi = LocalDate.of(2024, 6, 1);
        LocalDate dateFin = debutMoi.withDayOfMonth(debutMoi.lengthOfMonth());
        for (LocalDate date = debutMoi; !date.isAfter(dateFin); date = date.plusDays(1)) {
            boolean estFerie = JourFeries.contains(date);
            boolean estJourTravailNormal = !estFerie && !estWeekend(date);
            boolean estJourTravailGardien = !estFerie;
            calendrier.add(new Jour(date, estFerie,estWeekend));
        }
    }

}
