# 6.2.Bateria-de-ejercicios
UML CREADO 
+----------------------+
|      Recurso         |
+----------------------+
| - id : int           |
| - titulo : String    |
+----------------------+
| + prestar() : void   |
| + devolver() : void  |
+----------------------+
           ▲
           |
   ----------------
   |              |
+-----------+  +-------------+
|   Libro   |  |   Revista   |
+-----------+  +-------------+
| - isbn : String | - numeroEdicion : int |
+-----------+  +-------------+
|           |  |             |
+-----------+  +-------------+

+----------------------+
|      Usuario         |
+----------------------+
| - nombre : String    |
| - numCarnet : int    |
+----------------------+
| + getNombre() : String |
| + getNumCarnet() : int |
+----------------------+
            1
Usuario ---------------- 0..* Recurso
