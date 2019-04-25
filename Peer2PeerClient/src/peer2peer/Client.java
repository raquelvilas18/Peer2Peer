/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer2peer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.rmi.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raquel
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int RMIPort;
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            System.out.println("Enter the RMIregistry port number:");
            String portNum = (br.readLine()).trim();
            System.out.println("Enter the RMIRegistry host namer:");
            String hostName = br.readLine();
            RMIPort = Integer.parseInt(portNum);
            System.out.println("Introduce el nombre de usuario:");
            String nombreUsuario = br.readLine().toLowerCase();
            System.out.println("Introduce la contrasenha de usuario:");
            String contrasenha = br.readLine();
            String registryURL = "rmi://" + hostName + ":" + portNum + "/peer2peer";
            ServerInterface servidor = (ServerInterface) Naming.lookup(registryURL);
            ClientImpl clienteIm = new ClientImpl();
            ClientInterface cliente = clienteIm;
            clienteIm.setNombre(nombreUsuario);
            servidor.iniciarSesion(cliente, contrasenha);
            System.out.println("Amigos conectados:");
            for(Map.Entry<String, ClientInterface> entry : clienteIm.getAmigosConectados().entrySet()){
                System.out.println("" + entry.getValue().getNombre());
            }
            System.out.println("--------------------------------------");
            while(true){
                String lectura = br.readLine();
                if(lectura.equals("salir")){
                    servidor.cerrarSesion(cliente);
                    return;
                }
                if(lectura.equals("enviar")){
                    System.out.println("Message to:");
                    String receptor = br.readLine();
                    if(clienteIm.getAmigosConectados().get(receptor)!=null){
                        System.out.println("Escribe el mensaje:");
                        String mensaje = br.readLine();
                        clienteIm.getAmigosConectados().get(receptor).recibirMensaje(mensaje, clienteIm.getNombre());  
                    }else System.out.println("No es posible enviar mensaje a ese usuario (no existe o no se encuentra en línea)");
                }
            }
            

        } catch (Exception e) {
            System.out.println("Exception in CallbackClient: " + e);
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
