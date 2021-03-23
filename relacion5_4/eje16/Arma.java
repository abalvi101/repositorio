package relacion5_4.eje16;

public abstract class Arma {
    protected float potencia;
    protected int rango;
    protected float distanciaEnemigo;

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) throws MyException {
        if (potencia < 0) {
            throw new MyException(222);
        } else {
            this.potencia = potencia;
        }
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) throws MyException {
        if (rango < 0 || rango > 100) {
            throw new MyException(222);
        } else {
            this.rango = rango;
        }
    }

    public float getDistanciaEnemigo() {
        return distanciaEnemigo;
    }

    public void setDistanciaEnemigo(float distanciaEnemigo) throws MyException {
        if (distanciaEnemigo < 0) {
            throw new MyException(555);
        } else {
            this.distanciaEnemigo = distanciaEnemigo;
        }
    }

    public abstract float atacar();
}
