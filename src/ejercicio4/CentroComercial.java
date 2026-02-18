package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class CentroComercial {

    private String nombre;
    private List<Tienda> tiendas;

    public CentroComercial(String nombre) {
        this.nombre = nombre;
        this.tiendas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
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