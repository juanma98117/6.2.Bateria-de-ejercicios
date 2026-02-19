# 6.2.Bateria-de-ejercicios
```mermaid

classDiagram

class Computadora {
    
}

class PlacaBase {
   
}

class Raton {
   
}

Computadora "1" *-- "1" PlacaBase
Computadora "1" o-- "0..*" Raton

```
