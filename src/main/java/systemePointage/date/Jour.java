package systemePointage.date;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Jour {

    private LocalDate date;
    private boolean estFerie;
    private boolean estWeekend;

    public Jour(LocalDate date, boolean estFerie, boolean estWeekend) {
        this.date = date;
        this.estFerie = estFerie;
        this.estWeekend = estWeekend;
    }
}
