package systemePointage;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Salaire {

    private final double salaireBrut;
    private double salaireNet;

    public Salaire (double salaireBrut) {
        this.salaireBrut = salaireBrut;
        this.salaireNet  = salaireBrut*0.8;
    }

    public double calculSalaireNet (Salaire salaire) {
        double salaireNet = salaire.getSalaireBrut() * 0.8;
        return salaireNet;
    }



}
