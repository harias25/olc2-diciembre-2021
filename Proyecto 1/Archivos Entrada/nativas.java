/************ STACK *****************/
int[] stack = [0];
int MAXSIZE = 50;
int MINZIE = 0;

void apilar(int num) {
    if(stack.length() == MAXSIZE){
        print("Pila llena");
    }
    else{
        stack.push(num);
    }
}

void desapilar(){
    if(stack.length() == MINZIE){
        print("Pila llena");
        return;
    }
    else{
        stack.pop();
    }
}

boolean estadoPila(){
    return stack.length() == MAXSIZE;
}

void vaciar(){
    stack = [];
}

void main(){
    for(int i = 1; i < 20 && !estadoPila(); i++){
        apilar(i);
    }
    println(stack.length()); //20
    println(stack);

    for(int i = 0; i < 10; i++){
        desapilar();
    }
    println(stack.length()); //10
    println(stack);

    for(int i = 10; i < 55; i++){
        apilar(i);
    }

    println(stack.length()); //50
    println(stack);
    String temp = "";
    for  i in stack{
        temp = temp & "|" & i & "|" & stack[i] & "|\n";
    }
    println("Pos | Val \n",temp);

    vaciar();
    desapilar();
}


/*
20
[ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 ]
10
[ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 ]
Pila llena
Pila llena
Pila llena
Pila llena
Pila llena
50
[ 0, 1, 2, 3, 4, 5,  6,  7,  8,  9,  10,  11,  12,  13,  14,  15,  16,  17,  18,  19,  20,  21,  22,  23,  24,
  25,  26,  27,  28,  29,  30,  31,  32,  33,  34,  35,  36,  37,  38,  39,  40,  41,  42,  43,  44,  45,  46,  47,  48, 49 ]
Pos | Val 
|0|0|
|1|1|
|2|2|
|3|3|
|4|4|
|5|5|
|6|6|
|7|7|
|8|8|
|9|9|
|10|10|
|11|11|
|12|12|
|13|13|
|14|14|
|15|15|
|16|16|
|17|17|
|18|18|
|19|19|
|20|20|
|21|21|
|22|22|
|23|23|
|24|24|
|25|25|
|26|26|
|27|27|
|28|28|
|29|29|
|30|30|
|31|31|
|32|32|
|33|33|
|34|34|
|35|35|
|36|36|
|37|37|
|38|38|
|39|39|
|40|40|
|41|41|
|42|42|
|43|43|
|44|44|
|45|45|
|46|46|
|47|47|
|48|48|
|49|49|
Pila vacia
*/