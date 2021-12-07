# Laboratorio Organización de Lenguajes y Compiladores 2 Sección C
## Practica 4

#### Instrucciones 
Se desarrollará un interprete que reciba como entrada un archivo de texto para ejecutar instrucciones básicas similares al lenguaje JAVA las cuales se iran definiendo y limitando en cada práctica.

##### Descripción de la practica
Con el inteprete construido en los laboratorios anteriores, se deben agregar las siguientes instrucciones.

###### Sentencias de Condición

Se deben realizar las instrucciones necesarias para aceptar lo siguiente

    if
    if - else
    if - else if 
    if - else if - else
    Switch 
    default

_Ejemplos de estas instrucciones_

``` java 
    int x = 12;
    int y = 0;
    int z = 0;

    //if de una instrucción
    if( y !=0 ) z = x / y;

    //if else de una instrucción
    if( y !=0 ) z = x / y;
    else println("Atención! se pretende dividir por 0");


    //if else con n instrucciones
    if( y !=0 ) {
        z = x / y;
        println("El resultado es : " + z);
    }  else   {
        println("Atención! se pretende dividir por 0");
    }

    //if -else con anidaciones de otros if - else
    if ( x % 4 == 0 ) {
        if ( x % 100 == 0 ) {
            if ( x % 400 == 0 ) {
                println("Es bisiesto");
            } else {
                println("No es bisiesto");
            }
        } else  {
                println("Es bisiesto");
        }
    }  else {
            println("No es bisiesto");
    }


    //else if
    int time = 22;
    if (time < 10) {
        println("Good morning.");
    } else if (time < 20) {
        println("Good day.");
    } else {
        println("Good evening.");
    }

    //switch con default
    int day = 4;
    switch (day) {
    case 6:
        System.out.println("Today is Saturday");
        break;
    case 7:
        System.out.println("Today is Sunday");
        break;
    default:
        System.out.println("Looking forward to the Weekend");
    }

```

###### Sentencias de Repeticion

Se deben realizar las instrucciones necesarias para aceptar lo siguiente

    while
    do while
    for

_Ejemplos de estas instrucciones_

``` java 

    //while
    int i = 0;
    while (i < 5) {
        println(i);
        i=i+1;
    }

    //do while
    i = 0;
    do {
        println(i);
        i=i+1;
    }
    while (i < 5);

    //for
    for (int i = 0; i < 5; i++) {
        println(i);
    }

```

###### Sentencias de Transferencia

Dentro de las sentencias de repetición, se deben poder utilizar las siguientes sentencias de transferencia.

    Break
    Continue

_Ejemplos de estas instrucciones_

``` java 

//break
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}


//continue
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  println(i);
}

```