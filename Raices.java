import java.util.*;

public class Raices {

    Double a;
    Double b;
    Double c;

    public Raices(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double getDiscriminante() {
        return (b*b)-(4*a*c);
    }

    public String getRaices(Double discriminante) {
        if (discriminante > 0) {
            return String.format("Raices: %s,%s", getFormulaCuadraticaPositiva(discriminante), getFormulaCuadraticaNegativa(discriminante));
        } else if (discriminante == 0) {
            return String.format("Raiz: %s", getFormulaCuadraticaPositiva(discriminante));
        } else {
            return String.format("Raices: %s,%s", getFormulaCuadraticaImaginariaPositiva(discriminante), getFormulaCuadraticaImaginariaNegativa(discriminante));
        }
    }

    private Double getFormulaCuadraticaPositiva(Double discriminante) {
        return (-b + Math.sqrt(discriminante))/2*a;
    }

    private Double getFormulaCuadraticaNegativa(Double discriminante) {
        return (-b - Math.sqrt(discriminante))/2*a;
    }

    private String getFormulaCuadraticaImaginariaPositiva(Double discriminante) {
        return String.format("%s + %si", (-b)/2*a, (Math.sqrt(discriminante * -1))/2*a);
    }

    private String getFormulaCuadraticaImaginariaNegativa(Double discriminante) {
        return String.format("%s - %si", (-b)/2*a, (Math.sqrt(discriminante * -1))/2*a);
    }
}
