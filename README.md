# Quetzal OCL2

Quetzal es un lenguaje de programación inspirado en C, su característica principal es la inclusión de tipos explícitos. El sistema de tipos de Quetzal realiza una formalización de los tipos de C y Java. Esto permite a los desarrolladores definir variables y funciones tipadas sin perder la esencia. Otra inclusión importante de Quetzal es la simplificación de los lenguajes C y Java para poder realizar diferentes instrucciones en menos pasos.

java es un lenguaje de programación bastante reciente que le interesa a científicos de datos, estadísticos y analistas financieros. Este cuenta con distintas características atractivas para los programadores. Aún así, java al ser un lenguaje de programación bastante reciente, hay muy pocos lugares donde se pueda probar su sintaxis de manera sencilla. Es por eso que se desarrollo Quetzal, un lenguaje de programación basado en java que se podrá programar desde el navegador.

A continuación, se detalla la sintaxis que tendrá Quetzal. Además de algunos archivos de entrada de prueba que podrán probar para familiarizarse con la sintaxis.

## Tabla de Contenido

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
['a', 2.0, 5, ["Hola", "Mundo"]]
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
    println(animal.caracterOfPosition(2)); //i
    ```
- **Acceso a una porción:** El acceso a una porción de una cadena se define de la siguiente manera: `string.subString(inicial,final)`, el cual devolvera la cadena correspondiente al intervalo definido.
    ```java
    animal = "Tigre";
    println(animal.subString(2,4)); //igr
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

Quetzal contará con varias instrucciones para su ejecución, cada instrucción pueder terminar con un punto y coma (`;`) o no. Las instrucciones que Quetzal acepta son:

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

Quetzal permite la declaración y asignación de variables, las variables pueden cambiar su tipo de dato en cualquier momento

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
function NOMBRE_FUNCION(LISTA_PARAMETROS){
    LISTA_INSTRUCCIONES
}
```

Por ejemplo:

```java
function imprimirHola(){
    print("Hola")
    println(" Mundo");
}
```

Además, los parámetros de las funciones vendrán separadas por `,` y podrán o no llevar tipo de dato.

```java
function sumar(int num1, double num2){
    return num1 + toInt(num2);
}
```

Hay que tomar en cuenta que las variables y parámetros que se creen dentro de una función son locales, es decir que únicamente existen dentro de la función.

Las funciones también pueden llamarse a sí mismas. Lo que permite una gran variedad de aplicaciones en estructuras de datos y algoritmos de ordenamiento.

### Condicionales <a name="condicionales"></a>

Quetzal cuenta con sentencias condicionales, lo que permite que un bloque de codigo pueda ser o no ejecutado. Estas se definen por `if`,`if...else` y `if...elseif` y adicional con la sentencia switch case. Su estructura es la siguiente:
```java

if (CONDICION){
    LISTA_INTRUCCIONES
}

if (CONDICION)
    INSTRUCCION

if(CONDICION1){
  LISTA_INTRUCCIONES
}
elseif(CONDICION1){
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
    var1 = (x + 8)::Int64;
    println(sqrt(var1));
}

if(x == 8){
    var1 = (x + 8)::Int64;
    println(sqrt(var1));
}
elseif(x < 8){
    var1 = (x/3)::Float64;
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
