/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer2peer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raquel
 */
public class ClientImpl extends UnicastRemoteObject implements ClientInterface {

    private String nombre;
    private HashMap<String, ClientInterface> amigosConectados;
    private ArrayList<String> peticionesAmistad;
    private String[] amigos;
    GUIClient interfaz;

    public ClientImpl(GUIClient interfaz) throws RemoteException {
        super();
        this.nombre = null;
        this.amigosConectados = new HashMap<>();
        this.peticionesAmistad = new ArrayList<>();
        this.amigos = null;
        this.interfaz = interfaz;
    }
    
     public void addAmigoConectado(ClientInterface amigoConectado) throws java.rmi.RemoteException{
         if(!amigosConectados.containsKey(amigoConectado.getNombre())){
            this.amigosConectados.put(amigoConectado.getNombre(), amigoConectado);
         }
     }

    public void nuevoAmigoConectado(ClientInterface amigoConectado) throws java.rmi.RemoteException{
       addAmigoConectado(amigoConectado);
       
       interfaz.addNotificacion(amigoConectado.getNombre()+ " ha iniciado sesion");
    }

    public void nuevoAmigoDesconectado(String amigoDesconectado) throws java.rmi.RemoteException{
        amigosConectados.remove(amigoDesconectado);
        //this.recibirMensaje("Se acaba de desconectar",amigoDesconectado);
        interfaz.addNotificacion(amigoDesconectado+ " ha cerrado sesion");
    }
    
     public void notificar(String mensaje){
         interfaz.addNotificacion(mensaje);
     }

    public String[] getAmigos() throws java.rmi.RemoteException{
        return amigos;
    }

    
    public void setAmigos( String[] amigos)throws java.rmi.RemoteException{
        this.amigos = amigos;
    }


    public void setPeticionesAmistad(String[] peticionesAmistad) {
        this.peticionesAmistad = new ArrayList<>();
        for(int i=0; i<peticionesAmistad.length; i++){
           this.peticionesAmistad.add(peticionesAmistad[i]);   
        }
        
    }
    
    public ArrayList<String> getPeticionesAmistad() {
        return this.peticionesAmistad;     
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void recibirMensaje(String mensaje,String nombreEmisor) {
        System.out.println(nombreEmisor + ": " + mensaje);
    }

    public String getNombre() {
        return nombre;
    }
    
    public HashMap<String, ClientInterface> getAmigosConectados(){
        return this.amigosConectados;
    }

}
