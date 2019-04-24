/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer2peer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

/**
 *
 * @author raquel
 */
public class ClientImpl extends UnicastRemoteObject implements ClientInterface {
    private Vector amigosConectados;
    private Vector peticionesAmistad;
    private Vector amigos;
    public ClientImpl() throws RemoteException {
      super( );
   }
    public void nuevoAmigoConectado(ClientInterface amigoConectado){
        
        
    }
    public void nuevoAmigoDesconectado(ClientInterface amigoConectado){
        
        
    }
      
    public  Vector getAmigos(){
        return null;
    }
    public void setAmigos(Vector amigos){
        
    }

    public Vector getAmigosConectados() {
        return amigosConectados;
    }

    public Vector getPeticionesAmistad() {
        return peticionesAmistad;
    }

    public void setAmigosConectados(Vector amigosConectados) {
        this.amigosConectados = amigosConectados;
    }

    public void setPeticionesAmistad(Vector peticionesAmistad) {
        this.peticionesAmistad = peticionesAmistad;
    }
    
    
}
