/**** Arbol binario de busqueda ***/
struct Nodo {
    Nodo izq,
    Nodo der,
    int indice,
    String nombre
};

struct Arbol {
    Nodo raiz 
};

Arbol arbol  = Arbol(null);

Nodo insertar(Nodo nodo, int indice, String nombre) {
    if(nodo == null){
        nodo = Nodo(null, null, indice, nombre);
    }
    else if(indice < nodo.indice){
        nodo.izq = insertar(nodo.izq, indice, nombre);
    }
    else {
        nodo.der = insertar(nodo.der, indice, nombre);
    }
    return nodo;
}

void preOrden(Nodo raiz){
    if(raiz != null){
        println("Indice: $raiz.indice  Dato: $raiz.nombre");
        preOrden(raiz.izq);
        preOrden(raiz.der);
    }
}

void postOrden(Nodo raiz) {
    if(raiz != null){
        postOrden(raiz.izq);
        postOrden(raiz.der);
        println("Indice: $raiz.indice  Dato: $raiz.nombre");
    }
}

void inOrden(Nodo raiz){
    if(raiz != null){
        inOrden(raiz.izq);
        println("Indice: $raiz.indice  Dato: $raiz.nombre");
        inOrden(raiz.der);
    }
}

void cambio(Nodo raiz, int indice, String nuevoNombe){
    if(raiz == null){
       println("Indice no encontrado: ", indice);
        return;
    }

    if(raiz.indice == indice){
        println("Encontrado: $indice");
        raiz.nombre = nuevoNombe;
        return;
    }
    else if(indice < raiz.indice){
        cambio(raiz.izq, indice, nuevoNombe);
        return;
    }
    cambio(raiz.der, indice, nuevoNombe);
}

void main(){
    println("-------- INSERTANDO ---------");
	arbol.raiz = insertar(arbol.raiz, 10,"id1");
	arbol.raiz = insertar(arbol.raiz, 5,"id2");
	arbol.raiz = insertar(arbol.raiz, 12,"id3");
	arbol.raiz = insertar(arbol.raiz, 9,"id4");
	arbol.raiz = insertar(arbol.raiz, 3,"id5");
	arbol.raiz = insertar(arbol.raiz, 14,"id6");
	println("--------- PREORDEN ----------");
	preOrden(arbol.raiz); // (* RESULTADO : 10, 5, 3, 9, 12, 14 *)
	println("--------- POSTORDEN ----------");
	postOrden(arbol.raiz); // (* RESULTADO : 3, 9, 5, 14, 12, 10*)
	println("--------- INORDEN ----------");
	inOrden(arbol.raiz); // (* RESULTADO : 3, 5, 9, 10, 12, 14*)
	
	println("--------- CAMBIANDO --------");
	cambio(arbol.raiz,3,"idnuevo"); // (* RESULTADO: Econtrado 3 *)
	cambio(arbol.raiz,4,"no encontrado");  //(*RESULTADO: No encontrado 4*)
	inOrden(arbol.raiz); 
}

/*
    -------- INSERTANDO ---------
--------- PREORDEN ----------
Indice: 10  Dato: id1
Indice: 5  Dato: id2
Indice: 3  Dato: id5
Indice: 9  Dato: id4
Indice: 12  Dato: id3
Indice: 14  Dato: id6
--------- POSTORDEN ----------
Indice: 3  Dato: id5
Indice: 9  Dato: id4
Indice: 5  Dato: id2
Indice: 14  Dato: id6
Indice: 12  Dato: id3
Indice: 10  Dato: id1
--------- INORDEN ----------
Indice: 3  Dato: id5
Indice: 5  Dato: id2
Indice: 9  Dato: id4
Indice: 10  Dato: id1
Indice: 12  Dato: id3
Indice: 14  Dato: id6
--------- CAMBIANDO --------
Encontrado3
Indice no encontrado: 4
Indice: 3  Dato: idnuevo
Indice: 5  Dato: id2
Indice: 9  Dato: id4
Indice: 10  Dato: id1
Indice: 12  Dato: id3
Indice: 14  Dato: id6
*/