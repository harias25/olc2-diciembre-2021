# Laboratorio Organización de Lenguajes y Compiladores 2 Sección C
## Practica 6

#### Instrucciones 
Se desarrollará un interprete que reciba como entrada un archivo de texto para ejecutar instrucciones básicas similares al lenguaje JAVA las cuales se iran definiendo y limitando en cada práctica.

##### Descripción de la practica
Con el inteprete construido en los laboratorios anteriores, se deben agregar las siguientes instrucciones.

###### Definición de Structs

Ya que se esta simulando un lenguaje similar a JAVA, se tienen algunas diferencias, como lo que son los *structs*, los cuales son una replica a los structs en C.

_Estos Structs tendran la siguiente definición_

``` java 
        struct [structure tag] {
            listado de declaraciones de variables primitivas, listas o structs
        } ; 
```

_Ejemplos de estas instrucciones_

``` java 
struct Books {
   string  title;
   string  author;
   string  subject;
   int   book_id;
};
    
```

###### Declaración de Structs

La declaración de dichos structs será de la misma manera que se realizan las declaraciones de variables primitivas, considerando que todas las variables internas del struct se inicializarán con valores por defecto.

_Ejemplos de estas instrucciones_

``` java 
Books libros1, libros2;

```

###### Acceso y Asignación a Structs

El acceso a dichos Structs se realizara la siguiente forma.

``` java 
Books libros1, libros2;

libros1.title = 'Compiladores 2';

println(libros1.tittle);

```

Considerar la validación de tipos de estos.
