/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.InfoEmpresa;
import services.ServicioEquipamiento;
import services.ServicioPaquete;
import services.ServicioSingleton;

/**
 *
 * @author Personal
 */
public class GUIPrincipal extends javax.swing.JFrame {
    private ServicioPaquete s;
    private ServicioEquipamiento se;
    private ServicioSingleton si;
    
 
    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
        s = new ServicioPaquete();
        se = new ServicioEquipamiento();
        si = new ServicioSingleton();
        
    }

    public ServicioPaquete getServicioP()
    {
        return s;
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuPaqueteAventurero = new javax.swing.JMenu();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        AgregarPaqueteAventurero = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        BuscarPaqueteAventurero = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        EliminarPaqueteAventurero = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        ListarPaqueteAventurero = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        CalcularPrecioPA = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        PaqueteCultural = new javax.swing.JMenu();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        AgregarPaqueteCultural = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        BuscarPaqueteCultural = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        EliminarPaqueteCultural = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        ListarPaqueteCultural = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        CalcularPrecioPC = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        jSeparator20 = new javax.swing.JPopupMenu.Separator();
        ad = new javax.swing.JMenu();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        AcercaDe = new javax.swing.JMenuItem();
        jSeparator22 = new javax.swing.JPopupMenu.Separator();
        Ayuda = new javax.swing.JMenuItem();
        jSeparator23 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator24 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setPreferredSize(new java.awt.Dimension(460, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/LogoTurismo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 153, 255));
        jMenuBar1.setBorder(null);

        Archivo.setText("Archivo");
        Archivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Archivo.setMaximumSize(new java.awt.Dimension(55, 32767));

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Archivo.add(jMenuItem1);

        jMenuBar1.add(Archivo);

        MenuPaqueteAventurero.setText("PaqueteAventurero");
        MenuPaqueteAventurero.setToolTipText("");
        MenuPaqueteAventurero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuPaqueteAventurero.setIconTextGap(8);
        MenuPaqueteAventurero.setMargin(new java.awt.Insets(3, 4, 3, 4));
        MenuPaqueteAventurero.setMaximumSize(new java.awt.Dimension(121, 32767));
        MenuPaqueteAventurero.setMinimumSize(new java.awt.Dimension(105, 22));
        MenuPaqueteAventurero.setPreferredSize(new java.awt.Dimension(115, 22));
        MenuPaqueteAventurero.add(jSeparator14);

        AgregarPaqueteAventurero.setText("Adicionar Paquete Aventurero");
        AgregarPaqueteAventurero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarPaqueteAventureroActionPerformed(evt);
            }
        });
        MenuPaqueteAventurero.add(AgregarPaqueteAventurero);
        MenuPaqueteAventurero.add(jSeparator5);

        BuscarPaqueteAventurero.setText("Buscar Paquete Aventurero");
        BuscarPaqueteAventurero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPaqueteAventureroActionPerformed(evt);
            }
        });
        MenuPaqueteAventurero.add(BuscarPaqueteAventurero);
        MenuPaqueteAventurero.add(jSeparator6);

        jMenuItem7.setText("Actualizar Paquete Aventurero");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        MenuPaqueteAventurero.add(jMenuItem7);
        MenuPaqueteAventurero.add(jSeparator7);

        EliminarPaqueteAventurero.setText("Eliminar Paquete Aventurero");
        EliminarPaqueteAventurero.setToolTipText("");
        EliminarPaqueteAventurero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPaqueteAventureroActionPerformed(evt);
            }
        });
        MenuPaqueteAventurero.add(EliminarPaqueteAventurero);
        MenuPaqueteAventurero.add(jSeparator8);

        ListarPaqueteAventurero.setText("Listar Paquete Aventurero");
        ListarPaqueteAventurero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarPaqueteAventureroActionPerformed(evt);
            }
        });
        MenuPaqueteAventurero.add(ListarPaqueteAventurero);
        MenuPaqueteAventurero.add(jSeparator9);

        CalcularPrecioPA.setText("Calcular Precio ");
        CalcularPrecioPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularNvlDifActionPerformed(evt);
            }
        });
        MenuPaqueteAventurero.add(CalcularPrecioPA);
        MenuPaqueteAventurero.add(jSeparator11);

        jMenuBar1.add(MenuPaqueteAventurero);

        PaqueteCultural.setText("PaqueteCultural");
        PaqueteCultural.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PaqueteCultural.setMinimumSize(new java.awt.Dimension(99, 22));
        PaqueteCultural.add(jSeparator13);

        AgregarPaqueteCultural.setText("Agregar Paquete Cultural");
        AgregarPaqueteCultural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarPaqueteCulturalActionPerformed(evt);
            }
        });
        PaqueteCultural.add(AgregarPaqueteCultural);
        PaqueteCultural.add(jSeparator1);

        BuscarPaqueteCultural.setText("Buscar Paquete Cultural");
        BuscarPaqueteCultural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPaqueteCulturalActionPerformed(evt);
            }
        });
        PaqueteCultural.add(BuscarPaqueteCultural);
        PaqueteCultural.add(jSeparator10);

        jMenuItem8.setText("Actualizar Paquete Cultura");
        jMenuItem8.setPreferredSize(new java.awt.Dimension(127, 22));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        PaqueteCultural.add(jMenuItem8);
        PaqueteCultural.add(jSeparator2);

        EliminarPaqueteCultural.setText("Eliminar Paquete Cultural");
        EliminarPaqueteCultural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPaqueteCulturalActionPerformed(evt);
            }
        });
        PaqueteCultural.add(EliminarPaqueteCultural);
        PaqueteCultural.add(jSeparator3);

        ListarPaqueteCultural.setText("Listar Paquete Cultural");
        ListarPaqueteCultural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarPaqueteCulturalActionPerformed(evt);
            }
        });
        PaqueteCultural.add(ListarPaqueteCultural);
        PaqueteCultural.add(jSeparator4);

        CalcularPrecioPC.setText("Calcular Precio");
        CalcularPrecioPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularNvlAcomActionPerformed(evt);
            }
        });
        PaqueteCultural.add(CalcularPrecioPC);
        PaqueteCultural.add(jSeparator12);

        jMenuBar1.add(PaqueteCultural);

        jMenu1.setText("Equipamiento");
        jMenu1.setMaximumSize(new java.awt.Dimension(101, 32767));
        jMenu1.setMinimumSize(new java.awt.Dimension(99, 22));
        jMenu1.setPreferredSize(new java.awt.Dimension(101, 22));
        jMenu1.add(jSeparator15);

        jMenuItem2.setText("Agregar Reserva");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator16);

        jMenuItem4.setText("Eliminar Reserva");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator17);

        jMenuItem6.setText("Actualizar Equipamiento");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator18);

        jMenuItem5.setText("Listar Equipamiento");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);
        jMenu1.add(jSeparator19);
        jMenu1.add(jSeparator20);

        jMenuBar1.add(jMenu1);

        ad.setText("Acerca de");
        ad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });
        ad.add(jSeparator21);

        AcercaDe.setText("Desarrolladores");
        AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaDeActionPerformed(evt);
            }
        });
        ad.add(AcercaDe);
        ad.add(jSeparator22);

        Ayuda.setText("Contacto");
        Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaActionPerformed(evt);
            }
        });
        ad.add(Ayuda);
        ad.add(jSeparator23);

        jMenuItem3.setText("Info Empresa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        ad.add(jMenuItem3);
        ad.add(jSeparator24);

        jMenuBar1.add(ad);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void AgregarPaqueteAventureroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarPaqueteAventureroActionPerformed
                GUIAgregarPA agregarPA = new GUIAgregarPA(s,se);
                agregarPA.setVisible(true);

    }//GEN-LAST:event_AgregarPaqueteAventureroActionPerformed

    private void EliminarPaqueteAventureroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPaqueteAventureroActionPerformed
        GUIEliminarPA eliminarPA = new GUIEliminarPA(s);
                eliminarPA.setVisible(true);
    }//GEN-LAST:event_EliminarPaqueteAventureroActionPerformed

    private void ListarPaqueteAventureroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarPaqueteAventureroActionPerformed
                GUIListarPA listarPA = new GUIListarPA(s,se);
                listarPA.setVisible(true);
    }//GEN-LAST:event_ListarPaqueteAventureroActionPerformed

    private void BuscarPaqueteAventureroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPaqueteAventureroActionPerformed
        GUIBuscarPA buscarPA = new GUIBuscarPA(s);
                buscarPA.setVisible(true);
    }//GEN-LAST:event_BuscarPaqueteAventureroActionPerformed

    private void AgregarPaqueteCulturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarPaqueteCulturalActionPerformed
        GUIAgregarPC agregarPC = new GUIAgregarPC(s);
                agregarPC.setVisible(true);
    }//GEN-LAST:event_AgregarPaqueteCulturalActionPerformed

    private void EliminarPaqueteCulturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPaqueteCulturalActionPerformed
        GUIEliminarPC eliminarPC = new GUIEliminarPC(s);
                eliminarPC.setVisible(true);
    }//GEN-LAST:event_EliminarPaqueteCulturalActionPerformed

    private void BuscarPaqueteCulturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPaqueteCulturalActionPerformed
        GUIBuscarPC buscarPC = new GUIBuscarPC(s);
                buscarPC.setVisible(true);
    }//GEN-LAST:event_BuscarPaqueteCulturalActionPerformed

    private void ListarPaqueteCulturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarPaqueteCulturalActionPerformed
        GUIListarPC listarPC = new GUIListarPC(s);
                listarPC.setVisible(true);
    }//GEN-LAST:event_ListarPaqueteCulturalActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed

    }//GEN-LAST:event_adActionPerformed

    private void CalcularNvlAcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularNvlAcomActionPerformed
        GUIPrecioPC ayuda = new GUIPrecioPC(s);
        ayuda.setVisible(true);
    }//GEN-LAST:event_CalcularNvlAcomActionPerformed

    private void CalcularNvlDifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularNvlDifActionPerformed
        GUIPrecioPA ayuda = new GUIPrecioPA(s);
        ayuda.setVisible(true);
    }//GEN-LAST:event_CalcularNvlDifActionPerformed

    private void AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaActionPerformed
        GUIAyuda ayuda = new GUIAyuda();
        ayuda.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_AyudaActionPerformed

    private void AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaDeActionPerformed
        GUIDesarrolladores cambiar = new GUIDesarrolladores();
        cambiar.setVisible(true);
    }//GEN-LAST:event_AcercaDeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    System.exit(0);    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        GUIAgregarRE eq = new GUIAgregarRE(se);
        eq.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        GUIInfoEmpresa ie = new GUIInfoEmpresa(si);
        ie.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       GUIEliminarRE ee = new GUIEliminarRE(se);
       ee.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        GUIActualizarRE gare = new GUIActualizarRE(se);
        gare.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
             GUIActualizarPA gare = new GUIActualizarPA(s,se);
             gare.setVisible(true);  
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        GUIListarRE glre = new GUIListarRE(se);
        glre.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        GUIActualizarPC gapc = new GUIActualizarPC(s);
        gapc.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed
     
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
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true); 
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AcercaDe;
    private javax.swing.JMenuItem AgregarPaqueteAventurero;
    private javax.swing.JMenuItem AgregarPaqueteCultural;
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenuItem Ayuda;
    private javax.swing.JMenuItem BuscarPaqueteAventurero;
    private javax.swing.JMenuItem BuscarPaqueteCultural;
    private javax.swing.JMenuItem CalcularPrecioPA;
    private javax.swing.JMenuItem CalcularPrecioPC;
    private javax.swing.JMenuItem EliminarPaqueteAventurero;
    private javax.swing.JMenuItem EliminarPaqueteCultural;
    private javax.swing.JMenuItem ListarPaqueteAventurero;
    private javax.swing.JMenuItem ListarPaqueteCultural;
    private javax.swing.JMenu MenuPaqueteAventurero;
    private javax.swing.JMenu PaqueteCultural;
    private javax.swing.JMenu ad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator22;
    private javax.swing.JPopupMenu.Separator jSeparator23;
    private javax.swing.JPopupMenu.Separator jSeparator24;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
