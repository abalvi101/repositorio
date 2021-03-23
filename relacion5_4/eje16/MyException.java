package relacion5_4.eje16;

public class MyException extends Exception {
    private int codigoError;

    public MyException(int codigoError) {
        super();
        this.codigoError = codigoError;
    }

    public int getCodigoError() {
        return codigoError;
    }

    @Override
    public String getMessage() {
        String mensaje = "";

        switch (codigoError) {
            case 111:
                mensaje = "Error, el arma ya estaba cargada";
                break;
            case 222:
                mensaje = "Error, el rango debe estar comprendido entre 0 y 100";
                break;
            case 333:
                mensaje = "Error, el calibre debe estar comprendido entre 15 y 50";
                break;
            case 444:
                mensaje = "Error, la potencia debe ser positiva";
                break;
            case 555:
                mensaje = "Error, la distancia al enemigo debe ser positiva";
                break;
            case 666:
                mensaje = "Error, el aumento de potencia debe estar comprendido entre 1.2 y 2.0";
                break;
        }
        return mensaje;
    }
}
