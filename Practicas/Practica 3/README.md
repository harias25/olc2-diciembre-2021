# Laboratorio Organización de Lenguajes y Compiladores 2 Sección C
## Practica 3

#### Instrucciones 
Se desarrollará un interprete que reciba como entrada un archivo de texto para ejecutar instrucciones básicas similares al lenguaje JAVA las cuales se iran definiendo y limitando en cada práctica.

##### Descripción de la practica
Con el inteprete construido en los laboratorios anteriores, se deben agregar las siguientes instrucciones.

###### Declaración de Variables

Se deben de poder declarar variables de los siguientes tipos

    int
    double
    String
    boolean

Está declaración será igual a la de Java

``` java 
    int var1, var2;
    double a,b,c;
    String texto;
    boolean m;
```

Adicional se pueden declarar variables con un valor de asignación, en este caso limitaremos el lenguaje para que solo permita una variable cuando se tenga asignación.
Por ejemplo:

``` java 
    int numero = 10;
    double a = 10.5;
    String texto = "hola mundo";
    boolean m = false;
```

Se deben de considerar las reglas basicas como:

    No se permiten 2 variables con el mismo nombre.
    Se deven de validar que las variables no acepten otro tipo de dato que no sea el que ellas permiten.
    Se deben visualizar en la tabla de simbolos.

###### Asignación de Variables

Se debe permitir en el lenguaje poder asignar nuevos valores a las variables definidas y que estos puedan guardarse y actualizarse en su entorno.

``` java 
    numero = 25;
    a = (10/3) * 8;
    texto = "hola "+numero;
    m = true;
```

###### Acceso a Variables
Ya que la única forma que nuestro lenguaje puede acceder a una expresion es mediante nuestra función print o println, se deberá poder imprimir variables y retornará el valor que esta tenga. 

Ejemplo


``` java 
    print(numero);  //imprimirá 25, segun el orden de los ejemplos mostrados
    println(hola); // deberá arrojar un error porque no existe la variable
```

Adicional que se podran agregar estas variables para las expresiones que se tienen actualmente, como por ejemplo.

``` java 
    print(numero + 25);  //imprimirá 50
    println(a - 1 ); // imprimira 44.595
```
