/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseno.PatronTemplate;

/**
 *
 * @author Chalo
 */
public class Suma implements Instruccion {

    Instruccion hijo1; //El hijo izquierdo de la operación
    Instruccion hijo2; //El hijo derecho de la operación

    public Suma(Instruccion hijo1, Instruccion hijo2) {
        this.hijo1 = hijo1;
        this.hijo2 = hijo2;
    }

    @Override
    public Object ejecutar() {
        int resultado1 = (int) hijo1.ejecutar();
        int resultado2 = (int) hijo2.ejecutar();
        return resultado1 + resultado2;
    }

    @Override
    public void notacionPostfija() {
        hijo1.notacionPostfija();
        hijo2.notacionPostfija();
        System.out.print("+");
    }
}
