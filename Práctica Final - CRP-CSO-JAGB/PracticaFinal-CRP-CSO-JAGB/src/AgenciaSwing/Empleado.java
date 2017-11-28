/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Empleado
 */
package AgenciaSwing;

import AgenciaEmpleo.Agencia;
import AgenciaEmpleo.Candidato;
import AgenciaEmpleo.Oficina;
import AgenciaEmpleo.UtilSistema;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Menu principal del usuario
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class Empleado extends javax.swing.JFrame {

    private Agencia agen = new Agencia();//Creo una nueva agencia

    /**
     * Constructor
     */
    public Empleado() {
        UtilSistema.cargarDatos();
        initComponents();
        this.setLocationRelativeTo(null);//Centramos la pantalla
        PanelFondo F = new PanelFondo(); //Creamos el objeto F de tipo PanelFondo
        this.add(F, BorderLayout.CENTER);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        GestionOfertas = new javax.swing.JButton();
        GestionCandidatos = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonCandidatos = new javax.swing.JButton();
        jButtonOfertas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agencia de Empleo - Menu empleado");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e-Business.jpg"))); // NOI18N
        Logo.setText("jLabel5");

        jLabelTitulo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabelTitulo.setText("AGENCIA DE EMPLEO");
        jLabelTitulo.setToolTipText("");
        jLabelTitulo.setAlignmentX(0.5F);
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        GestionOfertas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        GestionOfertas.setText("Gestión de Empresas");
        GestionOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionOfertasActionPerformed(evt);
            }
        });

        GestionCandidatos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        GestionCandidatos.setText("Gestión de Candidatos");
        GestionCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionCandidatosActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(0, 102, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonCandidatos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonCandidatos.setText("Busqueda de Oferta para Candidatos ");
        jButtonCandidatos.setToolTipText("");
        jButtonCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCandidatosActionPerformed(evt);
            }
        });

        jButtonOfertas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonOfertas.setText("Búsqueda de Candidato para Ofertas");
        jButtonOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOfertasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabelTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonOfertas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonCandidatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(GestionCandidatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(GestionOfertas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 322, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(91, 91, 91)
                        .addComponent(GestionOfertas)
                        .addGap(37, 37, 37)
                        .addComponent(GestionCandidatos)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonCandidatos)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonOfertas)
                        .addGap(0, 183, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setBounds(0, 0, 1126, 597);
    }// </editor-fold>//GEN-END:initComponents

    private void GestionOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionOfertasActionPerformed
        // Al seleccionar el botón nos abre la ventana que nos permite ver todas las ofertas de trabajo de las empresas
        GestionEmpresas ofertas = new GestionEmpresas();
        ofertas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GestionOfertasActionPerformed

    private void GestionCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionCandidatosActionPerformed
        // TODO add your handling code here:
        GestionCandidatos candidatos = new GestionCandidatos();
        candidatos.setVisible(true);
        this.setVisible(false);

        //arrayAuxCan.add(candidatos.getCan());
        //agen.setCandidato(arrayAuxCan);// con ello lo metemos dentro de la clase Agencia
    }//GEN-LAST:event_GestionCandidatosActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        CerrarSesion salir = new CerrarSesion();
        this.setVisible(false);
        salir.setVisible(true);

    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCandidatosActionPerformed
        //Nos abrirá la ventana donde el empleado podrá visualizar los candidatos y ofertas existentes en la Agencia
        BusquedaOfertaParaCandidato busqueda = new BusquedaOfertaParaCandidato();
        busqueda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCandidatosActionPerformed

    private void jButtonOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOfertasActionPerformed
        BusquedaCandidatoParaOferta busqueda = new BusquedaCandidatoParaOferta();
        busqueda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonOfertasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        UtilSistema.guardarDatos();
        VentanaPrincipal principal = new VentanaPrincipal();
        principal.setVisible(true);

    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GestionCandidatos;
    private javax.swing.JButton GestionOfertas;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton jButtonCandidatos;
    private javax.swing.JButton jButtonOfertas;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
