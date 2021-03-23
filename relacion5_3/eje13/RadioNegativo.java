package relacion5_3.eje13;

public class RadioNegativo extends Exception{
    private int codigoError;

    public RadioNegativo(int codigoError) {
        super();
        this.codigoError = codigoError;
    }

    @Override
    public String getMessage() {
        String mensaje = "";

        switch (codigoError) {
            case 111:
                mensaje = "Error, el numero esta entre 0 y 10";
                break;
            case 222:
                mensaje = "Error, el numero esta entre 11 y 20";
                break;
            case 333:
                mensaje = "Error, el numero esta entre 21 y 30";
                break;
        }
        return mensaje;
    }
}
