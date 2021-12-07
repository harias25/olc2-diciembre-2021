# Laboratorio Organización de Lenguajes y Compiladores 2 Sección C
## Practica 7

#### Instrucciones 
Se desarrollará un interprete que reciba como entrada un archivo de texto para ejecutar instrucciones básicas similares al lenguaje JAVA las cuales se iran definiendo y limitando en cada práctica.

##### Descripción de la practica
Con el inteprete construido en los laboratorios anteriores, se deben agregar las siguientes instrucciones.

###### Arreglos 

Dentro de nuestro lenguaje podremos crear arreglos con una tamaño definido, estos arreglos pueden ser de una o muchas dimenciones y pueden ser de cualquier tipo.

_Su declaración será de la siguiente manera_

``` java 
        int arreglo1[10];
        int arreglo2[2][10];
```

###### Acceso y Asignación a Posiciones de los Arreglos

El acceso a dichos Structs se realizara la siguiente forma.

``` java 
int arreglo2[2][10];

arreglo2[0][0] = 10;

println(arreglo2[0][0]e);

```

Considerar la validación de tipos de estos y si existe la posición de los mismos.
