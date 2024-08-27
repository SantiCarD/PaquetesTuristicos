/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PaqueteAventurero;
import model.PaqueteTuristico;
import model.ReservaEquipamiento;
import services.ServicioPaquete;

/**
 *
 * @author Personal
 */
public class GUIListarPA extends javax.swing.JFrame {
    
    private ServicioPaquete s;
    /**
     * Creates new form GUIListarPA
     */
    public GUIListarPA(ServicioPaquete s) {
        initComponents();
        setLocationRelativeTo(this);
        this.s = s;
    }


    public void Servicio(ServicioPaquete s)
    {
        this.s = s;
    }
    private void listarPaquetes() {
    DefaultTableModel model = (DefaultTableModel) TablaPA.getModel();
    model.setRowCount(0); 
    
    ArrayList<PaqueteTuristico> paquetes = s.getPaquetes();
    
    for (PaqueteTuristico paquete : paquetes) {
         if (paquete instanceof PaqueteAventurero) {
        PaqueteAventurero paqueteAventurero = (PaqueteAventurero) paquete;
        if(s.verificarElementos(paqueteAventurero.getElementos().getElemento1()))
        {
            model.addRow(new Object[]{
            paqueteAventurero.getNombre(),
            paqueteAventurero.getRestriccionEdad()+" Años",
            "$"+paqueteAventurero.getPrecio(),
            paqueteAventurero.getFechaInicio(),
            paqueteAventurero.getFechaFin(),
            "No Hay Elementos",
            paqueteAventurero.toStringE()
        });
        }
        else
        {
            model.addRow(new Object[]{
            paqueteAventurero.getNombre(),
            paqueteAventurero.getRestriccionEdad()+" Años",
            "$"+paqueteAventurero.getPrecio(),
            paqueteAventurero.getFechaInicio(),
            paqueteAventurero.getFechaFin(),
            paqueteAventurero.getElementos().toStringE(),
            paqueteAventurero.toStringE()
        });
        }
            
                ;
    } 
         else {
             JOptionPane.showMessageDialog(null, "Nopuedo");
         }
    }
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPA = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ListarPA");

        TablaPA.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        TablaPA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "EdadMinima", "Precio", "FechaInicio", "FechaFin", "Equipamiento", "Actividades"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPA.setPreferredSize(new java.awt.Dimension(500, 300));
        TablaPA.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(TablaPA);
        if (TablaPA.getColumnModel().getColumnCount() > 0) {
            TablaPA.getColumnModel().getColumn(0).setMinWidth(40);
            TablaPA.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaPA.getColumnModel().getColumn(0).setMaxWidth(60);
            TablaPA.getColumnModel().getColumn(1).setMinWidth(80);
            TablaPA.getColumnModel().getColumn(1).setPreferredWidth(80);
            TablaPA.getColumnModel().getColumn(1).setMaxWidth(90);
            TablaPA.getColumnModel().getColumn(2).setMinWidth(40);
            TablaPA.getColumnModel().getColumn(2).setPreferredWidth(40);
            TablaPA.getColumnModel().getColumn(2).setMaxWidth(70);
            TablaPA.getColumnModel().getColumn(3).setMinWidth(60);
            TablaPA.getColumnModel().getColumn(3).setPreferredWidth(60);
            TablaPA.getColumnModel().getColumn(3).setMaxWidth(70);
            TablaPA.getColumnModel().getColumn(4).setMinWidth(30);
            TablaPA.getColumnModel().getColumn(4).setPreferredWidth(50);
            TablaPA.getColumnModel().getColumn(4).setMaxWidth(70);
            TablaPA.getColumnModel().getColumn(5).setMinWidth(40);
            TablaPA.getColumnModel().getColumn(5).setPreferredWidth(80);
            TablaPA.getColumnModel().getColumn(5).setMaxWidth(300);
            TablaPA.getColumnModel().getColumn(6).setMinWidth(40);
            TablaPA.getColumnModel().getColumn(6).setPreferredWidth(80);
            TablaPA.getColumnModel().getColumn(6).setMaxWidth(300);
        }

        jLabel1.setBackground(new java.awt.Color(50, 33, 20));
        jLabel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listar Paquete Aventurero");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(143, 220, 54));

        jButton1.setFont(new java.awt.Font("Segoe Print", 2, 10)); // NOI18N
        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(346, 346, 346))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(166, 235, 248));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(201, 201, 201))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 299, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         listarPaquetes();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
