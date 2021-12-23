 /***************** GRAFICAR TS*******************/
    int x = 10;
    String y = "Hola compi2";
    boolean z = true;
    int[] arreglo = [1,2,3,4,5];
    boolean[] arreglo2 = [true, false];

struct t {
    String nombre,
    int edad
};

struct x {
    String personaje,
    boolean booleano
};

void main(){
   graficar_ts(); //Grafica sin hola

    int hola = 20;
    graficar_ts(); //Grafica con hola
    funcion1();
    funcion2(1, "2", true);
    funcion3();
    StructBasico();
    
}


void StructBasico(){
    t persona = t("Calificacion",25);
    println(persona);

    persona.nombre = "Cambio";
    persona.edad = 40;

    println(persona);


    persona = null;
    println(persona);

}


void funcion1() {
    graficar_ts(); //Grafica global
}

void funcion2(int param1, String param2, boolean param3) {
    graficar_ts(); //Grafica global + 3 parametros
}

void funcion3(){
    int x = 10;
    int y = 10;
    int z = 20;
    graficar_ts();//Grafica global + 3 variables
}


/*
    5 tablas de simbolos

    "Calificacion", 25
    "Cambio", 40
    null

*/