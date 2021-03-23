package relacion5_3.eje15;

public class Soldado {
    private String nombre;
    private String tipo;
    private float potenciaFuego;

    public Soldado(String nombre, String tipo, float potenciaFuego) throws Exception {
        this.nombre = nombre;
        this.tipo = tipo;
        setPotenciaFuego(potenciaFuego);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPotenciaFuego() {
        return potenciaFuego;
    }

    public void setPotenciaFuego(float potenciaFuego) throws Exception {
        if (potenciaFuego < 0) {
            throw new Exception();
        }
        this.potenciaFuego = potenciaFuego;
    }
}
