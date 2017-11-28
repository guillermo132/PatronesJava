/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import AgenciaEmpleo.UtilAgencia;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author PeCeS
 */
public class Asignacion extends javax.swing.JFrame {

    private Principal principal;
    DefaultListModel modelo = new DefaultListModel();
    
    
    /**
     * Creates new form Asignacion
     * @param ventana 
     */
    public Asignacion(Principal ventana) {
        principal = ventana;
        ventana.setVisible(false);
        initComponents();
        //inicio();
        rellenarCNO();
        cbOcupacion.setSelectedItem(1);
        listaCNO.setModel(modelo);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgTipo = new javax.swing.ButtonGroup();
        rbgBusqueda = new javax.swing.ButtonGroup();
        anagrama1 = new Interfaz.Anagrama();
        jPanel1 = new javax.swing.JPanel();
        rbCandidatos = new javax.swing.JRadioButton();
        rbOfertas = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        txtPalabras = new javax.swing.JTextField();
        cbOcupacion = new javax.swing.JComboBox();
        rbOcupacion = new javax.swing.JRadioButton();
        rbPalabrasC = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCanOfe = new javax.swing.JTable();
        btnAdjudicar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMejores = new javax.swing.JTable();
        btnBuscarCanOfe = new javax.swing.JButton();
        txtPC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelFoto = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaCNO = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbgTipo.add(rbCandidatos);
        rbCandidatos.setSelected(true);
        rbCandidatos.setText("Candidatos");

        rbgTipo.add(rbOfertas);
        rbOfertas.setText("Ofertas");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(rbCandidatos)
                    .add(rbOfertas))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(rbCandidatos)
                .add(18, 18, 18)
                .add(rbOfertas)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPalabras.setEnabled(false);

        cbOcupacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbOcupacion.setSelectedIndex(-1);

        rbgBusqueda.add(rbOcupacion);
        rbOcupacion.setSelected(true);
        rbOcupacion.setText("Ocupación");
        rbOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOcupacionActionPerformed(evt);
            }
        });

        rbgBusqueda.add(rbPalabrasC);
        rbPalabrasC.setText("Palabras Clave");
        rbPalabrasC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPalabrasCActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(rbOcupacion)
                        .add(41, 41, 41))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(rbPalabrasC)
                        .add(18, 18, 18)))
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cbOcupacion, 0, 888, Short.MAX_VALUE)
                    .add(txtPalabras))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cbOcupacion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rbOcupacion))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtPalabras, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rbPalabrasC))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablaCanOfe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCanOfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCanOfeMouseClicked(evt);
            }
        });
        tablaCanOfe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaCanOfeKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCanOfe);

        btnAdjudicar.setText("Adjudicar");
        btnAdjudicar.setEnabled(false);
        btnAdjudicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjudicarActionPerformed(evt);
            }
        });

        tablaMejores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaMejores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMejoresMouseClicked(evt);
            }
        });
        tablaMejores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaMejoresKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tablaMejores);

        btnBuscarCanOfe.setText("Mejores Candidatos");
        btnBuscarCanOfe.setEnabled(false);
        btnBuscarCanOfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCanOfeActionPerformed(evt);
            }
        });

        txtPC.setEditable(false);
        txtPC.setEnabled(false);

        jLabel2.setText("Palabras Clave: ");

        jLabel1.setText("Ocupaciones CNO-11: ");

        listaCNO.setEnabled(false);
        jScrollPane3.setViewportView(listaCNO);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1195, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1195, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                            .add(76, 76, 76)
                            .add(labelFoto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(18, 18, 18)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel2)
                                .add(jLabel1))
                            .add(18, 18, 18)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(txtPC)
                                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btnBuscar))
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                            .add(40, 40, 40)
                            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createSequentialGroup()
                            .addContainerGap()
                            .add(anagrama1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(72, 72, 72)
                            .add(btnAdjudicar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 153, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(0, 0, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(463, 463, 463)
                .add(btnBuscarCanOfe, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 193, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(jLabel1)
                                .add(39, 39, 39))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(btnBuscar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(txtPC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(19, 19, 19))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, labelFoto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnBuscarCanOfe, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(anagrama1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnAdjudicar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(77, 77, 77))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1271)/2, (screenSize.height-676)/2, 1271, 676);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void rbPalabrasCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPalabrasCActionPerformed
        cbOcupacion.setEnabled(false);
        txtPalabras.setEnabled(true);
        cbOcupacion.setSelectedIndex(0);
    }//GEN-LAST:event_rbPalabrasCActionPerformed

    private void rbOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOcupacionActionPerformed
        cbOcupacion.setEnabled(true);
        txtPalabras.setText("");
        txtPalabras.setEnabled(false);
    }//GEN-LAST:event_rbOcupacionActionPerformed
    /**
     Método que busca las Ofertas/Candidatos con el filtro que hemos puesto
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cno = cbOcupacion.getSelectedItem().toString();
        Boolean busca = false;
        if(rbOcupacion.isSelected())
        {
            if(UtilAgencia.comprobarListaCNOOferta(cno))
            { 
               busca = true;
            }
        }
        else
        {
            if(!txtPC.getText().equals("") && txtPC.getText().length() > 4)
            {
                busca = true;
            }
        }
   
        if(busca){
            UtilAgencia.borrarTablaMejores(tablaMejores);
            modelo.clear();
            txtPC.setText("");
            labelFoto.setIcon(null);
            btnAdjudicar.setEnabled(false);
            String rbTipo, buscar;
            if( rbOcupacion.isSelected() ) {
                rbTipo = "Ocupacion"; 
                buscar = cbOcupacion.getSelectedItem().toString();
            } else{
                rbTipo="Palabras";
                buscar = txtPalabras.getText();
            }
            if( rbCandidatos.isSelected()) {
                btnBuscarCanOfe.setText("Buscar Mejores Ofertas");
                 UtilAgencia.mostrarCandidatosBuscados(tablaCanOfe, buscar, rbTipo);
            }
            else{
                btnBuscarCanOfe.setText("Buscar Mejores Candidatos");
                 UtilAgencia.mostrarOfertasBuscadas(tablaCanOfe, buscar, rbTipo);
            }
            btnBuscarCanOfe.setEnabled(true);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Introduce algún dato correcto", "Datos Incorrectos", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     Busca sus mejores ofertas o candidatos
     */
    private void btnBuscarCanOfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCanOfeActionPerformed
        btnAdjudicar.setEnabled(true);
        boolean selec = true;
        for (int i = 0; i < tablaCanOfe.getRowCount(); i++) {
            if(tablaCanOfe.isRowSelected(i))
            {
                selec = false;
                int row = tablaCanOfe.getSelectedRow();
                String rbTipo, buscar;

                if( rbOcupacion.isSelected() ) {
                    rbTipo = "Ocupacion"; 
                    buscar = cbOcupacion.getSelectedItem().toString();
                } else{
                    rbTipo="Palabras";
                    buscar = txtPalabras.getText();
                }

                if( rbCandidatos.isSelected() ) 
                    UtilAgencia.mostrarMejoresOfertas(tablaMejores, row, buscar, rbTipo);
                else 
                    UtilAgencia.mostrarMejoresCandidatos(tablaMejores, row, buscar, rbTipo);
             }
        }
        if(selec) JOptionPane.showMessageDialog(this, "Selecciona antes una fila", "Selecciona Primero", JOptionPane.INFORMATION_MESSAGE);
  
            
    }//GEN-LAST:event_btnBuscarCanOfeActionPerformed

    /**
     Asigna una Oferta/Candidato a un Candidato/Oferta, y lo elimina de la bd
     */
    private void btnAdjudicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjudicarActionPerformed
        boolean selec = true;
        String busqueda;
        int oferta,candidato;
        if( rbCandidatos.isSelected() ) {
                    busqueda = "Candidatos"; 
                    candidato = tablaCanOfe.getSelectedRow();
                    oferta = tablaMejores.getSelectedRow();
          } else{
                    busqueda="Ofertas";
                    candidato = tablaMejores.getSelectedRow();
                    oferta = tablaCanOfe.getSelectedRow();
          }
        for (int i = 0; i < tablaMejores.getRowCount(); i++) {
            if(tablaMejores.isRowSelected(i))
            {
                UtilAgencia.borrarAdjudicacion(oferta, candidato, busqueda);
                JOptionPane.showMessageDialog(this, "Este candidato ya tiene trabajo.", "Oferta Adjudicada", JOptionPane.INFORMATION_MESSAGE);
                btnBuscarCanOfeActionPerformed(null);
            }
        }
        if(selec) JOptionPane.showMessageDialog(this, "Selecciona antes una fila", "Selecciona Primero", JOptionPane.INFORMATION_MESSAGE);
  
    }//GEN-LAST:event_btnAdjudicarActionPerformed

    /**
     Seleccionar un Candidato/Cliente para poder ver datos y poder elegir su mejor Oferta/Candidato
     */
    private void tablaCanOfeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCanOfeMouseClicked
        if( rbCandidatos.isSelected() ) 
        {
            datosCandidatos(tablaCanOfe);
        }else 
        {            
            datosOfertas(tablaCanOfe);
            
        }
        
        
    }//GEN-LAST:event_tablaCanOfeMouseClicked

    /**
     Seleccionar un Candidato/Cliente para poder ver datos y poder elegir su mejor Oferta/Candidato
     */
    private void tablaMejoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMejoresMouseClicked
        if( rbCandidatos.isSelected() ) 
        {
            datosOfertas(tablaMejores);
        }else 
        {            
             datosCandidatos(tablaMejores);
            
        }
    }//GEN-LAST:event_tablaMejoresMouseClicked

    /**
     Poder moverse por la tabla con las teclas
     */
    private void tablaCanOfeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaCanOfeKeyReleased
        if(evt.getKeyCode() == 38) tablaCanOfeMouseClicked(null); //Flecha hacia arriba
        if(evt.getKeyCode() == 40) tablaCanOfeMouseClicked(null); //Flecha hacia abajo
    }//GEN-LAST:event_tablaCanOfeKeyReleased

    /**
     Poder moverse por la tabla con las teclas
     */
    private void tablaMejoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaMejoresKeyReleased
        if(evt.getKeyCode() == 38) tablaMejoresMouseClicked(null); //Flecha hacia arriba
        if(evt.getKeyCode() == 40) tablaMejoresMouseClicked(null); //Flecha hacia abajo
    }//GEN-LAST:event_tablaMejoresKeyReleased

    private void rellenarCNO(){
        ArrayList al = UtilAgencia.getOcupacionCNO();
            for (int i = 0; i < al.size(); i++) {
                cbOcupacion.addItem(al.get(i));
            }
    }
    
    /**
     Visualizar los datos de los candidatos (CNO y Palabras Clave)
     */
    private void datosCandidatos(JTable tabla){
        int row = tabla.getSelectedRow();
            String cno;
            String nif = tabla.getValueAt(row, 0).toString();
                cno = tabla.getValueAt(row, 8).toString();
                txtPC.setText(tabla.getValueAt(row, 9).toString());
            labelFoto.setIcon(UtilAgencia.mostrarFotoCandidato(nif));
            modelo.clear();
            ArrayList acno = UtilAgencia.getNombresCNO(cno);
            for (int i = 0; i < acno.size(); i++) {
                modelo.addElement(acno.get(i).toString());
            }
    }
    
    /**
     Visualizar los datos de las ofertas (CNO y Palabras Clave(
     */
    private void datosOfertas(JTable tabla){
        int row = tabla.getSelectedRow();
        String nombreE = tabla.getValueAt(row, 0).toString();
        String cno = tabla.getValueAt(row, 2).toString();
        String ofertas = tabla.getValueAt(row, 3).toString();
        ArrayList al = UtilAgencia.getNombresCNO(cno);
        labelFoto.setIcon(UtilAgencia.mostrarFotoEmpresa(nombreE));
        modelo.clear();
        modelo.addElement(al.get(0).toString());
        txtPC.setText(ofertas);
    }
            
            
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Interfaz.Anagrama anagrama1;
    private javax.swing.JButton btnAdjudicar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCanOfe;
    private javax.swing.JComboBox cbOcupacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JList listaCNO;
    private javax.swing.JRadioButton rbCandidatos;
    private javax.swing.JRadioButton rbOcupacion;
    private javax.swing.JRadioButton rbOfertas;
    private javax.swing.JRadioButton rbPalabrasC;
    private javax.swing.ButtonGroup rbgBusqueda;
    private javax.swing.ButtonGroup rbgTipo;
    private javax.swing.JTable tablaCanOfe;
    private javax.swing.JTable tablaMejores;
    private javax.swing.JTextField txtPC;
    private javax.swing.JTextField txtPalabras;
    // End of variables declaration//GEN-END:variables
}
