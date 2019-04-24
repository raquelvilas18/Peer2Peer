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
    private String nombre;
    private HashMap<String, ClientInterface> amigosConectados;
    private HashMap<String, ClientInterface> peticionesAmistad;
    private HashMap<String, ClientInterface> amigos;
    public ClientImpl() throws RemoteException {
      super( );
   }
    public void nuevoAmigoConectado(ClientInterface amigoConectado){
        
        
    }
    public void nuevoAmigoDesconectado(ClientInterface amigoConectado){
        
        
    }
      
    public  HashMap<String, ClientInterface> getAmigos(){
        return null;
    }
    public void setAmigos(HashMap<String, ClientInterface> amigos){
        
    }

    public HashMap<String, ClientInterface> getAmigosConectados() {
        return amigosConectados;
    }

    public HashMap<String, ClientInterface> getPeticionesAmistad() {
        return peticionesAmistad;
    }

    public void setAmigosConectados(HashMap<String, ClientInterface> amigosConectados) {
        this.amigosConectados = amigosConectados;
    }

    public void setPeticionesAmistad(HashMap<String, ClientInterface> peticionesAmistad) {
        this.peticionesAmistad = peticionesAmistad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
