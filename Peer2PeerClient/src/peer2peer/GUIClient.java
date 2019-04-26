/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer2peer;

import java.awt.Color;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author carlo
 */
public class GUIClient extends javax.swing.JFrame {

    private HashMap<String, ArrayList<Mensaje>> mensajes;
    private ClientInterface cliente;
    private ClientImpl clienteIm;
    private ServerInterface servidor;

    private JPanel panelIzq;
    private JPanel panelActivo;

    /**
     * Creates new form GUIClient
     */
    public GUIClient() {
        initComponents();
        this.mensajes = new HashMap<>();
        this.cliente = null;
        this.clienteIm = null;
        this.servidor = null;

        this.setLocationRelativeTo(null);
        this.ocultarLabelErrores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        PasswordText = new javax.swing.JPasswordField();
        botonIniciarSesion = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        PuertoText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        IpText = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        errorConexionLabel = new javax.swing.JLabel();
        errorLoginLabel = new javax.swing.JLabel();
        errorCamposVacios = new javax.swing.JLabel();
        errorCrearCuentaLabel = new javax.swing.JLabel();
        botonCrearCuenta = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(127, 150, 168));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/round-account-button-with-user-inside_icon-icons.com_72596 (1).png"))); // NOI18N
        panelLogin.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));
        panelLogin.add(NombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 320, 30));
        panelLogin.add(PasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 320, 30));

        botonIniciarSesion.setBackground(new java.awt.Color(77, 117, 149));
        botonIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIniciarSesionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonIniciarSesionMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonIniciarSesionMouseEntered(evt);
            }
        });
        botonIniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setForeground(new java.awt.Color(254, 254, 254));
        jLabel16.setText("Iniciar Sesion");
        botonIniciarSesion.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 120, 20));

        panelLogin.add(botonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 220, 40));

        jLabel17.setText("Nombre");
        panelLogin.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jLabel18.setText("Contraseña");
        panelLogin.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));
        panelLogin.add(PuertoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 320, 30));

        jLabel19.setText("Puerto");
        panelLogin.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        IpText.setText("localhost");
        panelLogin.add(IpText, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 320, 30));

        jLabel20.setText("host");
        panelLogin.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        errorConexionLabel.setForeground(new java.awt.Color(168, 1, 1));
        errorConexionLabel.setText("No se ha podido conectar con el servidor");
        panelLogin.add(errorConexionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 300, 30));

        errorLoginLabel.setForeground(new java.awt.Color(168, 1, 1));
        errorLoginLabel.setText("El nombre de usuario o contraseña es incorrecto");
        panelLogin.add(errorLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 320, 20));

        errorCamposVacios.setForeground(new java.awt.Color(161, 1, 1));
        errorCamposVacios.setText("Completa todos los campos");
        panelLogin.add(errorCamposVacios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 370, -1));

        errorCrearCuentaLabel.setForeground(new java.awt.Color(168, 1, 1));
        errorCrearCuentaLabel.setText("No se ha podido crear la cuenta: el nombre de usuario ya está en uso");
        panelLogin.add(errorCrearCuentaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 470, 30));

        botonCrearCuenta.setBackground(new java.awt.Color(77, 117, 149));
        botonCrearCuenta.setForeground(new java.awt.Color(77, 117, 149));
        botonCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearCuentaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearCuentaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCrearCuentaMouseEntered(evt);
            }
        });
        botonCrearCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setForeground(new java.awt.Color(254, 254, 254));
        jLabel21.setText("Crear cuenta");
        botonCrearCuenta.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 120, 20));

        panelLogin.add(botonCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 220, 40));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSesionMouseClicked
        this.ocultarLabelErrores();
        try {
            // TODO add your handling code here:
            String hostname = this.IpText.getText();
            String puerto = this.PuertoText.getText();
            String nombre = this.NombreText.getText();
            String password = this.PasswordText.getText();

            if (hostname.equals("") || puerto.equals("") || nombre.equals("") || password.equals("")) {
                this.errorCamposVacios.setVisible(true);
            } else {
                //Establecer la conexion con el servidor
                String registryURL = "rmi://" + hostname + ":" + puerto + "/peer2peer";
                this.servidor = (ServerInterface) Naming.lookup(registryURL);
                this.iniciarSesion(nombre, password);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
            this.errorConexionLabel.setVisible(true);
        } catch (NotBoundException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
            this.errorConexionLabel.setVisible(true);
        } catch (MalformedURLException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
            this.errorConexionLabel.setVisible(true);
        }
    }//GEN-LAST:event_botonIniciarSesionMouseClicked

    private void botonCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearCuentaMouseClicked
        this.ocultarLabelErrores();
        try {
            // TODO add your handling code here:
            // TODO add your handling code here:
            String hostname = this.IpText.getText();
            String puerto = this.PuertoText.getText();
            String nombre = this.NombreText.getText();
            String password = this.PasswordText.getText();
            if (hostname.equals("") || puerto.equals("") || nombre.equals("") || password.equals("")) {
                this.errorCamposVacios.setVisible(true);
            } else {

                //Establecer la conexion con el servidor
                String registryURL = "rmi://" + hostname + ":" + puerto + "/peer2peer";
                this.servidor = (ServerInterface) Naming.lookup(registryURL);

                if (servidor.crearCuenta(nombre, password)) {
                    this.iniciarSesion(nombre, password);
                } else {
                    this.errorCrearCuentaLabel.setVisible(true);
                }
            }
        } catch (RemoteException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonCrearCuentaMouseClicked

    private void botonCrearCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearCuentaMouseEntered
        // TODO add your handling code here:
        botonCrearCuenta.setBackground(new Color(84, 138, 182));
    }//GEN-LAST:event_botonCrearCuentaMouseEntered

    private void botonCrearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearCuentaMouseExited
        // TODO add your handling code here:
        botonCrearCuenta.setBackground(new Color(77, 117, 149));
    }//GEN-LAST:event_botonCrearCuentaMouseExited

    private void botonIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSesionMouseEntered
        // TODO add your handling code here:
        botonIniciarSesion.setBackground(new Color(84, 138, 182));
    }//GEN-LAST:event_botonIniciarSesionMouseEntered

    private void botonIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSesionMouseExited
        // TODO add your handling code here:
        botonIniciarSesion.setBackground(new Color(77, 117, 149));
    }//GEN-LAST:event_botonIniciarSesionMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIClient().setVisible(true);
            }
        });
    }

    public void anadirMensaje(String amigo, String emisor, String mensaje) {
        if (this.mensajes.get(amigo).size() == 10) {
            ArrayList<Mensaje> aux = new ArrayList<>();
            for (int i = 1; i < 10; i++) {
                mensajes.get(amigo).set(i - 1, mensajes.get(amigo).get(i));
            }
            mensajes.get(amigo).set(9, new Mensaje(emisor, mensaje));
        } else {
            mensajes.get(amigo).add(new Mensaje(emisor, mensaje));
        }
    }

    public ClientInterface getCliente() {
        return cliente;
    }

    public ClientImpl getClienteIm() {
        return clienteIm;
    }

    public ServerInterface getServidor() {
        return servidor;
    }

    public void eliminarCuenta() {
        try {
            servidor.eliminarCuenta(cliente.getNombre());
            panelIzq.setVisible(false);
            panelActivo.setVisible(false);
            this.remove(panelIzq);
            this.remove(panelActivo);
            this.panelLogin.setVisible(true);
        } catch (RemoteException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IpText;
    private javax.swing.JTextField NombreText;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JTextField PuertoText;
    private javax.swing.JPanel botonCrearCuenta;
    private javax.swing.JPanel botonIniciarSesion;
    private javax.swing.JLabel errorCamposVacios;
    private javax.swing.JLabel errorConexionLabel;
    private javax.swing.JLabel errorCrearCuentaLabel;
    private javax.swing.JLabel errorLoginLabel;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel panelLogin;
    // End of variables declaration//GEN-END:variables

    private void iniciarSesion(String nombre, String password) throws RemoteException {
        //Crear el objeto cliente
        this.clienteIm = new ClientImpl();
        this.cliente = clienteIm;
        clienteIm.setNombre(nombre);
        if (servidor.iniciarSesion(cliente, password)) {
            this.ocultarLabelErrores();
            this.panelLogin.setVisible(false);
            this.panelIzq = new panelIzq(this, nombre);
            this.add(panelIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 450));
            this.panelIzq.setVisible(true);
            this.panelActivo = new panelPerfil(this, nombre);
            this.add(panelActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 680, 450));
            this.panelActivo.setVisible(true);
        } else {
            this.ocultarLabelErrores();
            this.errorLoginLabel.setVisible(true);
        }
    }

    private void ocultarLabelErrores() {
        this.errorCamposVacios.setVisible(false);
        this.errorConexionLabel.setVisible(false);
        this.errorCrearCuentaLabel.setVisible(false);
        this.errorLoginLabel.setVisible(false);
    }

    public void panelPerfil() {
        try {
            this.remove(this.panelActivo);
            this.panelActivo = new panelPerfil(this, this.cliente.getNombre());
            this.add(panelActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 680, 450));
            this.panelActivo.setVisible(true);
        } catch (RemoteException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void panelPeticiones() {
        this.remove(this.panelActivo);
        //this.panelActivo = new panelPerfil(this, this.clienteIm.getPeticionesAmistad());
        this.add(panelActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 680, 450));
        this.panelActivo.setVisible(true);
    }
    
     public void panelBusqueda() {
        this.remove(this.panelActivo);
        //this.panelActivo = new panel(this, this.clienteIm.getPeticionesAmistad());
        this.add(panelActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 680, 450));
        this.panelActivo.setVisible(true);
    }
      public void panelChats() {
        this.remove(this.panelActivo);
        //this.panelActivo = new panelPerfil(this, this.clienteIm.getPeticionesAmistad());
        this.add(panelActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 680, 450));
        this.panelActivo.setVisible(true);
    }

}
