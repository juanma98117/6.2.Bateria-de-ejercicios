package ejercicio3;

import java.util.ArrayList;

public class Computadora {

    private String marca;
    private PlacaBase placaBase; 
    private ArrayList<Raton> ratones;

    public Computadora(String marca, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.placaBase = new PlacaBase(modeloPlaca, chipsetPlaca);
        this.ratones = new ArrayList<>();
    }

    public void agregarRaton(Raton r) {
        ratones.add(r);
    }

    public void eliminarRaton(Raton r) {
        ratones.remove(r);
    }

    public ArrayList<Raton> getRatones() {
        return ratones;
    }

}