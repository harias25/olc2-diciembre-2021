int recusiva1(int m, int n)
{    
    if (m == 0){
        return n + 1;
    }else if (m > 0 && n == 0){
        return recusiva1(m - 1, 1);
    }else{
        return recusiva1(m - 1, recusiva1(m, n - 1));
    }
}

void juego( int discos, int origen, int auxiliar, int destino)
{
    if (discos == 1){
        println("Mover de " , origen , " a " , destino);
    }else{
        juego(discos - 1, origen, destino, auxiliar);
        println("Mover de " , origen & " a " , destino);
        juego(discos - 1, auxiliar, origen, destino);
    }
}

int recursiva_sencilla(int num)
{
    if (num == 1){
        return 1;
    }else{
        return num * recursiva_sencilla(num - 1);
    }
}

void main()
{
    println("=====================================================");
    println("===========FUNCIONES RECURSIVAS======================");
    println("=====================================================");
    println("");

    println("==============FACTORIAL==============================");
    println(recursiva_sencilla(10));  //
    println("===============ACKERMAN==============================");
    println(recusiva1(3, 7));  //2045   //1021
    println("===============HANOI=================================");
    juego(4, 1, 2, 3);
}






/******************************************* 

=====================================================
===========FUNCIONES RECURSIVAS======================
=====================================================

==============FACTORIAL==============================
2004310016     -   3628800 
===============ACKERMAN==============================
2045  -  1021
===============HANOI=================================
Mover de 1 a 2
Mover de 1 a 3
Mover de 2 a 3
Mover de 1 a 2
Mover de 3 a 1
Mover de 3 a 2
Mover de 1 a 2
Mover de 1 a 3
Mover de 2 a 3
Mover de 2 a 1
Mover de 3 a 1
Mover de 2 a 3
Mover de 1 a 2
Mover de 1 a 3
Mover de 2 a 3


*/