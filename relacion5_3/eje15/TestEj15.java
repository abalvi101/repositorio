package relacion5_3.eje15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import relacion5_3.eje15.Escuadron;
import relacion5_3.eje15.Soldado;

import static org.junit.jupiter.api.Assertions.*;

public class TestEj15 {
    private Soldado mySoldado;
    private Escuadron myEscuadron;

    @BeforeEach
    public void inicializaTest() throws Exception {
        mySoldado = new Soldado("Luis", "Recolector", 23);
        myEscuadron = new Escuadron(mySoldado);
    }

    @Test
    public void testEscuadron() throws Exception {
        assert myEscuadron.getSoldados().size() == 1;
        myEscuadron.addSoldado(new Soldado("Felipe", "lo", 12));
        assert myEscuadron.getSoldados().size() == 2;
        assert myEscuadron.potenciaFuego() == 35;
    }

    @Test
    public void testSoldado() {
        assertThrows(Exception.class, () -> new Soldado("pepe", "ki", -1));
    }
}
