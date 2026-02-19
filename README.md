UML CREADO
'''mermaid
classDiagram
direction TB
    class Usuario {
	    - String nombreUsuario
	    - String contraseña
	    + String correo
        + cambiarPassword(nueva : String) void
        - validarEmail() : boolean      

    }
    

'''
