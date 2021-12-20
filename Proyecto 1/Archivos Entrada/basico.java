int var1 = 10;
int var2 = 20;
double punteoBasicas = 0.0;
double declaracion, asignacion, aritmeticas, relacionales, logicas;

int dimension = 3;
String[] arreglo = ["Estudiante1", "Estudiante2", "Estudiante3"];
//Posicion 0 - 2 para estudiante 1
//Posicion 3 - 5 para estudiante 2
//Posicion 6 - 8 para estudiante 3
int[] tablero = [0,0,0,0,0,0,0,0,0];
boolean[] estado = [false, false, false, false, false, false, false, false, false];


void main(){
    double val1 = 0.0;
    double val2 = 0.0;
    double val3 = 0.0;
    double a = 0.0;
    double b = 0;

    println("El valor defecto de declacion es 0 = ",declaracion);
    println("El valor defecto de asignacion es 0 = $asignacion y de aritmeticas 0 = $aritmeticas");
    print("Probando ");
    println("Manejo de Entornos");

    if(declaracion == 0.0 && asignacion == 0.0 && aritmeticas == 0.0){
        declacion = declacion + 0.50; 
    }else{
        declacion = 0.0;
    }

    println("El valor de var1 global es 10=$a");  //10
    if(var1==10){
        declacion = declacion + 0.25; 
    }

    int var1 = 5*5;
    println("El valor de var1 local es $a");  //25
    if(var1==25){
        declacion = declacion + 0.25; 
    }
    
    punteoBasicas = -10.0;
    var2 = 40;
    if(punteoBasicas == -10.0 && var2 == 40){
        asignacion =  1;
    }

    println("Declaraciones = ",declacion);
    println("Asignaciones = ",asignacion);

    /********************************
     * VALIDACION DE OPERACIONES
     * ******************************/

    val1 = 7 - (5 + 10 * (20 / 5 - 2 + 4 * (5 + 2 * 3)) - 8 * 3 % 2) + 50 * (6 * 2); //142.0
    val2 = pow(2,4) - 9 * (8 - 6 * (pow(3,2) - 6 * 5 - 7 * (9 + pow(7,3)) + 10) - 5 ) + 8 * (36 / 6 - 5 * ( 2 * 3)); //-133853.0
    val3 = (pow(8,3) * pow(8,2) - sqrt(4) + tan(12) + sin(60) + 2) / 3; //10922.353109816746
    double val4 = val1 - val2 + val3; //El resultado es 144917.35310981676
    int resultado = toInt(val4);  //144917
    if(resultado == 144917){
        println("Aritmeticas 100");
        aritmeticas = 1;
    }

    String String_3;
    String String_4;
    int int2_;
    boolean TRUE = true;
    boolean FALSE = false;
    int2_ = 45;
    int2_ = int2_ - 1; 
    
    String_3 = string(int2_ > 77 || FALSE) & "," & string(int2_ < 78 && TRUE) & "," & string(int2_ + 10 <= int2_ || FALSE) & "," & string(!!!!!!!!!!!! (int2_ + 10 >= int2_));
    //println(int2_ > 77 || FALSE,",",int2_ < 78 && TRUE,",",int2_ + 10 <= int2_ || FALSE,",",!!!!!!!!!!!! (int2_ + 10 >= int2_));  ////false, true, false, true
    String_4 = string(int2_ >= 77 || -1 < 100) & "," & string(int2_ > 78 && 100 + 0 == 100);
    println(int2_ >= 77 || -1 < 100,",",int2_ > 78 && 100 + 0 == 100);  //true, false

    String String_5 = "Calificacion "^3; 
    String pruebasNativas = "ComPiLaDoReS2 TesT";

    println("Lógica 1" & " = " & String_3); //false,true,false,true
    println("Lógica 2" & " = " & String_4); //true,false
    println("Cadena 5" & " = " & String_5); //Calificacion Calificacion Calificacion 

    println(pruebasNativas.subString(0,12).toUppercase()," ",pruebasNativas.caracterOfPosition(12), " ", pruebasNativas.subString(14,pruebasNativas.length()).toLowercase());  // COMPILADORES 2 test


    boolean relacionaes = (a == 0) != (44.3 < 44.4) == (pow(2,5) == 31 + 2 % 1);
    relacionaes = relacionaes == (b == a) != ((532 > 532)) == (String_3 == "false,true,false,true") == (String_4 == "true,false");
    if(relacionaes){
        println("Relacionels 100");
    }
    else{
        println("Relacionales 0");
    }

    /***********************/
    

    //Notas estudiante 1
    agregar(0,0, 90);
    agregar(0,1, 95);
    agregar(0,2, 92);

    //Notas estudiante 2
    agregar(1,0, 85);
    agregar(1,1, 90);
    agregar(1,2, 100);

    //Notas estudiante 3
    agregar(2,0, 20);
    agregar(2,1, 100);
    agregar(2,2, 100);

    //Imprimir Promedios
    imprimirPromedio(0); 
    imprimirPromedio(1); 
    imprimirPromedio(2); 

    //Debe imprimir posicion ocupada 
    agregar(2,0, -1);

/*
Declaraciones 1
Asignaciones 1
Aritmeticas 100
Lógica 1 = false,true,false,true
Lógica 2 = true,false
Calificacion Calificacion Calificacion 
COMPILADORES 2 test
Relacionels 100
Promedio Estudiante  Estudiante1  =  92.0
Promedio Estudiante  Estudiante2  =  91.0
Promedio Estudiante  Estudiante3  =  73.0
Posicion ocupada
*/  
 
}

boolean agregar(int i, int j, int nota){
    if(!estado[i * dimension + j]){
        tablero[i * dimension + j] = nota;
        estado[i*dimension + j] = true;
        return true;
    }
    println("Posicion ocupada");
    return false;
}

void imprimirPromedio(int estudiante){
    double promedio = (tablero[estudiante * dimension + 0] + tablero[estudiante * dimension + 1] + tablero[estudiante * dimension + 2])/3;
    println("Promedio Estudiante " , arreglo[estudiante], " = ", promedio);
}