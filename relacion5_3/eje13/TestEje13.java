package relacion5_3.eje13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEje13 {
    private Circulo myCirculo;

    @BeforeEach
    public void inicializaTest() {
        myCirculo = new Circulo(5345, -34545, 203);
    }

    @Test
    public void testLongitud() {
        assert myCirculo.longitud() == Math.PI * 2 * myCirculo.getRadio();
    }

}
