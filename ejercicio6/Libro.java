package ejercicio6;

public class Libro extends Recurso {

	private String isbn;
	
	public Libro(int id, String titulo) {
		super(id, titulo);
		this.isbn=isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
