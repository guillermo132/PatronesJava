/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.NuevoCandidato;
import AgenciaEmpleo.UtilAgencia;
import Clases.VerCandidatos;
import Singleton.Serializa;
import java.awt.IllegalComponentStateException;

public class Principal extends javax.swing.JFrame {
    
    public Login login;
   
    UtilAgencia agencia;
    public Principal() {
       try{
          this.agencia=new UtilAgencia();
            //Serializa.creaSerializa(); 
            Serializa.getDatosCandidatos();
            Serializa.getDatosOficinas();
            Serializa.getDatosOfertas();
            UtilAgencia.getListaOcupacionCNO();
            initComponents();
       }
       catch(IllegalComponentStateException e){}
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anagrama1 = new Interfaz.Anagrama();
        btnSalir = new javax.swing.JButton();
        btnAsignar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnNuevasOfe = new javax.swing.JButton();
        btnNuevosCan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnOfertas = new javax.swing.JButton();
        btnCandidatos = new javax.swing.JButton();
        btnVerCandidatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Panel Principal ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btnSalir.setText("Cerrar Sesión");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAsignar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/asi.png"))); // NOI18N
        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNuevasOfe.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnNuevasOfe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/nof.png"))); // NOI18N
        btnNuevasOfe.setText("Recibir Ofertas");
        btnNuevasOfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevasOfeActionPerformed(evt);
            }
        });

        btnNuevosCan.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnNuevosCan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/per.png"))); // NOI18N
        btnNuevosCan.setText("Recibir Candidatos");
        btnNuevosCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevosCanActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnNuevasOfe, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btnNuevosCan, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(btnNuevasOfe)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 123, Short.MAX_VALUE)
                .add(btnNuevosCan)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOfertas.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnOfertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ver.png"))); // NOI18N
        btnOfertas.setText("Buscar Ofertas");
        btnOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfertasActionPerformed(evt);
            }
        });

        btnCandidatos.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnCandidatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ver.png"))); // NOI18N
        btnCandidatos.setText("Buscar Candidatos");
        btnCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidatosActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnOfertas, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btnCandidatos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(btnOfertas)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 111, Short.MAX_VALUE)
                .add(btnCandidatos)
                .addContainerGap())
        );

        btnVerCandidatos.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnVerCandidatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/peronly.png"))); // NOI18N
        btnVerCandidatos.setText("Candidatos");
        btnVerCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCandidatosActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(btnSalir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(btnVerCandidatos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btnAsignar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(37, 37, 37))
            .add(layout.createSequentialGroup()
                .add(anagrama1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(27, 27, 27)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(btnAsignar)
                            .add(130, 130, 130)
                            .add(btnVerCandidatos))
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 9, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(anagrama1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(btnSalir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(19, 19, 19))))
        );

        setSize(new java.awt.Dimension(983, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        login.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Serializa.guardarDatosCandidatos();
        Serializa.guardarDatosOficinas();
        Serializa.guardarDatosOfertas();
       // this.setVisible(false);
       // login.setVisible(true);
         System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     Abre la ventana de Asignar
     */
    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        Asignacion a = new Asignacion(this);
    }//GEN-LAST:event_btnAsignarActionPerformed

   /**
     Abre la ventana de NuevoCandidato
     */
    private void btnNuevosCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevosCanActionPerformed
        NuevoCandidato nc = new NuevoCandidato(this);
    }//GEN-LAST:event_btnNuevosCanActionPerformed

   /**
     Abre la ventana de NuevaOferta
     */ 
    private void btnNuevasOfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevasOfeActionPerformed
        NuevaOferta no = new NuevaOferta(this);
    }//GEN-LAST:event_btnNuevasOfeActionPerformed

    private void btnVerCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCandidatosActionPerformed
        VerCandidatos vc = new VerCandidatos(this);
    }//GEN-LAST:event_btnVerCandidatosActionPerformed

    private void btnOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfertasActionPerformed
        Ofertas o = new Ofertas(this);
    }//GEN-LAST:event_btnOfertasActionPerformed

    private void btnCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidatosActionPerformed
        Candidatos c = new Candidatos(this);
    }//GEN-LAST:event_btnCandidatosActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Interfaz.Anagrama anagrama1;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnCandidatos;
    private javax.swing.JButton btnNuevasOfe;
    private javax.swing.JButton btnNuevosCan;
    private javax.swing.JButton btnOfertas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerCandidatos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
