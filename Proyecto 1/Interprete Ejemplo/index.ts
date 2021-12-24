import { AST } from "./AST/AST";
import { Entorno } from "./AST/Entorno";
import { Instruccion } from "./Interfaces/Instruccion";

const gramatica = require('./Gramatica/gramatica');

function ejecutarCodigo(entrada:string){
    //traigo todas las raices
    const instrucciones = gramatica.parse(entrada);
    const ast:AST = new AST(instrucciones);
    const entornoGlobal:Entorno = new Entorno(null);
    //recorro todas las raices  RECURSIVA
    instrucciones.forEach((element:Instruccion) => {
        element.ejecutar(entornoGlobal,ast);
    })
}

ejecutarCodigo(`
    print(1);
    print(true);
    print("hola mundo");
`);