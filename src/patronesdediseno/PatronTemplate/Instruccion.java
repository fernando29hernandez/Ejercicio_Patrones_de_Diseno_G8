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
public interface Instruccion {

    public Object ejecutar(); //Función que van a sobreescribir todas las clases que implementen de la interfaz
    public void notacionPostfija(); //Para que imprima el resultado en notación postfija
}
