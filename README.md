# 6.2.Bateria-de-ejercicios
UML CREADO 
+------------------+
|   MetodoPago     | <<interface>>
+------------------+
| + procesar(importe : double) : void
+------------------+

        ▲
        |
+------------------+          +------------------+
|     Tarjeta      |          |      Paypal      |
+------------------+          +------------------+
| - numero : String|          | - email : String |
| - titular : String|         +------------------+
+------------------+          | + procesar(importe : double)
| + procesar(importe : double)
+------------------+

+------------------+
|      Carrito     |
+------------------+
|                  |
+------------------+
| + pagar(miMetodo : MetodoPago) : void
+------------------+
