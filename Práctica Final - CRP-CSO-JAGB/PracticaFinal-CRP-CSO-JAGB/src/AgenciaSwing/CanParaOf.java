/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase CanParaOf
 */
package AgenciaSwing;

import AgenciaEmpleo.Agregado;
import AgenciaEmpleo.AgregadoConcreto;
import AgenciaEmpleo.Candidato;
import AgenciaEmpleo.Iterador;
import AgenciaEmpleo.UtilSistema;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * En la siguiente ventana se le mostraran al empleado, los candidatos que casan
 * con las ofertas Pudiendo desplazarse con los botones 'anterior' y 'siguiente'
 * para visualizar todos
 *
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class CanParaOf extends javax.swing.JFrame {

    private ArrayList<Candidato> canAux;//Nos permitirá almacenar en el los candidatos 
    private Candidato can;
    private ListIterator ite;
    private JFrame principal;
    
    //Uso patron ITERATOR
    // Crea el agregado.
    Agregado agregado = new AgregadoConcreto(UtilSistema.getOfertas().toArray());
     // Crea el iterador.
    Iterador iterador = agregado.crearIterador();

    /**
     * Constructor
     * @param ventana
     */
    public CanParaOf(JFrame ventana) {
        initComponents();
        verCandidatos();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);//Centramos la pantalla
        PanelFondo F = new PanelFondo(); //Creamos el objeto F de tipo PanelFondo
        this.add(F, BorderLayout.CENTER);
        this.pack();

    }
    /**
     * Permite visualizar los datos con los botones Anterior y Siguiente
     */
    public void verCandidatos() {
        try {
            canAux = UtilSistema.getCandiCasan();//Almacenamos en la variable canAux los candidatos introducirdos por el empleado
            ite = canAux.listIterator();//recorremos el array para ver cada uno de esos candidatos

            //Permitimos que el empleado pueda utilizar los botones para ir visualizando en pantalla cada uno de los candidatos
            if (canAux.size() < 1) {//Si la longitud es menor que uno lanza un mensaje de error y botones estan desabilitados
                JOptionPane.showMessageDialog(this, "Error, no hay personas", "ERROR", JOptionPane.ERROR_MESSAGE);
                jButtonAnt.setEnabled(false);
                jButtonSig.setEnabled(false);
            } else {//Si no se habilitan los botones
                jButtonAnt.setEnabled(true);
                jButtonSig.setEnabled(true);
            }


            if (ite.hasNext()) {//Si hay siguiente los ocnvierte en objeto candidato y los presenta y obtiene la imagen
                can = (Candidato) ite.next();

            }
            if (can != null) {
                verDatos(can);
                //getImagen(can);
            } else {
                JOptionPane.showMessageDialog(this, "No hay mas candidatos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * Permite rellenar los campos con los datos del candidato
     */
    public void verDatos(Candidato can) {
        String tipo = can.getClass().getSimpleName();//variable que almacena el tipo de clase
        String clave = "";
        //Obtiene las claves
        for (int i = 0; i < can.getClaves().length; i++) {
            clave += can.getClaves()[i] + ",";
        }
        String ocupacion = "";
        //Obtiene las ocupaciones
        for (int i = 0; i < can.getCno().size(); i++) {
            ocupacion += can.getCno().get(i) + ",";

        }
        //Rellenamos los campos con los datos que el empleado introduce en GestionCandidatos

        jTextFieldNom.setText(can.getNombre());
        jTextFieldApellidos.setText(can.getApellidos());
        jTextFieldNIF.setText(can.getNIF());
        jTextFieldTlf.setText(Integer.toString(can.getTlf()));
        jTextFieldDireccion.setText(can.getDireccion().getNombre());
        jTextFieldNum.setText(Integer.toString(can.getDireccion().getNumero()));
        jTextFieldPiso.setText(Integer.toString(can.getDireccion().getPiso()));
        jTextFieldLetra.setText((can.getDireccion().getLetra()));
        jTextFieldLoca.setText(can.getDireccion().getLocalidad());
        jTextFieldCodPos.setText(Integer.toString(can.getDireccion().getCodigoPostal()));
        jTextFieldSuelMin.setText(Double.toString(can.getSalMin()));
        jTextFieldSuelMax.setText(Double.toString(can.getSalMax()));
        jTextFieldOcupaciones.setText(ocupacion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldSuelMin = new javax.swing.JTextField();
        jTextFieldPiso = new javax.swing.JTextField();
        jTextFieldCodPos = new javax.swing.JTextField();
        jLabelCodPos = new javax.swing.JLabel();
        jLabelPiso = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldLoca = new javax.swing.JTextField();
        jTextFieldNum = new javax.swing.JTextField();
        jLabelLoca = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jTextFieldTlf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelLetra = new javax.swing.JLabel();
        jTextFieldLetra = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabelNum = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLabelTlf = new javax.swing.JLabel();
        jTextFieldNIF = new javax.swing.JTextField();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldSuelMax = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabelOcupaciones = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonSig = new javax.swing.JButton();
        jButtonAnt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        VolverMenuP = new javax.swing.JButton();
        jTextFieldOcupaciones = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agencia de Empleo - Candidatos para ofertas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextFieldSuelMin.setEnabled(false);
        jTextFieldSuelMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSuelMinKeyTyped(evt);
            }
        });

        jTextFieldPiso.setEnabled(false);
        jTextFieldPiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPisoKeyTyped(evt);
            }
        });

        jTextFieldCodPos.setEnabled(false);
        jTextFieldCodPos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodPosKeyTyped(evt);
            }
        });

        jLabelCodPos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelCodPos.setText("Código Postal");

        jLabelPiso.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelPiso.setText("Piso");

        jLabelNombre.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelNombre.setText("Nombre");

        jTextFieldLoca.setEnabled(false);

        jTextFieldNum.setEnabled(false);
        jTextFieldNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumKeyTyped(evt);
            }
        });

        jLabelLoca.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelLoca.setText("Localidad");

        jLabelApellidos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelApellidos.setText("Apellidos");

        jTextFieldTlf.setEnabled(false);
        jTextFieldTlf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTlfKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Dirección");

        jLabelLetra.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelLetra.setText("Letra");

        jTextFieldLetra.setEnabled(false);
        jTextFieldLetra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLetraKeyTyped(evt);
            }
        });

        jTextFieldDireccion.setEnabled(false);

        jLabelNum.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelNum.setText("Nº");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e-Business.jpg"))); // NOI18N
        Logo.setText("jLabel5");

        jLabelTlf.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelTlf.setText("Telefono");

        jTextFieldNIF.setEnabled(false);
        jTextFieldNIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNIFActionPerformed(evt);
            }
        });
        jTextFieldNIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNIFKeyTyped(evt);
            }
        });

        jTextFieldNom.setEnabled(false);
        jTextFieldNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomKeyTyped(evt);
            }
        });

        jTextFieldApellidos.setEnabled(false);
        jTextFieldApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidosKeyTyped(evt);
            }
        });

        jTextFieldSuelMax.setEnabled(false);
        jTextFieldSuelMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSuelMaxKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Sueldo Mínimo");

        jLabelOcupaciones.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelOcupaciones.setText("Categorías de Empleo");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Sueldo Máximo");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Salario Neto Mensual");

        jButtonSig.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonSig.setText("SIGUIENTE");
        jButtonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSigActionPerformed(evt);
            }
        });

        jButtonAnt.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonAnt.setText("ANTERIOR");
        jButtonAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAntActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("NIF");

        jLabelTitulo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabelTitulo.setText("AGENCIA DE EMPLEO");
        jLabelTitulo.setToolTipText("");
        jLabelTitulo.setAlignmentX(0.5F);
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Candidatos que casan para las Ofertas");

        VolverMenuP.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        VolverMenuP.setForeground(new java.awt.Color(0, 102, 255));
        VolverMenuP.setText("ATRÁS");
        VolverMenuP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverMenuPActionPerformed(evt);
            }
        });

        jTextFieldOcupaciones.setEditable(false);
        jTextFieldOcupaciones.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(321, 321, 321))
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabelNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelPiso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabelLetra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelLoca)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldLoca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelCodPos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCodPos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelApellidos)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabelTlf)
                                        .addComponent(jLabelNombre))
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldTlf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(68, 68, 68)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAnt)
                        .addGap(343, 343, 343)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabelOcupaciones)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldSuelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(jTextFieldSuelMax, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(jTextFieldOcupaciones))))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSig)
                        .addGap(283, 283, 283))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VolverMenuP)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(532, 532, 532)
                    .addComponent(jLabel4)
                    .addContainerGap(237, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldSuelMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldSuelMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(216, 216, 216))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelOcupaciones)
                                .addComponent(jTextFieldOcupaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(120, 120, 120)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelApellidos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTlf))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPiso)
                                    .addComponent(jTextFieldPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelLetra)
                                    .addComponent(jTextFieldLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelLoca)
                                    .addComponent(jTextFieldLoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCodPos)
                                    .addComponent(jTextFieldCodPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNum)
                                .addGap(45, 45, 45)))
                        .addGap(52, 52, 52)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnt)
                    .addComponent(jButtonSig))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(VolverMenuP)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addComponent(jLabel4)))
                    .addContainerGap(432, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSuelMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSuelMinKeyTyped
    }//GEN-LAST:event_jTextFieldSuelMinKeyTyped

    private void jTextFieldPisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPisoKeyTyped
    }//GEN-LAST:event_jTextFieldPisoKeyTyped

    private void jTextFieldCodPosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodPosKeyTyped
    }//GEN-LAST:event_jTextFieldCodPosKeyTyped

    private void jTextFieldNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumKeyTyped
    }//GEN-LAST:event_jTextFieldNumKeyTyped

    private void jTextFieldTlfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTlfKeyTyped
    }//GEN-LAST:event_jTextFieldTlfKeyTyped

    private void jTextFieldLetraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLetraKeyTyped
    }//GEN-LAST:event_jTextFieldLetraKeyTyped

    private void jTextFieldNIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNIFActionPerformed
    }//GEN-LAST:event_jTextFieldNIFActionPerformed

    private void jTextFieldNIFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNIFKeyTyped
    }//GEN-LAST:event_jTextFieldNIFKeyTyped

    private void jTextFieldNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomKeyTyped
    }//GEN-LAST:event_jTextFieldNomKeyTyped

    private void jTextFieldApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidosKeyTyped
    }//GEN-LAST:event_jTextFieldApellidosKeyTyped

    private void jTextFieldSuelMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSuelMaxKeyTyped
    }//GEN-LAST:event_jTextFieldSuelMaxKeyTyped

    private void jButtonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSigActionPerformed
        if (iterador.hayMas()) {//Recorremos el array con el iterator
            can = (Candidato) iterador.siguiente();
        }
        //Si hay candidatos
        if (can != null) {
            verDatos(can);
            //getImagen(can);
        } else {
            JOptionPane.showMessageDialog(this, "No hay candidatos dados de alta");
        }
    }//GEN-LAST:event_jButtonSigActionPerformed

    private void jButtonAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAntActionPerformed
        if (iterador.hayAnterior()) {//Recorremos el array con el iterator
            can = (Candidato) iterador.anterior();
        }
        //Si hay candidatos
        if (can != null) {
            verDatos(can);
            //getImagen(can);
        } else {
            JOptionPane.showMessageDialog(this, "No hay candidatos dados de alta");
        }
    }//GEN-LAST:event_jButtonAntActionPerformed

    private void VolverMenuPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverMenuPActionPerformed
         UtilSistema.guardarDatos();
        BusquedaCandidatoParaOferta ventana = new BusquedaCandidatoParaOferta();
        ventana.setVisible(true);
        this.setVisible(false);
        verCandidatos();
    }//GEN-LAST:event_VolverMenuPActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        UtilSistema.borraCadidatos();
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton VolverMenuP;
    private javax.swing.JButton jButtonAnt;
    private javax.swing.JButton jButtonSig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelCodPos;
    private javax.swing.JLabel jLabelLetra;
    private javax.swing.JLabel jLabelLoca;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNum;
    private javax.swing.JLabel jLabelOcupaciones;
    private javax.swing.JLabel jLabelPiso;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTlf;
    public static javax.swing.JTextField jTextFieldApellidos;
    public static javax.swing.JTextField jTextFieldCodPos;
    public static javax.swing.JTextField jTextFieldDireccion;
    public static javax.swing.JTextField jTextFieldLetra;
    public static javax.swing.JTextField jTextFieldLoca;
    public static javax.swing.JTextField jTextFieldNIF;
    public static javax.swing.JTextField jTextFieldNom;
    public static javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField jTextFieldOcupaciones;
    public static javax.swing.JTextField jTextFieldPiso;
    public static javax.swing.JTextField jTextFieldSuelMax;
    public static javax.swing.JTextField jTextFieldSuelMin;
    public static javax.swing.JTextField jTextFieldTlf;
    // End of variables declaration//GEN-END:variables
}
