/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer2peer;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
    private panelNotificaciones panelNotificaciones;

    /**
     * Creates new form GUIClient
     */
    public GUIClient() {
        initComponents();
        this.mensajes = new HashMap<>();
        this.cliente = null;
        this.clienteIm = null;
        this.servidor = null;

        //CUANDO CIERRAS EL JFRAME ANTES CIERRA SESION
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                try {
                    servidor.cerrarSesion(cliente);
                } catch (RemoteException ex) {
                    Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

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

        jSeparator1 = new javax.swing.JSeparator();
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
        setMaximumSize(new java.awt.Dimension(1200, 500));
        setMinimumSize(new java.awt.Dimension(1200, 470));
        setPreferredSize(new java.awt.Dimension(1200, 470));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(43, 96, 113));
        panelLogin.setForeground(new java.awt.Color(119, 119, 119));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-usuario-masculino-en-círculo-100.png"))); // NOI18N
        panelLogin.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        NombreText.setBackground(new java.awt.Color(43, 96, 113));
        NombreText.setForeground(new java.awt.Color(207, 207, 207));
        NombreText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 144, 160), 1, true));
        panelLogin.add(NombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 320, 30));

        PasswordText.setBackground(new java.awt.Color(43, 96, 113));
        PasswordText.setForeground(new java.awt.Color(207, 207, 207));
        PasswordText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 144, 160), 1, true));
        PasswordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordTextKeyPressed(evt);
            }
        });
        panelLogin.add(PasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 320, 30));

        botonIniciarSesion.setBackground(new java.awt.Color(254, 254, 254));
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

        jLabel16.setForeground(new java.awt.Color(1, 1, 1));
        jLabel16.setText("Iniciar Sesion");
        botonIniciarSesion.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 120, 20));

        panelLogin.add(botonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 220, 40));

        jLabel17.setForeground(new java.awt.Color(254, 254, 254));
        jLabel17.setText("Nombre");
        panelLogin.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabel18.setForeground(new java.awt.Color(254, 254, 254));
        jLabel18.setText("Contraseña");
        panelLogin.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        PuertoText.setBackground(new java.awt.Color(43, 96, 113));
        PuertoText.setForeground(new java.awt.Color(207, 207, 207));
        PuertoText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 144, 160), 1, true));
        panelLogin.add(PuertoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 320, 30));

        jLabel19.setForeground(new java.awt.Color(254, 254, 254));
        jLabel19.setText("Puerto");
        panelLogin.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        IpText.setBackground(new java.awt.Color(43, 96, 113));
        IpText.setForeground(new java.awt.Color(207, 207, 207));
        IpText.setText("localhost");
        IpText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 144, 160), 1, true));
        panelLogin.add(IpText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 320, 30));

        jLabel20.setForeground(new java.awt.Color(254, 254, 254));
        jLabel20.setText("host");
        panelLogin.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        errorConexionLabel.setForeground(new java.awt.Color(168, 1, 1));
        errorConexionLabel.setText("No se ha podido conectar con el servidor");
        panelLogin.add(errorConexionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 300, 30));

        errorLoginLabel.setForeground(new java.awt.Color(168, 1, 1));
        errorLoginLabel.setText("El nombre de usuario o contraseña es incorrecto");
        panelLogin.add(errorLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 320, 20));

        errorCamposVacios.setForeground(new java.awt.Color(161, 1, 1));
        errorCamposVacios.setText("Completa todos los campos");
        panelLogin.add(errorCamposVacios, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 370, -1));

        errorCrearCuentaLabel.setForeground(new java.awt.Color(168, 1, 1));
        errorCrearCuentaLabel.setText("No se ha podido crear la cuenta: el nombre de usuario ya está en uso");
        panelLogin.add(errorCrearCuentaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 470, 30));

        botonCrearCuenta.setBackground(new java.awt.Color(254, 254, 254));
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

        jLabel21.setForeground(new java.awt.Color(1, 1, 1));
        jLabel21.setText("Crear cuenta");
        botonCrearCuenta.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 120, 20));

        panelLogin.add(botonCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 220, 40));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 450));

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
        botonCrearCuenta.setBackground(new Color(217, 217, 217));
    }//GEN-LAST:event_botonCrearCuentaMouseEntered

    private void botonCrearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearCuentaMouseExited
        // TODO add your handling code here:
        botonCrearCuenta.setBackground(new Color(254, 254, 254));
    }//GEN-LAST:event_botonCrearCuentaMouseExited

    private void botonIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSesionMouseEntered
        // TODO add your handling code here:
        botonIniciarSesion.setBackground(new Color(217, 217, 217));
    }//GEN-LAST:event_botonIniciarSesionMouseEntered

    private void botonIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSesionMouseExited
        // TODO add your handling code here:
        botonIniciarSesion.setBackground(new Color(254, 254, 254));
    }//GEN-LAST:event_botonIniciarSesionMouseExited

    private void PasswordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordTextKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
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
        }
    }//GEN-LAST:event_PasswordTextKeyPressed

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

    public boolean actualizarPassword(String password) {
        try {
            return (servidor.actualizarPassword(cliente.getNombre(), password));
        } catch (RemoteException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Acepta la peticion y devuellve las peticiones pendientes actualizadas
    public ArrayList<String> aceptarPeticion(String destinatario) {
        try {
            servidor.aceptarPeticion(destinatario, cliente.getNombre());
            servidor.acualizarPeticiones(cliente);
            servidor.acualizarAmigos(cliente);
            return clienteIm.getPeticionesAmistad();
        } catch (RemoteException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<String> rechazarPeticion(String destinatario) {
        try {
            servidor.rechazarPeticion(destinatario, cliente.getNombre());
            servidor.acualizarPeticiones(cliente);
            return clienteIm.getPeticionesAmistad();
        } catch (RemoteException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
            return null;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelLogin;
    // End of variables declaration//GEN-END:variables

    private void iniciarSesion(String nombre, String password) throws RemoteException {
        //Crear el objeto cliente

        this.clienteIm = new ClientImpl(this);
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
            this.panelNotificaciones = new panelNotificaciones();
            this.add(panelNotificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 300, 450));
            this.panelNotificaciones.setVisible(true);
            this.vaciarCamposLogin();
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
        this.panelActivo.setVisible(false);
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
        try {
            this.panelActivo.setVisible(false);
            this.remove(this.panelActivo);
            servidor.acualizarPeticiones(cliente);
            this.panelActivo = new panelPeticiones(this, this.clienteIm.getPeticionesAmistad());

            this.add(panelActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 680, 450));
            this.panelActivo.setVisible(true);
        } catch (RemoteException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void panelBusqueda() {
        try {
            this.panelActivo.setVisible(false);
            this.remove(this.panelActivo);
            this.panelActivo = new panelBuscar(this, cliente.getNombre());
            this.add(panelActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 680, 450));
            this.panelActivo.setVisible(true);
        } catch (RemoteException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void panelChats() {
        this.panelActivo.setVisible(false);
        this.remove(this.panelActivo);
        try {
            for (String amigo : Arrays.asList(this.getClienteIm().getAmigos())) {
                if (mensajes.get(amigo) == null) {
                    mensajes.put(amigo, new ArrayList<>());
                }
            }
        } catch (Exception e) {

        }
        this.panelActivo = new panelChats(this, mensajes);
        this.add(panelActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 680, 450));
        this.panelActivo.setVisible(true);
    }

    public void addNotificacion(String notificacion) {
        this.panelNotificaciones.addNotificacion(notificacion);
    }

    public void cerrarSesion() {
        try {
            servidor.cerrarSesion(cliente);
            panelIzq.setVisible(false);
            panelActivo.setVisible(false);
            this.remove(panelIzq);
            this.remove(panelActivo);
            this.panelLogin.setVisible(true);
            this.panelNotificaciones.vaciar();
        } catch (RemoteException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void vaciarCamposLogin() {
        this.NombreText.setText("");
        this.PasswordText.setText("");
        this.PuertoText.setText("");
    }

    public boolean enviarPeticion(String receptor) {
        try {
            return (servidor.enviarPeticion(cliente.getNombre(), receptor));
        } catch (RemoteException ex) {
            Logger.getLogger(GUIClient.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }


}
