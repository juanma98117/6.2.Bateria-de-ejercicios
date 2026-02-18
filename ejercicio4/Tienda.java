package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private String nombre;
    private List<Tienda> tiendas;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.tiendas = new ArrayList<>();
    }

    public List<Tienda> getTiendas() {
        return tiendas;
    }

    public void agregarTienda(Tienda tienda) {
        if (tienda != null && !tiendas.contains(tienda)) {
            tiendas.add(tienda);
        }
    }
}