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
    private ArrayList<String> amigos;

    public ClientImpl() throws RemoteException {
        super();
    }

    public void nuevoAmigoConectado(ClientInterface amigoConectado) {

    }

    public void nuevoAmigoDesconectado(ClientInterface amigoConectado) {

    }

    public String[] getAmigos() {
        return new String[2];
    }

    
    public void setAmigos( String[] amigos){
        
    }

//    public ClientInterface getAmigosConectados() {
//        return null;
//    }

//    public ArrayList<String> getPeticionesAmistad() {
//        return peticionesAmistad;
//    }

//    public void setAmigosConectados(ClientInterface[] amigosConectados) {
//       // this.amigosConectados = amigosConectados;
//    }

//    public void setPeticionesAmistad(ArrayList<String> peticionesAmistad) {
//        this.peticionesAmistad = peticionesAmistad;
//    }
//
//   
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
    public void recibirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String getNombre() {
        return nombre;
    }
    
    public HashMap<String, ClientInterface> getAmigosConectados(){
        return this.amigosConectados;
    }

}
