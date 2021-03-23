package relacion5_4.eje16;

public class Escopeta extends ArmaFuego {
    private boolean recortada;
    private float aumentoRecortada;

    public Escopeta(float potencia, int rango, boolean recortada, float aumentoRecortada, boolean cargada)
            throws MyException {
        setPotencia(potencia);
        setRango(rango);
        this.recortada = recortada;
        setAumentoRecortada(aumentoRecortada);
        this.cargada = cargada;
    }

    public boolean isRecortada() {
        return recortada;
    }

    public void setRecortada(boolean recortada) {
        this.recortada = recortada;
    }

    public float getAumentoRecortada() {
        return aumentoRecortada;
    }

    public void setAumentoRecortada(float aumentoRecortada) throws MyException {
        if (aumentoRecortada < 1.2 || aumentoRecortada > 2) {
            throw new MyException(666);
        } else {
            this.aumentoRecortada = aumentoRecortada;
        }
    }

    public float atacar() {
        float potenciaReal = recortada ? potencia*aumentoRecortada : potencia;
        return distanciaEnemigo > rango ? rango/distanciaEnemigo*potenciaReal : potenciaReal;
    }
}
