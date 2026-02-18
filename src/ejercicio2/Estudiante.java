package ejercicio2;

public class Estudiante extends Personas {

    private String numeroExpediente;
    private String notaMedia;

public Estudiante(String nombre, String DNI, String numeroExpediente, String notaMedia) {
    super(nombre, DNI);
    this.numeroExpediente=numeroExpediente;
    this.notaMedia=notaMedia;

}
}
