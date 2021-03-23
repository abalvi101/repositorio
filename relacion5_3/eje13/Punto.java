package relacion5_3.eje13;
import java.lang.Math;

public class Punto {
    private int coordX;
    private int coordY;

    public Punto(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public double distancia(Punto punto) {
        return Math.sqrt(Math.pow(this.coordX + punto.coordX, 2) + Math.pow(this.coordY + punto.coordY, 2));
    }
}
