/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer2peer;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author raquel
 */
public class panelIzq extends javax.swing.JPanel {

    GUIClient parent;
    /**
     * Creates new form panelIzq
     */
    public panelIzq() {
        initComponents();
    }

    public panelIzq(GUIClient parent, String nombre) {
        this.parent = parent;
        initComponents();
        
        this.nombreUsuario.setText(nombre);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonChats = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonPeticiones = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botonCuenta = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fotoUsuario = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JLabel();

        setBackground(new java.awt.Color(43, 96, 113));
        setMinimumSize(new java.awt.Dimension(240, 450));
        setPreferredSize(new java.awt.Dimension(240, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonChats.setBackground(new java.awt.Color(67, 117, 133));
        botonChats.setForeground(new java.awt.Color(67, 117, 133));
        botonChats.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChatsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChatsMouseExited1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChatsMouseEntered(evt);
            }
        });
        botonChats.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("chats");
        botonChats.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 12, 129, 26));

        add(botonChats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 250, 50));

        botonBuscar.setBackground(new java.awt.Color(67, 117, 133));
        botonBuscar.setForeground(new java.awt.Color(67, 117, 133));
        botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBuscarMouseExited1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBuscarMouseEntered(evt);
            }
        });
        botonBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("buscar");
        botonBuscar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 12, 129, 26));

        add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 250, 50));

        botonPeticiones.setBackground(new java.awt.Color(67, 117, 133));
        botonPeticiones.setForeground(new java.awt.Color(67, 117, 133));
        botonPeticiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPeticiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPeticionesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonPeticionesMouseExited1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonPeticionesMouseEntered(evt);
            }
        });
        botonPeticiones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("DejaVu Sans Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("peticiones");
        botonPeticiones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 12, 129, 26));

        add(botonPeticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 250, 50));

        botonCuenta.setBackground(new java.awt.Color(67, 117, 133));
        botonCuenta.setForeground(new java.awt.Color(67, 117, 133));
        botonCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCuentaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCuentaMouseExited1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCuentaMouseEntered(evt);
            }
        });
        botonCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("DejaVu Sans Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("perfil");
        botonCuenta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 12, 129, 26));

        add(botonCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 250, 50));

        fotoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-usuario-masculino-en-círculo-100.png"))); // NOI18N
        add(fotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 120));

        nombreUsuario.setFont(new java.awt.Font("DejaVu Sans Light", 0, 14)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(253, 225, 190));
        nombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreUsuario.setText("USUARIO");
        add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 30));

        cerrarSesion.setForeground(new java.awt.Color(254, 254, 254));
        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-apagar-18.png"))); // NOI18N
        cerrarSesion.setText("Cerrar sesión");
        cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseClicked(evt);
            }
        });
        add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonChatsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChatsMouseEntered
        // TODO add your handling code here:
        botonChats.setBackground(new Color(82,137,155));
    }//GEN-LAST:event_botonChatsMouseEntered

    private void botonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseEntered
        // TODO add your handling code here:
        botonBuscar.setBackground(new Color(82,137,155));
    }//GEN-LAST:event_botonBuscarMouseEntered

    private void botonPeticionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPeticionesMouseEntered
        // TODO add your handling code here:
        botonPeticiones.setBackground(new Color(82,137,155));
    }//GEN-LAST:event_botonPeticionesMouseEntered

    private void botonCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCuentaMouseEntered
        // TODO add your handling code here:
        botonCuenta.setBackground(new Color(82,137,155));
    }//GEN-LAST:event_botonCuentaMouseEntered

    private void botonChatsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChatsMouseExited
        // TODO add your handling code here:
        botonChats.setBackground(new Color(67,117,133));
    }//GEN-LAST:event_botonChatsMouseExited

    private void botonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseExited
        // TODO add your handling code here:
        botonBuscar.setBackground(new Color(67,117,133));
    }//GEN-LAST:event_botonBuscarMouseExited

    private void botonPeticionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPeticionesMouseExited
        // TODO add your handling code here:
        botonPeticiones.setBackground(new Color(67,117,133));
    }//GEN-LAST:event_botonPeticionesMouseExited

    private void botonCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCuentaMouseExited
        // TODO add your handling code here:
        botonCuenta.setBackground(new Color(67,117,133));
    }//GEN-LAST:event_botonCuentaMouseExited

    private void botonChatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChatsMouseClicked
        // TODO add your handling code here:
        parent.panelChats();
    }//GEN-LAST:event_botonChatsMouseClicked

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        // TODO add your handling code here:
        parent.panelBusqueda();
    }//GEN-LAST:event_botonBuscarMouseClicked
                                           

    private void botonCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCuentaMouseClicked
        // TODO add your handling code here:
        parent.panelPerfil();
    }//GEN-LAST:event_botonCuentaMouseClicked

    private void botonPeticionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPeticionesMouseClicked
        // TODO add your handling code here:
        parent.panelPeticiones();
    }//GEN-LAST:event_botonPeticionesMouseClicked

    private void botonChatsMouseExited1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChatsMouseExited1
        // TODO add your handling code here:
        botonChats.setBackground(new Color(67,117,133));
    }//GEN-LAST:event_botonChatsMouseExited1

    private void botonBuscarMouseExited1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseExited1
        // TODO add your handling code here:
        botonBuscar.setBackground(new Color(67,117,133));
    }//GEN-LAST:event_botonBuscarMouseExited1

    private void botonPeticionesMouseExited1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPeticionesMouseExited1
        // TODO add your handling code here:
        botonPeticiones.setBackground(new Color(67,117,133));
    }//GEN-LAST:event_botonPeticionesMouseExited1

    private void botonCuentaMouseExited1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCuentaMouseExited1
        // TODO add your handling code here:
        botonCuenta.setBackground(new Color(67,117,133));
    }//GEN-LAST:event_botonCuentaMouseExited1

    private void cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseClicked
        // TODO add your handling code here:
        parent.cerrarSesion();
    }//GEN-LAST:event_cerrarSesionMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonBuscar;
    private javax.swing.JPanel botonChats;
    private javax.swing.JPanel botonCuenta;
    private javax.swing.JPanel botonPeticiones;
    private javax.swing.JLabel cerrarSesion;
    private javax.swing.JLabel fotoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
