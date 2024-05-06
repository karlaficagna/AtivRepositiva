package fundatec.ficagna.ativrepositiva;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Triangulo implements CalculadoraFormasGeometricas {

    private double ladoa;
    private double ladob;
    private double ladoc;


    @Override
    public double calcularArea() {
        double s = (ladoa + ladob + ladoc) / 2;
        return Math.sqrt(s * (s - ladoa) * (s - ladob) * (s - ladoc));
    }

    @Override
    public double calcularPerimetro() {
        return ladoa + ladob + ladoc;
    }

}
