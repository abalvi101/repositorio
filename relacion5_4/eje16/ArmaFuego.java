package relacion5_4.eje16;

public abstract class ArmaFuego extends Arma {
    protected boolean cargada;

    public void cargar() throws MyException {
        if (cargada) {
            throw new MyException(111);
        } else {
            cargada = true;
        }
    }

    public boolean disparar() {
        return cargada;
    }
}
