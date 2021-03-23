package relacion5_4.eje16;

public class Pistola extends ArmaFuego {
    private int calibre;

    public Pistola(float potencia, int calibre, int rango, boolean cargada) throws MyException {
        setPotencia(potencia);
        setCalibre(calibre);
        setRango(rango);
        this.cargada = cargada;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) throws MyException {
        if (calibre < 15 || calibre > 50) {
            throw new MyException(333);
        } else {
            this.calibre = calibre;
        }
    }

    public float atacar() {
        float potenciaReal = potencia;
        if (calibre < 24) {
            potenciaReal *= 0.8;
        } else if (calibre > 42) {
            potenciaReal *= 1.2;
        }
        return distanciaEnemigo > rango ? rango/distanciaEnemigo*potenciaReal : potenciaReal;
    }
}
