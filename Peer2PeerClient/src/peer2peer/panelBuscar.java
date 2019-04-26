/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer2peer;

import java.awt.event.KeyEvent;
import java.rmi.RemoteException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class panelBuscar extends javax.swing.JPanel {

    GUIClient parent;
    String usuario;

    /**
     * Creates new form panelDer
     */
    public panelBuscar() {
        initComponents();
    }

    public panelBuscar(GUIClient parent, String usuario) {
        initComponents();
        this.parent = parent;
        this.usuario = usuario;
        this.peticionCorrecta.setVisible(false);
        this.peticionIncorrecta.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoBuscar = new javax.swing.JTextField();
        buscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBuscar = new javax.swing.JTable();
        enviarPeticion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        peticionCorrecta = new javax.swing.JLabel();
        peticionIncorrecta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));
        setMaximumSize(new java.awt.Dimension(580, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoBuscarKeyPressed(evt);
            }
        });
        add(campoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 90, 420, 35));

        buscar.setBackground(new java.awt.Color(210, 134, 48));
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        buscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-búsqueda-30.png"))); // NOI18N
        buscar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 38, 35));

        add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, 35));

        tablaBuscar.setModel(new ModeloTablaUsuarios());
        tablaBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBuscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBuscar);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 470, 200));

        enviarPeticion.setBackground(new java.awt.Color(67, 117, 133));
        enviarPeticion.setForeground(new java.awt.Color(67, 117, 133));
        enviarPeticion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarPeticion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarPeticionMouseClicked(evt);
            }
        });
        enviarPeticion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enviar petición");
        enviarPeticion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 157, 40));

        add(enviarPeticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 260, 40));

        peticionCorrecta.setForeground(new java.awt.Color(0, 255, 51));
        peticionCorrecta.setText("Petición de amistad enviada correctamente.");
        add(peticionCorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 370, -1));

        peticionIncorrecta.setForeground(new java.awt.Color(255, 51, 0));
        peticionIncorrecta.setText("Fallo al enviar la petición de amistad");
        add(peticionIncorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 360, -1));

        jPanel1.setBackground(new java.awt.Color(234, 168, 87));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Buscar usuarios");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 460, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 720, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        // TODO add your handling code here:
        this.peticionCorrecta.setVisible(false);
        this.peticionIncorrecta.setVisible(false);
        ModeloTablaUsuarios tabla = new ModeloTablaUsuarios();
        tablaBuscar.setModel(tabla);
        tabla.setFilas(new ArrayList<String>());
        try {
            if (campoBuscar.getText() == null || campoBuscar.getText().equals("")) {
                campoBuscar.setText("");
            }
            String[] usuarios = parent.getServidor().buscarPersona(usuario, campoBuscar.getText().toLowerCase());
            if (usuarios.length > 0) {
                tabla = new ModeloTablaUsuarios();
                tablaBuscar.setModel(tabla);
                ArrayList<String> filas = new ArrayList<>(Arrays.asList(usuarios));
                tabla.setFilas(filas);
            }
        } catch (Exception ex) {
            System.out.println("Fallo buscando usuarios (buscarMouseClicked)");
        }
    }//GEN-LAST:event_buscarMouseClicked

    private void tablaBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBuscarMouseClicked
        // TODO add your handling code here:
        this.peticionCorrecta.setVisible(false);
        this.peticionIncorrecta.setVisible(false);
    }//GEN-LAST:event_tablaBuscarMouseClicked

    private void enviarPeticionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarPeticionMouseClicked
        // TODO add your handling code here:
        ModeloTablaUsuarios m = (ModeloTablaUsuarios) tablaBuscar.getModel();
        if (parent.enviarPeticion(m.getFila(tablaBuscar.getSelectedRow()))) {
            this.peticionCorrecta.setVisible(true);
            this.peticionIncorrecta.setVisible(false);
        } else {
            this.peticionCorrecta.setVisible(false);
            this.peticionIncorrecta.setVisible(true);
        }
//        try{
//            String receptor = m.getFila(tablaBuscar.getSelectedRow());
//            if(parent.getServidor().enviarPeticion(parent.getClienteIm().getNombre(), receptor)){
//                this.peticionCorrecta.setVisible(true);
//                this.peticionIncorrecta.setVisible(false);
//            }else{
//                this.peticionCorrecta.setVisible(false);
//                this.peticionIncorrecta.setVisible(true);
//            }
//        }catch(Exception ex){
//            this.peticionCorrecta.setVisible(false);
//            this.peticionIncorrecta.setVisible(true);
//            System.out.println("Fallo enviando peticion (enviarPeticionMouseClicked");
//        }

    }//GEN-LAST:event_enviarPeticionMouseClicked

    private void campoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                this.peticionCorrecta.setVisible(false);
                this.peticionIncorrecta.setVisible(false);
                ModeloTablaUsuarios tabla = new ModeloTablaUsuarios();
                tablaBuscar.setModel(tabla);
                tabla.setFilas(new ArrayList<String>());
                
                if (campoBuscar.getText() == null || campoBuscar.getText().equals("")) {
                    campoBuscar.setText("");
                }
                String[] usuarios = parent.getServidor().buscarPersona(usuario, campoBuscar.getText().toLowerCase());
                if (usuarios.length > 0) {
                    tabla = new ModeloTablaUsuarios();
                    tablaBuscar.setModel(tabla);
                    ArrayList<String> filas = new ArrayList<>(Arrays.asList(usuarios));
                    tabla.setFilas(filas);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(panelBuscar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoBuscarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buscar;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JPanel enviarPeticion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel peticionCorrecta;
    private javax.swing.JLabel peticionIncorrecta;
    private javax.swing.JTable tablaBuscar;
    // End of variables declaration//GEN-END:variables
}
