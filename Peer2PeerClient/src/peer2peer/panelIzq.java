/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer2peer;

import javax.swing.JFrame;

/**
 *
 * @author raquel
 */
public class panelIzq extends javax.swing.JPanel {

    JFrame parent;
    /**
     * Creates new form panelIzq
     */
    public panelIzq() {
        initComponents();
    }

    public panelIzq(JFrame parent) {
        initComponents();
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonChats.setBackground(new java.awt.Color(204, 255, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHATS");

        javax.swing.GroupLayout botonChatsLayout = new javax.swing.GroupLayout(botonChats);
        botonChats.setLayout(botonChatsLayout);
        botonChatsLayout.setHorizontalGroup(
            botonChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonChatsLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        botonChatsLayout.setVerticalGroup(
            botonChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonChatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(botonChats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, 60));

        botonBuscar.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BUSCAR");

        javax.swing.GroupLayout botonBuscarLayout = new javax.swing.GroupLayout(botonBuscar);
        botonBuscar.setLayout(botonBuscarLayout);
        botonBuscarLayout.setHorizontalGroup(
            botonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonBuscarLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        botonBuscarLayout.setVerticalGroup(
            botonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 240, 60));

        botonPeticiones.setBackground(new java.awt.Color(0, 255, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PETICIONES");

        javax.swing.GroupLayout botonPeticionesLayout = new javax.swing.GroupLayout(botonPeticiones);
        botonPeticiones.setLayout(botonPeticionesLayout);
        botonPeticionesLayout.setHorizontalGroup(
            botonPeticionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPeticionesLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        botonPeticionesLayout.setVerticalGroup(
            botonPeticionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPeticionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(botonPeticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 240, 60));

        botonCuenta.setBackground(new java.awt.Color(255, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PERFIL");

        javax.swing.GroupLayout botonCuentaLayout = new javax.swing.GroupLayout(botonCuenta);
        botonCuenta.setLayout(botonCuentaLayout);
        botonCuentaLayout.setHorizontalGroup(
            botonCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonCuentaLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        botonCuentaLayout.setVerticalGroup(
            botonCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(botonCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 240, 60));

        fotoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/round-account-button-with-user-inside_icon-icons.com_72596 (1).png"))); // NOI18N
        add(fotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 140));

        nombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreUsuario.setText("USUARIO");
        add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonBuscar;
    private javax.swing.JPanel botonChats;
    private javax.swing.JPanel botonCuenta;
    private javax.swing.JPanel botonPeticiones;
    private javax.swing.JLabel fotoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
