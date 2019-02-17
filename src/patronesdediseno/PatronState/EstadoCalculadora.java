/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseno.PatronState;

import java.io.FileInputStream;
import patronesdediseno.PatronTemplate.Instruccion;

/**
 *
 * @author Chalo
 */
public class EstadoCalculadora implements Estado {

    @Override
    public void resolver_Operacion() {
        String path = "entrada.txt";
        analizadores.parser pars;
        Instruccion raiz;

        try {
            pars = new analizadores.parser(new analizadores.Lexico(new FileInputStream(path)));
            pars.parse();
            raiz = pars.raiz;

            System.out.println("Resultado = " + raiz.ejecutar()); //Imprimo el resultado
        } catch (Exception ex) {
            System.out.println("Error fatal en compilación de entrada.");
        }
    }

}
