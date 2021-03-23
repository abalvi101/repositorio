package relacion5_3.eje14;

import relacion5_3.eje13.Punto;

public class Bola {
    private int radio;
    private Punto centro;

    public Bola(int coordX, int coordY, int radio) {
        this.centro = new Punto(coordX, coordY);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    /* Idem
    public double area() {
        return 4 * Math.PI * Math.pow(radio, 2);
    } */

    public double volumen() {
        return 4/3 * Math.PI * Math.pow(radio, 3);
    }

    public boolean colision(Bola bola) {
        return this.centro.distancia(bola.centro) <= this.radio + bola.radio;
    }
}
