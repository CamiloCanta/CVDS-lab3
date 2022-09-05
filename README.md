# LABORATORIO #3 CVDS

Autores
=
- Julian Castillo Soto
- Camilo Cantillo Tatis

AeroDescuentos
=
Se está desarrollando para una aerolínea su módulo de liquidación de tiquetes aéreos. Para el mismo, se tiene 
una función que aplica descuentos a la tarifa base del vuelo dependiendo del tiempo de antelación de la reserva 
y la edad del pasajero. Los descuentos SON ACUMULABLES.
          Normativa 005, sobre los descuentos:
          -15% de descuento sacando el billete con antelación superior a 20 días. 
          -5% a los pasajeroscon edad inferior a 18 años y 8% a los pasajeros con edad superior a 65 años. 
La siguiente es la especificación de la función que se usará en el módulo del cálculo de los descuentos:

```
/**
calcular la tarifa de cada billete según el trayecto, la antelación 
en la que  se obtiene el billete y la edad del pasajero, de acuerdo 
con la normativa 005.
@param tarifaBase valor base del vuelo
@param diasAntelacion dias de antelación del vuelo
@param edad -edad del pasajero
@throws ExcepcionParametrosInvalidos [XXXXXXXXXXXXXXXXXXXXXXXXXXX]
**/
```

public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad)
  **1.De acuerdo con lo indicado,y teniendo en cuenta que NO hay precondiciones,en qué casos se debería
  arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación.**
  
  R:debería arrojar excepción en casos donde los años, Tarifa base o días de antelación sean negativos, además la tarifa base no debe ser 0, lo mismo que la edad.
  
  **2.En la siguiente tabla enumere un conjunto de clases de equivalencia que -según usted-creen una 
  buena división del conjunto de datos de entrada de la función anterior:**
  
  Considere los siguientes datos para tener en cuenta las clases de equivalencias:
  
      -Edad
      -Días de antelación
      -Tarifa
  ![image](https://user-images.githubusercontent.com/108955358/188339368-2f474619-2f06-4f8e-97e7-787f64ebcb1b.png)

  
  **3.Para cada clase de equivalencia, defina un casode prueba específico, definiendo: parámetros 
  de entrada y resultados esperados.**
  
     
  
          1.	
          Escenario: Ingreso de una edad negativa

          Dado: una edad de -1000


          Cuando: lo Introduzco como parámetro de la función

          Entonces: debería arrojarme una excepción de parámetro no valido

          2.	
          Escenario: Ingreso de una edad mayor a 100

          Dado: una edad de 1000


          Cuando: lo Introduzco como parámetro de la función

          Entonces: debería arrojarme una excepción de parámetro no valido

          3.	
           Escenario: Ingreso de una edad menor a 18 pero mayor a 0

          Dado: una edad de 15, una tarifa de 100000 y días de antelación de 14 


          Cuando: lo Introduzco como parámetro de la función

          Entonces: debería arrojarme la tarifa base con el descuento del 5 %
          4.
          Escenario: Ingreso de una edad mayor a 18 pero menor a 66

          Dado: una edad de 21, una tarifa de 100000 y días de antelación de 14 


          Cuando: lo Introduzco como parámetro de la función

          Entonces: debería arrojarme la tarifa base.
          5.
          Escenario: Ingreso de una edad mayor a 65 pero menor a 100

          Dado: una edad de 15, una tarifa de 100000 y días de antelación de 14 


          Cuando: lo Introduzco como parámetro de la función

          Entonces: debería arrojarme la tarifa base con el descuento del 8 %
          6.
          Escenario: Ingreso de una edad mayor a 100

          Dado: una edad de 150, una tarifa de 100000 y días de antelación de 14 


          Cuando: lo Introduzco como parámetro de la función

          Entonces: debería arrojarme excepción

          6.
          Escenario: Ingreso de días de antelación negativos

          Dado: una edad de 15, una tarifa de 100000 y días de antelación de -14 


          Cuando: lo Introduzco como parámetro de la función

          Entonces: debería arrojarme la excepción
          7.
          Escenario: Ingreso de los días de antelación no negativos, pero menores a los 21 días

          Dado: una edad de 15, una tarifa de 100000 y días de antelación de 18 


          Cuando: lo Introduzco como parámetro de la función

          Entonces: debería arrojarme la tarifa base 
          8.
          Escenario: Ingreso de los días de antelación mayores a 20

          Dado: una edad de 15, una tarifa de 100000 y días de antelación de 30


          Cuando: lo Introduzco como parámetro de la función

          Entonces: debería arrojarme la tarifa base con el descuento del 15 %
          9.
          Escenario: Ingreso una tarifa negativa

          Dado: una edad de 15, una tarifa de -100000 y días de antelación de 14 


          Cuando: lo Introduzco como parámetro de la función

          Entonces: debería arrojarme la excepción.
          10.
          Escenario: Ingreso de una tarifa correcta

          Dado: una edad de 21, una tarifa de 100000 y días de antelación de 14 


          Cuando: lo Introduzco como parámetro de la función

          Entonces: debería arrojarme la tarifa base 

  
  **4.A partir de las clases de equivalencia identificadas en el punto 2, identifique las condiciones límite o 
  de frontera de las mismas.**
  
   
  
      Edad
      -	Condiciones limites: 0,1,18,65,66,100
      Días Antelación
      -	Condiciones limites: 0,20,21
      Tarifas
      -	Condiciones limites: 0

  
  **5.Para cada una de las condiciones de frontera anteriores, defina casos de prueba específicos.**
  
  
  
  
        EDAD
        Escenario: Ingreso de una edad de 0

        Dado: una edad de 0, una tarifa de 100000 y días de antelación de 14 


        Cuando: lo Introduzco como parámetro de la función

        Entonces: debería arrojarme la Excepción.

        Escenario: Ingreso de una edad de 1

        Dado: una edad de 1, una tarifa de 100000 y días de antelación de 14 


        Cuando: lo Introduzco como parámetro de la función

        Entonces: debería arrojarme la tarifa base con el descuento del 5%.

        Escenario: Ingreso de una edad de 18

        Dado: una edad de 18, una tarifa de 100000 y días de antelación de 14 


        Cuando: lo Introduzco como parámetro de la función

        Entonces: debería arrojarme la tarifa base.

        Escenario: Ingreso de una edad de 65

        Dado: una edad de 65, una tarifa de 100000 y días de antelación de 14 


        Cuando: lo Introduzco como parámetro de la función

        Entonces: debería arrojarme la tarifa base.

        Escenario: Ingreso de una edad de 66

        Dado: una edad de 66, una tarifa de 100000 y días de antelación de 14 


        Cuando: lo Introduzco como parámetro de la función

        Entonces: debería arrojarme la tarifa base con el descuento del 8%.

        Escenario: Ingreso de una edad de 100

        Dado: una edad de 100, una tarifa de 100000 y días de antelación de 14 


        Cuando: lo Introduzco como parámetro de la función

        Entonces: debería arrojarme la excepción.
        DIAS ANTELACION
        Escenario: Ingreso días de antelación de 0

        Dado: una edad de 21, una tarifa de 100000 y días de antelación de 0 


        Cuando: lo Introduzco como parámetro de la función

        Entonces: debería arrojarme la tarifa base.

        Escenario: Ingreso días de antelación de 20

        Dado: una edad de 21, una tarifa de 100000 y días de antelación de 20 


        Cuando: lo Introduzco como parámetro de la función

        Entonces: debería arrojarme la tarifa base.

        Escenario: Ingreso días de antelación de 21

        Dado: una edad de 21, una tarifa de 100000 y días de antelación de 21 


        Cuando: lo Introduzco como parámetro de la función

        Entonces: debería arrojarme la tarifa base con el descuento del 21%.
        TARIFAS

        Escenario: Ingreso tarifa de 0

        Dado: una edad de 21, una tarifa de 0 y días de antelación de 10 


        Cuando: lo Introduzco como parámetro de la función

        Entonces: debería arrojarme Excepción.

  
