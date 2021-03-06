/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Tfg;
import Clases.Usuario;
import Singleton.Serializa;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author joserra
 */
public class InterfazTfgOfertadosProfesor extends javax.swing.JFrame {

    /**
     * Creates new form InterfazTfgOfertadosProfesor
     */
    
    private Serializa serializa;
    private Usuario nombreProfesor;
    private ArrayList<Tfg> listaTFG = new ArrayList<>();
    public InterfazTfgOfertadosProfesor(Usuario nombreProfesor, Serializa serializa) {
        initComponents();
        this.serializa = serializa;
        this.nombreProfesor=nombreProfesor;
        cargaDatosListaTfg();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Tus TFG ofertados a los alumnos");

        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Ver Detalles");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String key1 = jList1.getSelectedValue();
            Tfg tfgSeleccionado = null;
                for(int x=0;x<listaTFG.size();x++) {
                    if(listaTFG.get(x).getTitulo().equals(key1)){
                        tfgSeleccionado = listaTFG.get(x);
                    }
                }
            InterfazVisualizarTfg lt = new InterfazVisualizarTfg(this.nombreProfesor, this.serializa, tfgSeleccionado){
                @Override
                public void dispose(){
                    //Hacemos visible la principal
                    getFrame().setVisible(true);
                    //Cerramos
                    super.dispose();
                }
            };
            this.setVisible(false);
            lt.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"No hay TFG seleccionado."); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private JFrame getFrame(){
        return this;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        InterfazProfesor ia = new InterfazProfesor(this.nombreProfesor, this.serializa);
//        this.setVisible(false);
//        ia.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void cargaDatosListaTfg(){
        
        DefaultListModel listModel = new DefaultListModel();
        
        listaTFG = serializa.CargarTfg();
        Iterator<Tfg> it = listaTFG.iterator();
        while (it.hasNext()){
            Tfg key= it.next();
            if(nombreProfesor.getNombre().equals(key.getTutor()) ){
                    listModel.addElement(key.getTitulo());
            }
        }
        jList1.setModel(listModel);
    }
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
