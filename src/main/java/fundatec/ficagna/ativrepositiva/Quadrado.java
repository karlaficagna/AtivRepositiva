package fundatec.ficagna.ativrepositiva;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quadrado implements CalculadoraFormasGeometricas{

    private double lado;


    public double calcularArea() {

        return lado * lado;
    }

    public double calcularPerimetro() {

        return 4 * lado;
    }
}
