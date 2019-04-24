/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer2peer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.*;

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
            String registryURL = "rmi://" + hostName + ":" + portNum + "/callback";
            ServerInterface h = (ServerInterface) Naming.lookup(registryURL);
            ClientInterface callbackObj = new ClientImpl();
        } catch (Exception e) {
            System.out.println("Exception in CallbackClient: " + e);
        }
    }
    
}
