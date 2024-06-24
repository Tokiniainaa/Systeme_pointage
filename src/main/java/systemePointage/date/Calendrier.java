package systemePointage.date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Calendrier {
    private final List<LocalDate> joursFeries;

    private List<Jour> calendrier;

    public Calendrier() {
        joursFeries = new ArrayList<>();
        joursFeries.add(LocalDate.of(2024, 6, 17));
        joursFeries.add(LocalDate.of(2024, 6, 25));
        joursFeries.add(LocalDate.of(2024, 6, 26));
        calendrier = new ArrayList<>();
        remplirCalendrier();
    }

    private void remplirCalendrier() {
        LocalDate debutMois = LocalDate.of(2024, 6, 1);
        LocalDate dateFin = debutMois.withDayOfMonth(debutMois.lengthOfMonth());
        for (LocalDate date = debutMois; !date.isAfter(dateFin); date = date.plusDays(1)) {
            boolean estFerie = joursFeries.contains(date);
            boolean estWeekend = estWeekend(date);
            calendrier.add(new Jour(date, estFerie, estWeekend));
        }
    }

    private boolean estWeekend(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

}
