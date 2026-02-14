package ejercicio1;

public class Usuario {

	private String nombre;
	private String contrasena;
	public String correo;


	public Usuario(String nomnbre, String contrasena, String correo) {

		this.nombre=nombre;
		this.contrasena=contrasena;
		this.correo=correo;
	}
	public void cambiarContrasena(String nueva) {
		System.out.println("Contraseña cambiada correctamente, escribela en algun sitio que despues se te olvida");

	}
	
	private boolean validadEmail() {
		return true;
	}
}


