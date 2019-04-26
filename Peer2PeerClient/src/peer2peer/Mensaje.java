/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer2peer;

/**
 *
 * @author carlo
 */
public class Mensaje {
    private String emisor;
    private String mensaje;
    public Mensaje(String emisor, String mensaje){
        this.emisor = emisor;
        this.mensaje = mensaje;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
