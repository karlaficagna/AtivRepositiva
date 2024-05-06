package fundatec.ficagna.ativrepositiva;




import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CombinarFormas {
    private List<CalculadoraFormasGeometricas> formas = new ArrayList<>();

    public void adicionarForma(CalculadoraFormasGeometricas forma) {
        formas.add(forma);
    }

    public double calcularAreaCombinada() {
        double areaTotal = 0;
        for (CalculadoraFormasGeometricas forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }


}
