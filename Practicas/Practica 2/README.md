# Laboratorio Organización de Lenguajes y Compiladores 2 Sección C
## Practica 2

#### Instrucciones 
Se desarrollará un interprete que reciba como entrada un archivo de texto para ejecutar instrucciones básicas similares al lenguaje JAVA las cuales se iran definiendo y limitando en cada práctica.

##### Descripción de la practica
Con el inteprete construido en los laboratorios anteriores, se deben agregar las siguientes operaciones, las mismas deben ser poder usadas en la función print anterior.

###### Tipos de Datos Primitivo

Se deben de poder aceptar nuevos tipos de dato primitivos, los cuales son los siguiente

    Enteros
    Decimales
    Cadenas
    Booleanos (true y false)

###### Concatenación
Se deben de poder aceptar concatenación de textos con otros textos, si se concatena un valor numerico o booleano, tambien será posible.
Ejemplo

    ``` java 
    print("hola"+" mundo");  //salida: hola mundo
    println(2 +"=2");       //salida: 2=2
     
```

###### Operaciones Relacionales
El lenguaje utilizará una notación y precedencia estándar de las expresiones relacionales siguientes

    Menor <
    Mayor >
    Igual a ==
    Diferente a !=
    Menor igual a <=
    Mayor igual a >=

###### Operaciones Lógicas
El lenguaje utilizará una notación y precedencia estándar de las expresiones Lógicas siguientes
    
    AND &
    OR  |
    NOT !

###### Función Print y Println
Se utilizara la función print para poder imprimir expresiones en consola sin salto de linea y la println la cual si generará un salto de linea en la consola, las cuales tendrán la siguiente estructura:

``` java 
    print(Expresion);
    println(Expresion);
```
