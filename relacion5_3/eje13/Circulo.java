package relacion5_3.eje13;

import relacion5_3.eje14.Bola;

public class Circulo {
    private int radio;
    private Punto centro;

    public Circulo(int coordX, int coordY, int radio) {
        this.centro = new Punto(coordX, coordY);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) throws RadioNegativo {
        if (radio < 0) {
            this.radio = radio;
        } else {
            throw new RadioNegativo(111);
        }
    }

    public double longitud() {
        return (2 * Math.PI * radio);
    }

    /* No me acordaba de que el circulo no tenía area :(
    public double area() {
        return (Math.PI * Math.pow(radio, 2));
    } */

    public boolean colision(Circulo circulo) {
        return this.centro.distancia(circulo.centro) <= this.radio + circulo.radio;
    }
}
