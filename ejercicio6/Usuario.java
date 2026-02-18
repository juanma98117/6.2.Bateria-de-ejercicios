package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private int numCarnet;
    private List<Recurso> recursosPrestados;

    public Usuario(String nombre, int numCarnet) {
        this.nombre = nombre;
        this.numCarnet = numCarnet;
        this.recursosPrestados = new ArrayList<>();
    }

    public void añadirRecurso(Recurso recurso) {
    }

    public void eliminarRecurso(Recurso recurso) {
    }

    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumCarnet(int numCarnet) {
		this.numCarnet = numCarnet;
	}

	public void setRecursosPrestados(List<Recurso> recursosPrestados) {
		this.recursosPrestados = recursosPrestados;
	}

	public String getNombre() {
        return nombre;
    }

    public int getNumCarnet() {
        return numCarnet;
    }

    public List<Recurso> getRecursosPrestados() {
        return recursosPrestados;
    }
}