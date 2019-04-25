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
            System.out.println("Message to:");
            String receptor = br.readLine();
            clienteIm.getAmigosConectados().get(receptor).recibirMensaje("Hola amiguito", clienteIm.getNombre());

        } catch (Exception e) {
            System.out.println("Exception in CallbackClient: " + e);
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
