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
public class panelDer extends javax.swing.JPanel {
    
    JFrame parent;

    /**
     * Creates new form panelDer
     */
    
    public panelDer(){
        initComponents();
    }
    public panelDer(JFrame parent) {
        initComponents();
        this.parent = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(panelChats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

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
            .addGap(0, 35, Short.MAX_VALUE)
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

        add(panelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

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
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
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

        add(panelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

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
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
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
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
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

        add(panelPeticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buscar;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JPanel enviarPeticion;
    private javax.swing.JPanel enviarPeticion1;
    private javax.swing.JPanel enviarPeticion2;
    private javax.swing.JPanel enviarPeticion3;
    private javax.swing.JPanel enviarPeticion4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelAmigos;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelChats;
    private javax.swing.JPanel panelConversacion;
    private javax.swing.JPanel panelPerfil;
    private javax.swing.JPanel panelPeticiones;
    // End of variables declaration//GEN-END:variables
}
