# 6.2.Bateria-de-ejercicios
UML CREADO
+-----------------------------+
|       CentroComercial       |
+-----------------------------+
| - nombre : String           |
| - tiendas : List<Tienda>    |
+-----------------------------+
| + CentroComercial(nombre)   |
| + agregarTienda(t : Tienda) |
| + getTiendas() : List<Tienda>
+-----------------------------+
            1
CentroComercial ---------------- 1..* Tienda

+-----------------------------+
|           Tienda            |
+-----------------------------+
| - nombre : String           |
| - centroComercial : CentroComercial
+-----------------------------+
| + Tienda(nombre, centro)    |
| + getCentroComercial()      |
+-----------------------------+
            1
