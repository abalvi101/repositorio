package relacion5_3.eje15;

import java.util.ArrayList;
import java.util.List;

public class Escuadron {
    private List<Soldado> soldados;

    public Escuadron(Soldado soldado) {
        this.soldados = new ArrayList<>();
        this.soldados.add(soldado);
    }

    public void addSoldado(Soldado soldado) {
        this.soldados.add(soldado);
    }

    public List<Soldado> getSoldados() {
        return soldados;
    }

    public float potenciaFuego() {
        float resultado = 0;
        for (Soldado soldado: this.soldados) {
            resultado += soldado.getPotenciaFuego();
        }
        return resultado;
    }
}
