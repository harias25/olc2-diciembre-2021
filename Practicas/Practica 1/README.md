# Laboratorio Organización de Lenguajes y Compiladores 2 Sección C
## Practica 1

#### Instrucciones 
Se desarrollará un interprete que reciba como entrada un archivo de texto para ejecutar instrucciones básicas similares al lenguaje JAVA las cuales se iran definiendo y limitando en cada práctica.

##### Descripción de la practica

###### Operaciones Aritmeticas
El lenguaje utilizará una notación y precedencia estándar de las expresiones aritméticas siguientes

Suma +
Resta –
Multiplicación *
División /
Agrupación ()
Expresiones negativas –

Por ejemplo:
-25+10
-(4/2+7-3) - -6

###### Función Print
Se utilizara la función print para poder imprimir expresiones en consola, la cual tendrá la siguiente estructura:

``` python 
    print(Expresion);
```

Por ejemplo:
``` python 
    print(-25+10);
    print(-(4/2+7-3) - -6);
```


Por lo cual en dicha practica se debe dar inicio al desarrollo a dicho interprete para que pueda reconocer dichas expresiones y la función print