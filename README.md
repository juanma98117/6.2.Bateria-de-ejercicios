# 6.2.Bateria-de-ejercicios
DIAGRAMA UML
+----------------------+
|      Computadora     |
+----------------------+
| - marca : String     |
| - placaBase : PlacaBase
| - ratones : ArrayList<Raton>
+----------------------+
| + Computadora(marca, modeloPlaca, chipsetPlaca)
| + agregarRaton(r : Raton) : void
| + eliminarRaton(r : Raton) : void
| + getMarca() : String
| + getPlacaBase() : PlacaBase
| + getRatones() : ArrayList<Raton>
+----------------------+
            ♦
            | 1
            | 
            | 1
     +------------------+
     |    PlacaBase     |
     +------------------+
     | - modelo : String|
     | - chipset : String|
     +------------------+
     | + PlacaBase(modelo, chipset)
     | + getModelo() : String
     | + getChipset() : String
     +------------------+

Computadora ◇────────── 0..* Raton

+------------------+
|      Raton       |
+------------------+
| - marca : String |
| - inalambrico : boolean |
+------------------+
| + Raton(marca, inalambrico)
| + getMarca() : String
| + isInalambrico() : boolean
+------------------+
