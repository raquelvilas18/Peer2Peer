/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer2peer;

/**
 *
 * @author carlo
 */
public class GUIClient extends javax.swing.JFrame {

    /**
     * Creates new form GUIClient
     */
    public GUIClient() {
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

        jPanel1 = new javax.swing.JPanel();
        panelChats = new javax.swing.JPanel();
        panelAmigos = new javax.swing.JPanel();
        panelConversacion = new javax.swing.JPanel();
        panelBuscar = new javax.swing.JPanel();
        campoBuscar = new javax.swing.JTextField();
        buscar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        enviarPeticion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelPerfil = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        enviarPeticion1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        enviarPeticion2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelPeticiones = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        enviarPeticion3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        enviarPeticion4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelChats.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout panelAmigosLayout = new javax.swing.GroupLayout(panelAmigos);
        panelAmigos.setLayout(panelAmigosLayout);
        panelAmigosLayout.setHorizontalGroup(
            panelAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        panelAmigosLayout.setVerticalGroup(
            panelAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        panelChats.add(panelAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 440, 450));

        panelConversacion.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout panelConversacionLayout = new javax.swing.GroupLayout(panelConversacion);
        panelConversacion.setLayout(panelConversacionLayout);
        panelConversacionLayout.setHorizontalGroup(
            panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        panelConversacionLayout.setVerticalGroup(
            panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        panelChats.add(panelConversacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(panelChats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

        panelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoBuscar.setText("jTextField1");
        panelBuscar.add(campoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 90, 420, 35));

        buscar.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout buscarLayout = new javax.swing.GroupLayout(buscar);
        buscar.setLayout(buscarLayout);
        buscarLayout.setHorizontalGroup(
            buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        buscarLayout.setVerticalGroup(
            buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelBuscar.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 90, -1, 35));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panelBuscar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 470, 200));

        enviarPeticion.setBackground(new java.awt.Color(51, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Enviar petición");

        javax.swing.GroupLayout enviarPeticionLayout = new javax.swing.GroupLayout(enviarPeticion);
        enviarPeticion.setLayout(enviarPeticionLayout);
        enviarPeticionLayout.setHorizontalGroup(
            enviarPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enviarPeticionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        enviarPeticionLayout.setVerticalGroup(
            enviarPeticionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelBuscar.add(enviarPeticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 160, 40));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("BUSCAR USUARIOS");
        panelBuscar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 490, 30));

        jPanel1.add(panelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

        panelPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Contraseña");
        panelPerfil.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 100, 29));

        jLabel7.setText("Nombre usuario");
        panelPerfil.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 100, 29));

        jTextField1.setText("jTextField1");
        panelPerfil.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 180, 30));

        jPasswordField1.setText("jPasswordField1");
        panelPerfil.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 180, 30));

        enviarPeticion1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Enviar petición");

        javax.swing.GroupLayout enviarPeticion1Layout = new javax.swing.GroupLayout(enviarPeticion1);
        enviarPeticion1.setLayout(enviarPeticion1Layout);
        enviarPeticion1Layout.setHorizontalGroup(
            enviarPeticion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(enviarPeticion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(enviarPeticion1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        enviarPeticion1Layout.setVerticalGroup(
            enviarPeticion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(enviarPeticion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(enviarPeticion1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelPerfil.add(enviarPeticion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 160, 40));

        enviarPeticion2.setBackground(new java.awt.Color(51, 204, 255));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Enviar petición");

        javax.swing.GroupLayout enviarPeticion2Layout = new javax.swing.GroupLayout(enviarPeticion2);
        enviarPeticion2.setLayout(enviarPeticion2Layout);
        enviarPeticion2Layout.setHorizontalGroup(
            enviarPeticion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enviarPeticion2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        enviarPeticion2Layout.setVerticalGroup(
            enviarPeticion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelPerfil.add(enviarPeticion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 160, 40));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PERFIL DE USUARIO");
        panelPerfil.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 460, 30));

        jPanel1.add(panelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

        panelPeticiones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PETICIONES DE AMISTAD PENDIENTES");
        panelPeticiones.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 460, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        panelPeticiones.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 140));

        enviarPeticion3.setBackground(new java.awt.Color(51, 204, 255));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ACEPTAR PETICION");

        javax.swing.GroupLayout enviarPeticion3Layout = new javax.swing.GroupLayout(enviarPeticion3);
        enviarPeticion3.setLayout(enviarPeticion3Layout);
        enviarPeticion3Layout.setHorizontalGroup(
            enviarPeticion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(enviarPeticion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(enviarPeticion3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        enviarPeticion3Layout.setVerticalGroup(
            enviarPeticion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(enviarPeticion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(enviarPeticion3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelPeticiones.add(enviarPeticion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 160, 40));

        enviarPeticion4.setBackground(new java.awt.Color(51, 204, 255));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("RECHAZAR PETICION");

        javax.swing.GroupLayout enviarPeticion4Layout = new javax.swing.GroupLayout(enviarPeticion4);
        enviarPeticion4.setLayout(enviarPeticion4Layout);
        enviarPeticion4Layout.setHorizontalGroup(
            enviarPeticion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(enviarPeticion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(enviarPeticion4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        enviarPeticion4Layout.setVerticalGroup(
            enviarPeticion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(enviarPeticion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(enviarPeticion4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelPeticiones.add(enviarPeticion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 160, 40));

        jPanel1.add(panelPeticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 680, 450));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(botonChats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, 60));

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
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 240, 60));

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
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(botonPeticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 240, 60));

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
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(botonCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 240, 60));

        fotoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/round-account-button-with-user-inside_icon-icons.com_72596 (1).png"))); // NOI18N
        jPanel2.add(fotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 140));

        nombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreUsuario.setText("USUARIO");
        jPanel2.add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonBuscar;
    private javax.swing.JPanel botonChats;
    private javax.swing.JPanel botonCuenta;
    private javax.swing.JPanel botonPeticiones;
    private javax.swing.JPanel buscar;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JPanel enviarPeticion;
    private javax.swing.JPanel enviarPeticion1;
    private javax.swing.JPanel enviarPeticion2;
    private javax.swing.JPanel enviarPeticion3;
    private javax.swing.JPanel enviarPeticion4;
    private javax.swing.JLabel fotoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JPanel panelAmigos;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelChats;
    private javax.swing.JPanel panelConversacion;
    private javax.swing.JPanel panelPerfil;
    private javax.swing.JPanel panelPeticiones;
    // End of variables declaration//GEN-END:variables
}
