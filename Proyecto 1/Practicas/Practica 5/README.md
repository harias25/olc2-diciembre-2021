# Laboratorio Organización de Lenguajes y Compiladores 2 Sección C
## Practica 5

#### Instrucciones 
Se desarrollará un interprete que reciba como entrada un archivo de texto para ejecutar instrucciones básicas similares al lenguaje JAVA las cuales se iran definiendo y limitando en cada práctica.

##### Descripción de la practica
Con el inteprete construido en los laboratorios anteriores, se deben agregar las siguientes instrucciones.

###### Definicion de Funciones y Procedimientos

Ya que se esta simulando un lenguaje similar a JAVA, se pueden definir Funciones y Procedimientos, estas deben ir declaradas hasta el inicio del programa, y ya no se podrá tener el código instrucciones sueltas mas que declaración de variables.

Por lo cual deberá de existir de manera obligatoria un metodo llamado *main()* para que el interprete inicie su ejecución desde este punto, unicamente permitirá de forma global declarar variables, definir structs y definir funciones y procedimientos.

_Los tipos de definiciones funciones y procedimientos serán los siguientes_

``` java 
        void procedimiento(){
            //instrucciones
        }

        void procedimiento_con_parametros(int a, String b){
            //instrucciones
        }

        int funcion(){
            //instrucciones
            return valor_entero;
        }

        void funcion_con_parametros(int a, String b){
            //instrucciones
            return valor_entero;
        }
```

Considerar lo siguiente:
        Las funciones deben de retornar un valor.
        Los procedimientos no deben retornar valores.
        El valor a retornar de una función debe ser del mismo tipo del declarado.
        No se permiten tener funciones y/o procedimientos con el mismo nombre (No existirá polimorfismo).
