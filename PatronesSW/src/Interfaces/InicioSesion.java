/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.*;
import Singleton.Serializa;
import java.awt.HeadlessException;
import java.awt.IllegalComponentStateException;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author joserra
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesion
     */
    Serializa serializa;
    public InicioSesion() {
        try{
        initComponents();
           try {
                serializa = Serializa.getInstancia();
           } catch (IOException | ClassNotFoundException ex) {
               Logger.getLogger(InterfazRegistrar.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
       catch(IllegalComponentStateException e){}
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
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("¡Bienvenido!");

        jLabel2.setText("Usuario:");

        jLabel3.setText("Contraseña:");
        jLabel3.setToolTipText("");

        login.setText("Conectar");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user)
                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(login)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(login)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if(user.getText().equals("")||pass.getText().equals("")){
            //Si los campos Usuario y Contraseña están vacíos, lanza mensaje
            JOptionPane.showMessageDialog(this, "Rellene los campos de Usuario y Contraseña");
        }
        else{
            HashMap<String, Usuario> tablaUsuarios;
            //Cargamos los clientes ya registrados anteriormente
            tablaUsuarios = serializa.CargarClientes();
            //Declaramos atributos
            String usuario=user.getText();
            String password=pass.getText();
         
            //Miramos a ver si Usuario es "admin" y Contraseña es "admin" y si lo es, vamos a la interfaz del administrador
            if ((usuario.equals("admin")) && (password.equals("admin"))){
                InterfazAdmin ia = new InterfazAdmin();
                ia.setVisible(true);
                this.setVisible(false);
            }
            //Si Usuario y Contraseña no son "admin", vamos a la interfaz de clientes
            else{    
                try{//Si el cliente se encuentra en el HashMap, entras a la aplicación para clientes de la librería
                    if(tablaUsuarios.containsKey(usuario)){
                        //Instanciamos un cliente recogiendo su usuario y recogiendo su contraseña de la clase Cliente
                        Usuario c = tablaUsuarios.get(usuario);
                        String contrasena=c.getClave();
                        //Si la contraseña de la clase Cliente y la introducida son iguales, accedemos a la aplicación
                        if (contrasena.equals(password)){
                            //Lleva a la ventana de Clientes
                            if(c.getProfesor()){
                                InterfazProfesor ia = new InterfazProfesor(c);
                                ia.setVisible(true);
                                this.setVisible(false);  
                            }else{
                                InterfazUser ia = new InterfazUser(c);
                                ia.setVisible(true);
                                this.setVisible(false); 
                            }
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "PASSWORD INCORRECTA");
                        }
            
                    }//fin del if
                    else{
                            JOptionPane.showMessageDialog(this, "USUARIO NO ENCONTRADO");
                    }
            
                }//fin del try
                catch (HeadlessException e){
                    System.err.println(e);
                    JOptionPane.showMessageDialog(this, "USUARIO NO ENCONTRADO");
                }
            }//fin del else
                 
        }//fin else         
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
