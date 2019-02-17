/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseno;

import patronesdediseno.PatronState.Contexto;
import patronesdediseno.PatronState.Estado;
import patronesdediseno.PatronState.EstadoCalculadora;
import patronesdediseno.PatronState.EstadoNotacionPostfija;

/**
 *
 * @author Chalo
 */
public class PatronesDeDiseño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejecutar();
    }

    private static void ejecutar() {
        try {

            Contexto contexto = new Contexto(); //Declaro un nuevo contexto

            Estado estado1 = new EstadoCalculadora(); //Declaro una calculadora
            contexto.setEstado(estado1);
            contexto.realizar_Accion();

            Estado estado2 = new EstadoNotacionPostfija(); //Declaro una calculadora que convierta a notación postfija
            contexto.setEstado(estado2);
            contexto.realizar_Accion();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
