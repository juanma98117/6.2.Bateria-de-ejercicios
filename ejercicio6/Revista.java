package ejercicio6;

public class Revista extends Recurso {

	private int NumeroEdicion;
	
	public Revista(int id, String titulo) {
		super(id, titulo);
		this.NumeroEdicion=NumeroEdicion;
	}

	public int getNumeroEdicion() {
		return NumeroEdicion;
	}

	public void setNumeroEdicion(int numeroEdicion) {
		NumeroEdicion = numeroEdicion;
	}
}

