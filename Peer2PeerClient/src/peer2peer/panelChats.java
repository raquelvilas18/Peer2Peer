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
public class panelChats extends javax.swing.JPanel {
    GUIClient parent;
    /**
     * Creates new form panelChats
     */
    public panelChats(GUIClient parent) {
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

        panelAmigos = new javax.swing.JPanel();
        panelConversacion = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(680, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(panelAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 440, 450));

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

        add(panelConversacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelAmigos;
    private javax.swing.JPanel panelConversacion;
    // End of variables declaration//GEN-END:variables
}
