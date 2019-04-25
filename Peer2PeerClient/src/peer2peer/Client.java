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
            System.out.println("Enter the RMIRegistry host namer:");
            String hostName = br.readLine();
            System.out.println("Enter the RMIregistry port number:");
            String portNum = (br.readLine()).trim();
            RMIPort = Integer.parseInt(portNum);
            
            String registryURL = "rmi://" + hostName + ":" + portNum + "/peer2peer";
            ServerInterface servidor = (ServerInterface) Naming.lookup(registryURL);
            ClientInterface cliente = new ClientImpl();
            servidor.iniciarSesion(cliente);
            System.out.println("Message to:");
            String receptor = br.readLine();
            cliente.getAmigos();
           // ClientInterface clienteReceptor = cliente.getAmigosConectados().get(receptor);
            //locclienteReceptor.recibirMensaje("Hola, que tal amigo mio?");
        } catch (Exception e) {
            System.out.println("Exception in CallbackClient: " + e);
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
