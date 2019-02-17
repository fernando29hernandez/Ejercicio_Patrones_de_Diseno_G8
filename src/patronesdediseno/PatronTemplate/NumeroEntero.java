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
public class NumeroEntero implements Instruccion {

    String valor; //Valor que va a tener el número

    public NumeroEntero(String valor) {
        this.valor = valor;
    }

    @Override
    public Object ejecutar() {
        return Integer.parseInt(valor); //Retorno el valor en tipo entero
    }

    @Override
    public void notacionPostfija() {
        System.out.print(this.valor + " ");
    }
}
