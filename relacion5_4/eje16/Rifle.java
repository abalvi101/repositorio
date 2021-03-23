package relacion5_4.eje16;

public class Rifle extends ArmaFuego {

    public Rifle(float potencia, int rango, boolean cargada) throws MyException {
        setPotencia(potencia);
        setRango(rango);
        this.cargada = cargada;
    }

    public float atacar() {
        return distanciaEnemigo > rango ? rango/distanciaEnemigo*potencia : potencia;
    }
}
