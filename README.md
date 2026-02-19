# 6.2.Bateria-de-ejercicios
UML CREADO

```mermaid
classDiagram

class CentroComercial {
    -String nombre
    -List~Tienda~ tiendas
    +CentroComercial(nombre)
    +agregarTienda(t : Tienda)
    +getTiendas() List~Tienda~
}

class Tienda {
    -String nombre
    -CentroComercial centroComercial
    +Tienda(nombre, centro)
    +getCentroComercial() CentroComercial
}

CentroComercial "1" --> "1..*" Tienda
Tienda "1" --> "1" CentroComercial
```
