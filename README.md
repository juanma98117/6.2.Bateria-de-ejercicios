# 6.2.Bateria-de-ejercicios
UML CREADO
+----------------------+
|        Persona       |
+----------------------+
| - nombre : String    |
| - dni : String       |
+----------------------+
| + Persona(nombre, dni)
| + getNombre() : String
| + getDni() : String
+----------------------+
           ▲
           |
           |
+------------------------------+
|          Estudiante          |
+------------------------------+
| - numeroExpediente : String  |
| - notaMedia : double         |
+------------------------------+
| + Estudiante(nombre, dni,
|    numeroExpediente, notaMedia)
| + getNumeroExpediente() : String
| + getNotaMedia() : double
+------------------------------+
