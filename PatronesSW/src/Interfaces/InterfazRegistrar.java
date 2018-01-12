/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Singleton.Serializa;
import Clases.Usuario;
import java.awt.IllegalComponentStateException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Joserra
 */
public class InterfazRegistrar extends javax.swing.JFrame {

    /**
     * Creates new form InterfazRegistrar
     */
    //Creamos un HashMap de la clase Cliente llamado tablaClientes
    Serializa serializa;
    public InterfazRegistrar() {
        //Título de la ventana
        this.setTitle("Nuevo Registro");
                
        try{
        initComponents();
        NIFPersona.setText("00000000-A");
           try {
                serializa = Serializa.getInstancia();
           } catch (IOException | ClassNotFoundException ex) {
               Logger.getLogger(InterfazRegistrar.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
       catch(IllegalComponentStateException e){}
       // CargarClientes();
    }
    
    
    public void guardaUsuario(Usuario u, String correo){
        
        HashMap<String, Usuario> compruebaDni = serializa.CargarClientes();
        System.out.println("2");
        System.out.println("3");
        Iterator it = compruebaDni.keySet().iterator();
        System.out.println("4");
        while (it.hasNext()){
            System.out.println("5");
            String key= (String) it.next();
            Usuario ll = compruebaDni.get(key);
            String nif = ll.getNIF();
            if(!nif.equals(u.getNIF())){
                serializa.GuardarCliente(correo, u);
                
                //Nos lleva a la ventana principal
                InterfazAdmin ip = new InterfazAdmin();
                this.setVisible(false);
                ip.setVisible(true);
            }else{
            JOptionPane.showMessageDialog(this,"Error, El usuario ya existe!");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombrePersona = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidosPersona = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NIFPersona = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contraseñaUsuario = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        checkProfesor = new javax.swing.JRadioButton();
        checkAlumno = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Nuevo Usuario");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("NIF:");

        try {
            NIFPersona.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Nombre de Usuario:");

        jLabel8.setText("Contraseña:");

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo:");

        buttonGroup1.add(checkProfesor);
        checkProfesor.setSelected(true);
        checkProfesor.setText("Profesor");
        checkProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkProfesorActionPerformed(evt);
            }
        });

        buttonGroup1.add(checkAlumno);
        checkAlumno.setText("Alumno");
        checkAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(contraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NIFPersona)
                                        .addGap(77, 77, 77))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(apellidosPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(checkProfesor)
                                        .addGap(18, 18, 18)
                                        .addComponent(checkAlumno))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel1)))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonAtras)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonRegistrar)
                        .addGap(301, 301, 301))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(apellidosPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NIFPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(checkProfesor)
                    .addComponent(checkAlumno))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(contraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonRegistrar)
                .addGap(16, 16, 16)
                .addComponent(botonAtras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
        // Registro de un nuvo cliente
        //Si hay algún campo vacío, lanza mensaje
        if((nombrePersona.getText().equals(""))||(apellidosPersona.getText().equals(""))||(NIFPersona.getText().equals(""))||
                (nombreUsuario.getText().equals(""))||(contraseñaUsuario.getText().equals(""))) {                
                    JOptionPane.showMessageDialog(this,"Error, hay algún campo sin rellenar. Rellene todos los campos.");
        }
        else{    
            //Declaramos variables
            String nombre = nombrePersona.getText();
            String apellidos = apellidosPersona.getText();
            String NIF = NIFPersona.getText();
            String correo = nombreUsuario.getText();
            String contrasena = contraseñaUsuario.getText();
            boolean profesor;
            if(checkProfesor.isSelected()){
                profesor = true;
            }else{
                profesor = false;
            }
                
                //Instanciamos un objeto, lo añadimos al HashMap y lo guardamos en el .dat
                Usuario cl1 = new Usuario(nombre,apellidos,NIF,correo,contrasena, profesor);
                guardaUsuario(cl1, correo);
                
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:
        //Nos lleva a la ventana principal
        InterfazAdmin ip = new InterfazAdmin();
        this.setVisible(false);
        ip.setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void checkProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkProfesorActionPerformed

    private void checkAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAlumnoActionPerformed
    //Metodo para guardar los clientes en un .dat
    
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField NIFPersona;
    private javax.swing.JTextField apellidosPersona;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton checkAlumno;
    private javax.swing.JRadioButton checkProfesor;
    private javax.swing.JTextField contraseñaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombrePersona;
    private javax.swing.JTextField nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
