/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseno.PatronState;

/**
 *
 * @author Chalo
 */
public class Contexto {

    private Estado estado;

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void realizar_Accion() {
        estado.resolver_Operacion();
    }
}
