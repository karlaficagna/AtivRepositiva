package fundatec.ficagna.ativrepositiva;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculadoraFormasGeometricasTest {
    @Mock
    private AtivRepositivaApplication application;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

    }

    @Test
    void calcularAreaQuadradoTest() {
        Quadrado quadrado = new Quadrado(4);
        assertEquals(16, quadrado.calcularArea());
        assertEquals(16, quadrado.calcularPerimetro());
    }

    @Test
    void calcularAreaTriangulaoTest() {
        Triangulo triangulo = new Triangulo(3, 3, 4);
        assertEquals(4.47213595499958, triangulo.calcularArea());
        assertEquals(10, triangulo.calcularPerimetro());
    }

    @Test
    void calcularAreaRetangulaoTest() {
        Retangulo retangulo = new Retangulo(10, 5);
        assertEquals(50, retangulo.calcularArea());
        assertEquals(30, retangulo.calcularPerimetro());
    }

    @Test
    public void testCombinarFormas() {
        Quadrado quadrado = new Quadrado(4);
        Triangulo triangulo = new Triangulo(3, 3, 4);
        Retangulo retangulo = new Retangulo(10, 5);

        CombinarFormas formas = new CombinarFormas();
        formas.adicionarForma(quadrado);
        formas.adicionarForma(triangulo);
        formas.adicionarForma(retangulo);

        assertEquals(70.47213595499957, formas.calcularAreaCombinada());
    }

}