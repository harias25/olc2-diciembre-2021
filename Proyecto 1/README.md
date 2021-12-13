# Quetzal OCL2

## Tabla de Contenido
1. [Competencias Generales](#competenciasGenerales)
2. [Competencias Especificas](#competencias)
3. [Descripción ](#descripción)
4. [Flujo de la Aplicación](#flujo)
5. [Sintaxis de Quetzal](#sintaxis)
6. [Generación de Código de 3 direcciones](#3d)
7. [Reportes](#reportes)
8. [Restricciones y Entregables](#restricciones)

## Competencias Generales <a name="competenciasGenerales"></a>
Que el estudiante aplique la fase de síntesis del compilador para realizar un traductor e intérprete utilizando herramientas.

## Competencias Especifica <a name="competencias"></a>
-	Que el estudiante utilice un generador de analizadores léxicos y sintácticos para construir un traductor. 
-	Que el estudiante implemente la ejecución de dicha traducción utilizando traducción dirigida por la sintaxis haciendo uso de atributos heredados y sintetizados. 
-	Que el estudiante comprenda los conceptos acerca de traducciones. 
-	Que el estudiante maneje la pila que proporciona el analizador sintáctico para simular el paso de atributos heredados. 
-	Que el estudiante aplique los conocimientos aprendidos en clase para generar código intermedio. 

## Descripción <a name="descripción"></a>
Quetzal es un lenguaje de programación inspirado en C, su característica principal es la inclusión de tipos implícitos. El sistema de tipos de Quetzal realiza una formalización de los tipos de C y Java. Esto permite a los desarrolladores definir variables y funciones tipadas sin perder la esencia. Otra inclusión importante de Quetzal es la simplificación de los lenguajes C y Java para poder realizar diferentes instrucciones en menos pasos.

Adicional Quetzal tendrá 2 flujos, se podrá interpretar el código fuente ingresado y efectuar todas sus instrucciones, o bien se puede traducir este lenguaje a un lenguaje intermedio basado en un lenguaje de 3 direcciones, este se podrá ejectuar posteriormente en cualquier compilador de C, tomando en cuenta las reglas especificas de un lenguaje de 3 direcciones.
 
### **Componentes de la aplicación:** 
Se requiere la implementación de un entorno de desarrollo que servirá para la creación de aplicaciones en lenguaje Quetzal. 

#### **Componentes de la aplicación:** 
    Características básicas 
    •	Numero de línea y columna 
    •	Botón para interpretar 
    •	Botón para traducir
    •	Reporte de errores 
    •	Reporte de tabla de símbolos 
    •	Reporte de AST 
    •	Reporte Gramatical
    •	Salida del Código Intermedio

#### **Consola:**
    La consola es un área especial dentro del IDE que permite visualizar las notificaciones, errores, y advertencias que se produjeron durante el proceso de análisis de un archivo de entrada. 

## Flujo de la aplicación  <a name="flujo"></a>

A continuación, se explica el flujo de la aplicación. 
La aplicación es sencilla por lo que su funcionalidad se basa en interpretar, generar código intermedio y desplegar reportes. 

-	Interpreta: Esta opción nos va a permitir interpretar una entrada. El programa recibe un archivo de entrada de código de alto nivel y ejecuta las instrucciones.
-	Traducir: Esta opción nos va a permitir traducir una entrada. El programa recibe un archivo de entrada de código de alto nivel y traduce a código intermedio en la sintaxis de tres direcciones.  
-	Reportes: Esta opción nos va a permitir visualizar los reportes generados después de traducir una entrada. 
 
En la ejecución se debe implementar los dos métodos de recuperación: uno para los errores léxicos y sintácticos descartando hasta el “;”; y otro para los errores semánticos, se debe descartar la instrucción con error. 

![Flujo Aplicación](flujo_quetzal.png)


## Sintaxis de Quetzal <a name="sintaxis"></a>
A continuación, se detalla la sintaxis que tendrá Quetzal. Además de algunos archivos de entrada de prueba que podrán probar para familiarizarse con la sintaxis.

1. [Comentarios](#comentarios)
2. [Tipos](#tipos)
3. [Expresiones](#expresiones)
4. [Instrucciones](#instrucciones)
    1. [Impresión](#impresion)
    2. [Declaración y Asignación](#decyasi)
    3. [Llamada a Funciones](#llamadas)
    4. [Distintas Funciones Nativas](#nativas)
    5. [Funciones](#funciones)
    6. [Condicionales](#condicionales)
    7. [Loops](#loops)
        1. [While](#while)
        2. [Do While](#dowhile)
        3. [For](#for)
    8. [Arreglos](#arrays)
    9. [Structs](#structs)

## Comentarios <a name="comentarios"></a>

Los comentarios pueden ser:

- Una línea (//)
- Múltiples líneas (/* ... */)
```java
    /*
        Esto es un
        comentario de
        múltiples líneas
    */
```

## Tipos <a name="tipos"></a>

Quetzal aceptará distintos tipos de datos con los que cuenta Java y C. Entre ellos se aceptarán:

### **Nulo:**
Se representa con la palabra reservada `null`, la cual indica que no existe ningún valor.

### **int**

Valores numéricos enteros. Por ejemplo: `3`, `2`, `-1`, `-100`.

### **double**

Valores númericos con punto flotante. Por ejemplo: `3.1415`, `2.7182`, `0.5`.

### **boolean**

Los valores booleanos únicamente pueden ser `true` o `false`.

### **char**

Estos son literales de carateres, se definen con comillas simples. Por ejemplo: `'a'`, `'b'`, `'z'`.

### **String**

Estos representan cadenas de texto, se definen con comillas dobles. Por ejemplo: `"Hola"`, `"Mundo"`, `"!"`.

Los Strings también cuentan con operaciones especiales que se pueden realizar con estos. Se detalla más adelante en la sección de [_Expresiones_](#expresiones).

### **Arreglos**

Estos son un conjunto de valores indexados entre 1 hasta n, que pueden ser de diferentes tipos. Por ejemplo:

```java
[10, 20, 30, 40]
["Hola", "Mundo"]
[1, 2, 5, [1, 2]]
```

Los arreglos cuentan con distintas operaciones que se detallarán en la sección de [_Arreglos_](#arrays).

### **Struct**

Estos pueden contener cualquier tipo de dato en su interior, incluso otros struct, arreglos o arreglos de structs.:

```c
struct NOMBRE_STRUCT{
    LISTA_ATRIBUTOS
};
```

Y para crear una variable con nuestro Struct, se escribe:

```c
NOMBRE_STRUCT ID = NOMBRE_STRUCT(VALORES);
```

Un ejemplo de creación de struct podría ser:

```C
struct Rectangulo{
    int base,
    int altura
};
```

En la sección de [_Structs_](#structs) se detallará más al respecto de estos.

## Expresiones <a name="expresiones"></a>

Quetzal acepta operaciones aritmeticas, relacionales y logicas de la siguiente forma:

### Aritméticas
Entre las operaciones aritmeticas disponibles vamos a encontrar las siguientes:
- **Suma:** La suma de dos expresiones se define por el símbolo `+` 
- **Resta:** La resta de dos expresiones y la negación de una expresión aritmetica se define por el símbolo `-` 
- **Multiplicación:** La multiplicación de dos expresiones se define por el símbolo `*` 
- **División:** La división de dos expresiones se define por el símbolo `/`
- **Modulo:** El modulo entre dos expresiones se define por el símbolo `%` 
- **Nativas:** Quetzal posee 6 funciones nativas para la resolución de expresiones, entre ellas se encuentran:
- **pow:** Recibe como primer parametro la base y como segundo parametro la potencia a elevar.  Ejemplo: `pow(2,4)`
- **sqrt:**  Cálcula la raíz cuadrara de un número Ejemplo: `sqrt(4)`
- **sin:** Resuelve la función seno del número que se ingrese
- **cos:** Resuelve la función coseno del numero que se ingrese
- **tan:** Resuelve la función tangente del numero que se ingrese
```java
    //Se expresa de la siguiente manera:
    sin(134)
    log10(100)
    cos(var1)
    tan(12)
    sqrt(16)
```
### Relacionales
Entre las operaciones relacionales disponibles vamos a encontrar las siguientes:
- **Igualdad:** Esta se define por el símbolo `==`
- **Diferenciación:** Esta se define por el símbolo `!=`
- **Mayor que:** Esta se define por el símbolo `>`
- **Menor que:** Esta se define por el símbolo `<`
- **Mayor o igual que:** Esta se define por el símbolo `>=`
- **Menor o igual que:** Esta se define por el símbolo `<=`

### Lógicas
Entre las operaciones lógicas disponibles vamos a encontrar las siguientes:
- **AND:** Esta se define por el símbolo `&&`
- **OR:** Esta se define por el símbolo `||`
- **NOT:** Esta se define por el símbolo `!`

### Cadenas
Entre las operaciones con cadenas (strings) vamos a encontrar las siguientes:
- **Concatenación:** La unión de dos cadenas de texto se define por el símbolo `&`
  ```java
  "para" & "caidismo" = "paracaidismo"
  ```
- **Repetición:** Permite que una cadena de texto se repita cierto número de veces, esta se define por el símbolo `^`
  ```java
  "Cadena"^3 = "CadenaCadenaCadena"
  ```
- **Acceso a una pocisión:** El acceso a un elemento de una cadena se define de la siguiente manera: `string.caracterOfPosition(posición)`, el cual devolvera el caracter correspondiente a esa posición
    ```java
    animal = "Tigre";
    println(animal.caracterOfPosition(2)); //g
    ```
- **Acceso a una porción:** El acceso a una porción de una cadena se define de la siguiente manera: `string.subString(inicial,final)`, el cual devolvera la cadena correspondiente al intervalo definido.
    ```java
    animal = "Tigre";
    println(animal.subString(2,4)); //gre
    ```
- **Tamaño de una cadena:** La obtención del número de elementos de una cadena se define por la función `cadena.length()`
    ```java
    animal = "Tigre";
    println(animal.length()); //5
    ```
- **Cadena en mayusculas:** Una cadena puede ser convertida a mayusculas con la utilización de la función `cadena.toUppercase())`
    ```java
    animal = "Tigre";
    println(animal.toUppercase()); //TIGRE
    ```
- **Cadena en minusculas:** Una cadena puede ser convertida a mayusculas con la utilización de la función `cadena.toLowercase())`
    ```java
    animal = "Tigre";
    println(animal.toLowercase()); //tigre
    ```

### Operador ternario
El operador ternario es utilizado cuando se necesita entre diferentes expresiones a travez de una condición
```java
(EXPRESIÓN RELACIONAL O LOGICA) ? RESULTADO SI ES VERDADERO : RESULTADO SI ES FALSO
```
Ejemplo:
```java
respuesta = edad >= 50 ? "Puede vacunarse" : "No puede vacunarse";

println(animal == "Perro" ? 15 : 10);
```
  
## Instrucciones <a name="instrucciones"></a>

Quetzal contará con varias instrucciones para su ejecución, cada instrucción deber terminar con un punto y coma (`;`) siempre. Las instrucciones que Quetzal acepta son:

### Impresión <a name="impresion"></a>

Quetzal cuenta con 2 distintas instrucciones de imprimir.

```java
print(expresión);        // Esta imprime sin realizar un salto de línea
println(expresión);      // Esta imprime realizando un salto de línea
```

Para imprimir más de un valor por línea, se puede imprimir una secuencia de valores separados por comas. También dentro de las cadenas se pueden colocar cualquier expresión utilizando el operador `$`. Por ejemplo:

```java
println("+", "-");       // Imprime + -
print("El resultado de 2 + 2 es $(2 + 2)");  // Imprime El resultado de 2 + 2 es 4
println("$a $(b[1])"); // Imprime el valor de a y el valor de b[1]
```

Quetzal también tiene la opción de imprimir arreglos y struct. Por ejemplo:

```java
    a = [0, 1, 2];
    println(a);          // Imprime [0, 1, 2]
    s = Hora(10, 30);
    print(s);           // Imprime Hora(10, 30)
```

### Declaraciones y Asignaciones <a name="decyasi"></a>

Quetzal permite la declaración y asignación de variables, las NO variables pueden cambiar su tipo de dato en cualquier momento

- **Declaración:** Quetzal permite declarar variables de dos maneras:
```java
    tipo ID = Expresión;
    // ó
    tipo LISTA_ID;
```
Ejemplo:
```java
    int x = (3*5);
    double y = (10/4);
    String str = "Saludo";
    int var1, var2, var3;  // se inicializan con los valores por defecto de java
```

- **Asignación:** Quetzal permite asignar valores a variables existentes de la siguiente manera:
```java
    ID = Expresión;
```
Ejemplo:
```java
    var1 = "Adios";
    v = 89 - 9;
```

### Llamada a funciones <a name="llamadas"></a>

Una llamada a función es como un desvío en el flujo de la ejecución. En lugar de pasar a la siguiente sentencia, el flujo salta al cuerpo de la función, ejecuta esta y regresa para continuar después de la llamada a la función.

Para llamar a una función se realiza de la siguiente manera:

```java
NOMBRE_FUNCION(LISTA_PARAMETROS);
```
Ejemplo:
```java
ordenamiento(arr1,arr2);
imprimirLista(lista);
nuevaLinea();
```

Si la función cuenta con más de un parámetro estos se separan por medio de `,`. Además es importante tener en cuenta que cuando se pasa un arreglo o struct como argumento de una función, en realidad se pasa una referencia de este. Por lo que cualquier cambio que se realice al parámetro, se podrá observar después de salir de la función.

Las llamadas a funciones también se pueden utilizar en expresiones, debido a que existen funciones que retornan un valor.

### Distintas Funciones Nativas <a name="nativas"></a>

Quetzal utiliza diversas funciones nativas para sus expresiones, estas son:
- **tipo.Parse(string):** Toma una cadena y la convierte al tipo de numero que se le indice si es posible.
```java
    int.parse("8200")
    ó
    double.parse("3.13159")
    ó
    boolean.parse("1")
```
- **toInt:** Convierte un número flotante a un número entero sin redondearlo
```java
    toInt(3.99999)  // retorna 3
```
- **toDouble:** Convierte un número entero a un número flotante
```java
    toDouble(34)  // retorna 34.0
```
- **String:** Convierte el argumento en una cadena, puede usarse en cualquier tipo de dato excepto null
```java
    string(45.87)  // retorna "45.87"
    string([1,2,3])  // retorna "[1,2,3]"
```
- **typeof:** Muestra el tipo del argumento
```java
    typeof(5 * 5) // int
```

### Funciones <a name="funciones"></a>

Las funcioens son secuencias de sentencias que ejecuta una operación que nosotros deseamos. Cuando se crea una función se especifica su nombre y secuencia de sentencias. Luego, ya se puede llamar a estas usando su nombre y los parámetros solicitados. Se definen las funciones en Quetzal así:

```java
TIPO NOMBRE_FUNCION(LISTA_PARAMETROS){
    LISTA_INSTRUCCIONES
}
```

Por ejemplo:

```java
TIPO imprimirHola(){
    print("Hola")
    println(" Mundo");
}
```

Además, los parámetros de las funciones vendrán separadas por `,` y podrán o no llevar tipo de dato.

```java
TIPO sumar(int num1, double num2){
    return num1 + toInt(num2);
}
```

Hay que tomar en cuenta que las variables y parámetros que se creen dentro de una función son locales, es decir que únicamente existen dentro de la función.

Las funciones también pueden llamarse a sí mismas. Lo que permite una gran variedad de aplicaciones en estructuras de datos y algoritmos de ordenamiento.

### Condicionales <a name="condicionales"></a>

Quetzal cuenta con sentencias condicionales, lo que permite que un bloque de codigo pueda ser o no ejecutado. Estas se definen por `if`,`if...else` y `if...else if` y adicional con la sentencia switch case. Su estructura es la siguiente:
```java

if (CONDICION){
    LISTA_INTRUCCIONES
}

if (CONDICION)
    INSTRUCCION

if(CONDICION1){
  LISTA_INTRUCCIONES
}
else if(CONDICION1){
  LISTA_INTRUCCIONES
}
else{
    LISTA_INTRUCCIONES
}


switch(expression) {
  case x:
    LISTA_INTRUCCIONES
    break;
  case y:
    LISTA_INTRUCCIONES
    break;
  default:
    LISTA_INTRUCCIONES
}

// el break puede ser opcional, se manejará igual que un switch de java

```
Ejemplo:
```java
if(x == 8){
    int var1 = (x + 8);
    println(sqrt(var1));
}

if(x == 8){
    int var1 = (x + 8);
    println(sqrt(var1));
}
else if(x < 8){
    double var1 = (x/3);
    println(sin(var1));
}
else
    println("Error");


int day = 4;
switch (day) {
  case 1:
    println("Monday");
    break;
  case 2:
    println("Tuesday");
    break;
  case 3:
    println("Wednesday");
    break;
  case 4:
    println("Thursday");
    break;
  case 5:
    println("Friday");
    break;
  case 6:
    println("Saturday");
    break;
  case 7:
    println("Sunday");
    break;
}
// Outputs "Thursday" (day 4)

```
### Loops <a name="loops"></a>

Quetzal cuenta con sentencias iterativas, lo que permite ejecutar repetidamente un bloque de sentencias. Existen 2 de estas, el ciclo `while`, el ciclo `do while` y el ciclo `for`.

#### While<a name="while"></a>

La sentencia `while` sigue la siguiente estructura:

```java
while (CONDITION) {
  LISTA_INTRUCCIONES
}
```
Ejemplo:
```java
int i = 0;
while (i < 5) {
  println(i);
  i++;
}
```

Y se ejecutará hasta que la condición del while se vuelva __false__. De manera más formal, el flujo de un while es el siguiente:

1. Se determina si la condición es __true__ o __false__.
2. Si es __false__, se sale de la sentencia `while` y continúa la ejecución con la siguiente sentencia.
3. Si es __true__, ejecuta cada una de las sentencias en la lista de instrucciones.

#### Do While<a name="dowhile"></a>
La sentencia `do while` sigue la siguiente estructura:

```java
do {
  LISTA_INSTRUCCIONES
}
while (CONDICION);
```
Ejemplo:
```java
int i = 0;
do {
  println(i);
  i++;
}
while (i < 5);
```

Se ejecutará el código la primera vez y se seguira ejecutando hasta que la condición del while se vuelva __false__. De manera más formal, el flujo de un do while es el siguiente:

1. Se ejecuta el bloque del codigo
2. Se determina si la condición es __true__ o __false__.
2. Si es __false__, se sale de la sentencia `do while` y continúa la ejecución con la siguiente sentencia.
3. Si es __true__, ejecuta cada una de las sentencias en la lista de instrucciones.

#### For <a name="for"></a>

La sentencia `for` en Quetzal tiene la siguiente estructura:

```java
for (declaracion ó asignacion; condicion; instruccion) {
  LISTA_INSTRUCCIONES
}
```

Algunos ejemplos de for en Quetzal son:

```java
for (int i = 0; i < 5; i++) {
  println(i);
}
```

Tambien existen otro tipos de for mas complejos ya otros tipos de datos

```java
for letra in "Hola Mundo!"  // Recorre las letras de la cadena
{
    print(letra, "-");      // Imprime H-o-l-a-M-u-n-d-o-!
}

String cadena = "OLC2";
for letra in cadena
{
    print(letra, "-");      // Imprime O-L-C-2
}
    
for animal in ["perro", "gato", "tortuga"]
{
    println("$animal es mi favorito");
    /* Imprime
        perro es mi favorito
        gato es mi favorito
        tortuga es mi favorito
    */
}

int[] arr = [1,2,3,4,5]
for numero in arr[2:4]{
    print(numero, " ")      // Imprime 2 3 4
}
```

Hay que tomar en cuenta en los arreglos que también puede ser un rango de algún arreglo. Por ejemplo:

```java
for it in a[begin:end]{
    // Haz algo
}
```

Dentro de los ciclos también existen las sentencias de control `break` y `continue`. Las cuales, una termina el bucle y la otra regresa al inicio del bucle ignorando las sentencias faltantes.

### Arreglos <a name="arrays"></a>

Como se a mencionado Quetzal cuenta con arreglos, los cuales pueden ser definidos mediante una sintaxis. Los valores de los arreglos solo pueden ser del tipo definido en la variable o arreglos del mismo tipo.

```java
[8,2,3,[1,2,3]]
``` 
Para acceder a una posición en específico del arreglo, se debe definir una expresión que de como resultado un numero entero dentro de corchetes. los indices en Quetzal inician desde el numero 0 en adelante.
```java
String[] arr = ["H","O","L","A"];
print(arr[1]) //O
```
Se debe de validar que el valor minimo sea 0 y el máximo no debe de exceder del tamaño del arreglo, caso contrario se deberá de reportar un error.

Quetzal tambien permite que se acceda a una porción de un arreglo, esto se define mediante la sintaxis `begin:end`, el cual debe ir dentro de corchetes y devolvera un arreglo con los limites establecidos. Se debe tomar en cuenta que las palabras `begin` y `end` pueden ser utilizadas para indicar el inicio y el final del arreglo respectivamente

```java
int[] arr = [1,2,3,4,5,6];
print(arr[2:4]); //[2,3,4]

print(arr[begin:4]) //[1,2,3,4]
print(arr[4:end]) //[4,5,6]
``` 
Se debe de validar que el valor minimo sea 0 y el máximo no debe de exceder del tamaño del arreglo, caso contrario se deberá de reportar un error.


#### **Copiar un arreglo:**
Quetzal permite crear una copia de un arreglo utilizando el símbolo `#`, es útil hacer una copia antes de realizar operaciones que las modifiquen.
```java
int[] arr = [1,2,3,4,5,6];
int[] arr2 = #arr;

arr[2] = 0;

print(arr) //[1,0,3,4,5,6]
print(arr2) //[1,2,3,4,5,6]
``` 
#### **Funciones nativas con arreglos:**
Quetzal cuenta con 2 funciones nativas con arreglos, en los que podemos encontrar:
- **Push:** inserta un nuevo valor al final del arreglo, se define como:
```java
    nombre_arreglo.push(expresion);
```
Ejemplo:
```java
int[] arr = [1,2,3,4,5,6];
arr.push(7); // arr = [1,2,3,4,5,6,7]
```
- **Pop:** elimina y devuelve el ultimo valor de un arreglo, se define como:
```java
nombre_arreglo.pop();
```
Ejemplo:
```java
int[] arr = [1,2,3,4,5,6];
arr.pop(); // retorna 6, arr = [1,2,3,4,5]
```
**Length:** La obtención del tamaño de un arreglo, se define como:
```java
arreglo.length();
```
Ejemplo:
```java
int[] arr = [1,2,3,4,5,6];
arr.length(); // 6
```

#### **Operador punto con arreglos:**
Quetzal permite la utilización del operador numeral (`#`) para realizar diferentes operaciones aritmeticas, trigonometricas, relaciones o cualquier otro tipo de función sobre cada valor en un arreglo.
```java
int[] arr = [1,2,3];
print(arr#*2) //[2,4,6]

double[] arr2 = sin#(arr) //[0.8415, 0.9093, 0.1411]
```

### Structs <a name="structs"></a>

Como se menciono en secciones anteriores, Quetzal cuenta con tipos compuestos que los desarrolladores podrán definir mediante una sintaxis. Para la declaración de estos se utiliza la siguiente sintaxis:

```java
// Struct
struct NOMBRE_STRUCT
{
    LISTA_ATRIBUTOS
};

```

Y para la creación de variables con nuestro Struct, ya sea mutable e inmutable:

```java
NOMBRE_STRUCT ID = NOMBRE_STRUCT(LISTA_VALORES);
```

Siendo los valores los correspondientes a sus atributos en la lista de atributos.

Los atributos de los Struct pueden ser utilizados como parte de cualquier expresión. Para acceder a los atributos de los Struct, se utiliza la notación `.`.

```java
ID.ID
```

También si nosotros deseamos modificar únicamente uno de los atributos de nuestro Struct, ahí es donde entra la importancia de los dos tipos de Struct en Quetzal.

```java
X.atributo = expresión
```

Otros aspectos importantes de los Structs es que estos pueden ser llamados como parámetros en las funciones y, al igual que los arreglos, se pasan por referencia. Por lo que el valor de los atributos de los Structs también cambia. Por ejemplo:

```java
struct Estructura{
    int x
};

function cambiarAtributo(Estructura s){
    s.x = 10;
}

Estructura a = Estructura(0);
println(a);             // Imprime 'Estructura(0)'
println(a.x);           // Imprime 0

cambiarAtributo(a);
println(a);             // Imprime 'Estructura(10)'
println(a.x);           // Imprime 10
```

Se debe de tomar en cuenta que los Struct se pueden utilizar como retorno de una función.

Otros aspectos importantes de los Structs es que si estos tienen internamente otro struct dentro de el, se puede inicializar de 2 formas.

```java
struct Estructura{
    int x,
    Estructura e
};

Estructura a = Estructura(0, null);
println(a);             // Imprime 'Estructura(0, null)'

// o tambien se puede declarar 
Estructura b = Estructura(1, a);
println(b);             // Imprime 'Estructura(1, Estructura(0, null))'


```
## Generación de Código de 3 direcciones <a name="3d"></a>
Cuando el compilador termine la fase de análisis de un programa realizará una transformación a una representación intermedia equivalente al código de alto nivel.  
Ya que código intermedio no es en sí un lenguaje ya definido sino un concepto, por facilidades de calificación y de pruebas se utilizará la estructura del lenguaje C como referencia a código intermedio, manejando ciertas limitaciones para que se apliquen correctamente los conceptos de generación de código intermedio.


### **Tipos de Dato**
El lenguaje solo acepta tipos de dato numéricos, es decir tipos int y float. Por facilidad se recomienda trabajar todas las variables como tipo float.

Consideraciones: 
- Está prohibido el uso de otros tipos de dato. 
- Las estructuras Heap y Stack se realizan por medio de arreglos de tipo float. 
- El uso de arreglos está permitido, queda a discreción del estudiante como implementarlo

### **Temporales**
Los temporales serán creados por el compilador en el proceso de generación de código intermedio. Estos serán variables de tipo float, el identificador asociado queda a discreción del estudiante, pero se recomienda utilizar la que se muestra a continuación. 

```c
t[0-9]+ 
 
t1 t13924 
```

### **Etiquetas**
Las etiquetas serán creadas por el compilador en el proceso de generación de código intermedio. El identificador asociado a las etiquetas queda a discreción del estudiante, aunque se recomienda utilizar la que se muestra a continuación. 
```c
L[0-9]+ 
 
L1 
L43 
```
### **Identificadores**
Un identificador será utilizado para dar un nombre a variables, métodos o estructuras. Es una secuencia de caracteres alfabéticos [A-Z a-z] incluyendo el guion bajo [_] o dígitos [0-9] que comienzan con un carácter alfabético o guion bajo. 

```c
_id1 
Id1 
Id_32 
```
### **Comentarios**
Un comentario es un componente léxico del lenguaje que no es tomado en cuenta para el análisis sintáctico de la entrada. Existirán dos tipos de comentarios:  
-	Los comentarios de una línea que serán delimitados al inicio con los símbolos “//” y al final con un carácter de finalización de línea  
-	Los comentarios con múltiples líneas que empezarán con los símbolos “/*” y terminarán con los símbolos “*/”. 

```c
// COMENTARIO DE UNA LINEA 
 
/** 
* COMENTARIO MULTILINEA 
*/ 

```
### **Operadores aritméticos**
Las operaciones aritméticas contarán con un argumento 1, argumento 2, campo para el resultado y un operador perteneciente a la siguiente tabla: 
![Operadores Aritmeticos](aritmeticos3d.png)

Consideraciones 
	- 	Únicamente se permite el uso de dos argumentos en una expresión. 

### **Saltos**
Para definir el flujo que seguirá el intérprete se contará con bloques de código, estos bloques están definidos por etiquetas y saltos, los saltos son aquellos que, definiendo una etiqueta y una posible condición, el flujo del código se desplaza hasta el bloque contenido en luego de dicha etiqueta. El lenguaje C cuenta con 2 tipos de saltos, los cuales son:  
- Salto condicional: Contará con una condición para decidir si se realiza el salto o no. 
-	Salto incondicional: Se realizará el salto siempre. 
-	
#### **Saltos incondicionales **
Los saltos incondicionales contarán únicamente con resultado y operador, donde el resultado contendrá la etiqueta destino y el operador estará definido por la instrucción goto. Este realizará el salto hacia una etiqueta que se le especifique. 

```c
goto L1;  
printf(“%c”, 64); //Esta instruccion no se ejecuta L1: 
T2 = 100; 
```
#### **Saltos condicionales**
Para simular los saltos condicionales se utilizará la instrucción IF del lenguaje C que tendrá como condición una expresión relacional. 
![Saltos Condicionales](saltos3d.png)

```c
If(5 < 10) goto L1; goto L2; 
L1: 
//código si la condición es verdadera 
 
L2: 
//código si la condición es falsa 

```
Consideraciones 
-	Existen expresiones booleanas de uno y dos argumentos, tal como se muestra en la Figura 6.37 del libro. Las expresiones booleanas con operadores relacionales se traducen en instrucciones if con un salto para verdadero y otro salto para falso, página 404 del libro. 
-	La instrucción If solo permite una instrucción, está prohibido el uso de if anidados. 
-	No se permite el uso de la instrucción Else. 

### **Asignación a temporales**
La asignación nos va a permitir cambiar el valor de los temporales, para lograrlo se utiliza el operador igual, este permite una asignación directa o una expresión. 

```c
//Entrada codigo alto nivel 
Console.log(1+2*5); 
 
//Salida codigo intermedio en lenguaje C 
T1 = 2 * 5; 
T2 = 1 + T1; 
 
Print(“%d”, T2);  
```

### **Métodos**
Estos son bloques de código a los cuales se accede únicamente con una llamada al método. Al finalizar su ejecución se retorna el control al punto donde fue llamado para continuar con las siguientes instrucciones.

```c
function funcion1(number a, number b) : number{     number c = a + b;     return c; 
} 
 
void funcion1(){ 
    T1 = P + 1; 
    T2 = STACK[T1]; //Variable a 
 
    T3 = P + 2; 
    T4 = STACK[T3]; //Variable b 
 
    T5 = T2 + T4; //a + b 
    T6 = P + 3; 
    STACK[T6] = T5; //Variable c 
 
    T7 = P + 3; 
    T8 = STACK[T7]; //Obtengo la Variable c 
    STACK[P] = T8; //Guardo el valor que retorna la funcion     
    goto L0; //Simulacion de un return con saltos a etiquetas 
 
    L0: //Etiqueta de retorno     
    return; 
}  
```

Consideraciones 
-	Está prohibido el uso de paso de parámetros en los métodos, el estudiante debe utilizar la pila para el paso de parámetros. 
-	Los métodos solo pueden ser de tipo void. 
-	Al final de cada método incluir la instrucción “return;”. 

### **Llamadas Métodos**
Esta instrucción nos permite invocar métodos. 

```c
Identificador(); 
 
// Al finalizar la ejecución del método se ejecutan las instrucciones posteriores a la llamada 
 
Void main(){ 
   Funcion1(); // Se llama a la funcion1 desde el metodo main 
  return;  
} 
 
Void Funcion1(){   printf(“%d”, 100); 
  return;  
} 

```
Consideraciones 
Al hacer la llamada el flujo cambia y empieza a ejecutar las instrucciones del método, al finalizar regresa al punto donde fue llamado y sigue ejecutando las siguientes instrucciones

### **Prinf**
Su función principal es imprimir en consola un valor definido según el formato del parámetro que se le asigne, la sintaxis y parámetros permitidos son los siguientes: 

![Saltos Condicionales](prinf3d.png)

```c
printf(“%e”, (int)900) // imprime 900 
 
printf(“%c”, (char)65) // imprime A 
 
print(“%f”, (float)65.4) // imprime 65.4  
```

### **Estructuras en tiempo de ejecución**
El proceso de compilación genera el código intermedio y este se va a ejecutar, siendo indispensable para el flujo de la aplicación. En el código intermedio no existen cadenas, operaciones complejas, llamadas a métodos con parámetros y muchas otras cosas que sí existen en los lenguajes de alto nivel. 
Para el proyecto se va a contar con 2 estructuras lineales y por convención llevaran el nombre de stack y heap, estas nos van a servir para almacenar los valores de nuestros temporales y poder hacer la simulación de ejecución del código intermedio. 

### **Estructuras en tiempo de ejecución **
El proceso de compilación genera el código intermedio y este se va a ejecutar, siendo indispensable para el flujo de la aplicación. En el código intermedio no existen cadenas, operaciones complejas, llamadas a métodos con parámetros y muchas otras cosas que sí existen en los lenguajes de alto nivel. 
Para el proyecto se va a contar con 2 estructuras lineales y por convención llevaran el nombre de stack y heap, estas nos van a servir para almacenar los valores de nuestros temporales y poder hacer la simulación de ejecución del código intermedio. 

#### **STACK**
El stack es la estructura que se utiliza en código intermedio para controlar las variables locales, y la comunicación entre métodos (paso de parámetros y obtención de retornos en llamadas a métodos). Se compone de ámbitos, que son secciones de memoria reservados exclusivamente para cierto grupo de sentencias.  
Cada llamada a método o función que se realiza en el código de alto nivel cuenta con un espacio propio en memoria para comunicarse con otros métodos y administrar sus variables locales. Esto se logra modificando el puntero del Stack, que en el proyecto se identifica con la letra P, para ir moviendo el puntero de un ámbito a otro, cuidando de no corromper ámbitos ajenos al que se está ejecutando. 
El puntero se identifica con la letra “P” y este contendrá la dirección de memoria donde comenzará el ámbito actual, su asignación se realizará exactamente igual que a como los terminales.

```c
float p; 
 
P = P + 1; 
```
#### **HEAP**
Es la estructura de control del entorno de ejecución encargada de guardar las referencias a variables globales o valores de cadenas y arreglos. El puntero se definirá con el identificador H y a diferencia de P (que aumenta y disminuye según lo dicta el código intermedio), este únicamente aumenta y aumenta, su función es brindar siempre la próxima posición libre de memoria.  
Esta estructura también será la encargada de almacenar las cadenas de texto, guardando únicamente en cada posición el ASCII de cada uno de los caracteres que componen la cadena a guardar. 

```c
// Puntero H 
H = H + 1; 
T1 = H;  
```
#### **Acceso y asignación a estructuras en tiempo de ejecución**
La sintaxis para acceso o asignación es la siguiente. 
```c
//Asignacion 
Heap[0] = T1; 
Stack[P] = 100; 
 
 
//Acceso 
T1 = Heap[0]; 
T2 = Stack[P]; 
```
Consideraciones 
-	La asignación a las estructuras se realiza por medio de temporales o valores constante, no se permite el uso de expresiones aritméticas o lógicas para la asignación a estas estructuras. 
-	El acceso a las estructuras se realiza por medio de temporales, no se permite la asignación a una estructura mediante el acceso a otra estructura, es decir “stack[0] = heap[100];”. 
-	Si el acceso a las estructuras se hace por medio de temporales, se debe realizar un casteo ya que los temporales son de tipo float. Ej. “stack[(int)t1] = 1”. 

### **Encabezado**
En esta sección se definirán todas las variables y estructuras a utilizar. Únicamente en esta sección se permite el uso de declaraciones, no se pueden realizar declaraciones adentro de métodos. La estructura del encabezado se muestra a continuación. 

```c
#include <stdio.h> //Importar para el uso de Printf 
  
float heap[16384]; //Estructura para heap float stack[16394]; //Estructura para stack float p; //Puntero P float h; //Puntero H 
float t1, t2, t3, t4, t5, t6, t7, t8, t9, t10; //Lista de temporales utilizados  
```

### **Método Main**
En este método iniciará el flujo de ejecución del código traducido. Su estructura es la siguiente: 
```c
void main() {     //Instrucciones 
    return; 
} 
```

## Reportes <a name="reportes"></a>

### **Tabla de símbolos**
Este reporte mostrará la tabla de símbolos durante (utilizando la función graficar_ts()) y después de la ejecución del archivo. Se deberán de mostrar todas las variables, funciones y procedimientos que fueron declarados, así como su tipo y toda la información que el estudiante considere necesaria. 

### **AST**
Este reporte mostrara el árbol de análisis sintáctico que se produjo al analizar el archivo de entrada. Este debe de representarse como un grafo, se recomienda se utilizar Graphviz. El Estudiante deberá mostrar los nodos que considere necesarios y se realizarán preguntas al momento de la calificación para que explique su funcionamiento. 

### **Reporte de errores**
El traductor e intérprete deberá ser capaz de detectar todos los errores que se encuentren durante el proceso de traducción. Todos los errores se deberán de recolectar y se mostrará un reporte de errores en el que, como mínimo, debe mostrarse el tipo de error, su ubicación y una breve descripción de por qué se produjo. 
Los tipos de errores se deberán de manejar son los siguientes: 

- Errores léxicos. 
-	Errores sintácticos. 
-	Errores semánticos 

La tabla de errores debe contener la siguiente información: 
-	Línea: Número de línea donde se encuentra el error. 
-	Columna: Número de columna donde se encuentra el error. 
-	Tipo de error: Identifica el tipo de error encontrado. Este puede ser léxico, sintáctico o semántico. 
-	Descripción del error: Dar una explicación concisa de por qué se generó el error. 
-	Ámbito: Si fue en una función(decir en cual fue) o en el ámbito global. 

Consideraciones 
Se deben reportar errores tanto en tiempo de traducción como tiempo de ejecución. Queda a discreción del estudiante si presentarlos en reportes separados o en un mismo reporte especificando en qué fase ocurrió el mismo. 

### **Reporte gramatical**
Se debe crear en la carpeta del equipo un archivo con Markdown que muestre las dos gramáticas con sintaxis BNF. En otro documento se debe mostrar la definición dirigida por la sintaxis con la gramática seleccionada, indicando que expresiones se utilizaron, precedencia, símbolos terminales y no terminales, y las reglas semánticas.  
 
Tomar en cuenta que no es el código escrito, sino es un reporte de explicación generado automáticamente, diferente del producto entregable del proyecto que es más enfocado a la construcción del intérprete. Este reporte está enfocado más a la ejecución específica. 
 
### **Manual técnico y de usuario**
 
En la carpeta del equipo se debe crear con Markdown un archivo de manual técnico y otro de manual de usuario. Se puede utilizar cualquier referencia bibliográfica para elaborar los manuales, se sugiere ver este enlace del MIT: 
https://web.mit.edu/course/21/21.guide/docution.htm 


## Restricciones y Entregables <a name="restricciones"></a>

### **Restricciones**
- La herramienta para generar los analizadores del proyecto será JISON. La documentación se encuentra en el siguiente enlace http://zaa.ch/jison/docs/
- No se pertiten el uso de Frameworks para el frontend como Vue, Angular o React, se deberá desarrollar un html simple con las importaciones de los js del interprete.
-	Copias de proyectos tendrán de manera automática una nota de 0 puntos y serán reportados a la Escuela de Ciencias y Sistemas los involucrados. 
-	El único método de calificación será por medio de Github-pages, si no esta publicado se tendrá una nota de de 0 puntos.
-	El desarrollo y entrega del proyecto es individual o en parejas. 
-	Únicamente se permite el uso de las instrucciones del lenguaje C establecidas en el enunciado.  

### **Consideraciones**
- No hay requerimientos mínimos. 
- Durante la calificación se realizarán preguntas sobre el código para verificar la autoría de este, de no responder correctamente la mayoría de las preguntas se reportará la copia. 
•	El repositorio únicamente debe contener el código fuente empleado para el desarrollo y el código que correra en GitHub Pages no deben existir archivos pdf o docx (utilizar un archivo .gitignore). 
•	El sistema operativo para utilizar es libre. 
•	Los lenguajes están basados en Java y C, por lo que el estudiante es libre de realizar archivos de prueba en estas herramientas, el funcionamiento debería ser el mismo y limitado a lo descrito en este enunciado. 
•	Los estudiantes NO DEBEN REALIZAR UN INTERPRETE DE C. 
•	Los estudiantes son libres de probar su código traducido en lenguaje C en un compilador local o en un compilador online. 
•	En la siguiente página se encuentra con compilador de C online:  https://www.onlinegdb.com/online_c_compiler. 

### **Calificación**
-	La calificación del proyecto será mediante la aplicación web publicada en github pages. 
-	El tiempo de calificación será de 20 minutos (puede aumentar dependiendo la cantidad de proyectos entregados). 
-	La hoja de calificación describe cada aspecto a calificar, por lo tanto, si la funcionalidad a calificar falla en la sección indicada se tendrá 0 puntos en esa funcionalidad y esa nota no podrá cambiar si dicha funcionalidad funciona en otra sección. 
-	Los archivos de entrada podrán ser modificados solamente antes de iniciar la calificación eliminando funcionalidades que el estudiante indique que no desarrollo. 
-	Los archivos de entrada podrán ser modificados si contienen errores léxicos, sintácticos o semánticos no descritos en el enunciado o provocados para verificar el manejo y recuperación de errores. 
-	Se utilizará un compilador de C para evaluar que la salida del archivo de entrada sea la correcta. 

### **Entrega del proyecto**
-	La entrega será mediante github, y se va a tomar como entrega el código fuente publicado en el repositorio a la fecha y hora establecidos. 
-	Cualquier commit luego de la fecha y hora establecidos invalidará el proyecto, por lo que no se tendrá derecho a calificación. 
-	No habrá prorroga 
-	Fecha de entrega:  Viernes 20 de diciembre a las 23:59 PM 

