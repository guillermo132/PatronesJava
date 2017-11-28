/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import bibliopatrones.IzCrearPrestamoDialog;

/**
 *
 * @author doverride
 */
public class CommandPrestamoIntz implements CommandInterfaz{
    IzCrearPrestamoDialog miDialog;

    public CommandPrestamoIntz(IzCrearPrestamoDialog miDialog) {
        this.miDialog = miDialog;
    }

    @Override
    public void executeUno() {
             miDialog.getjButton1().setVisible(true);
             miDialog.getjButton1().setText("PRESTAR");
             miDialog.getDniLabel().setVisible(true);
             miDialog.getTextField().setVisible(true);
             miDialog.getjTextArea1().setVisible(false);
             miDialog.getjScrollPane1().setVisible(false);
    }

    @Override
    public void executeDos() {
             miDialog.getjButton1().setVisible(true);
             miDialog.getjButton1().setText("DEVOLVER");
             miDialog.getDniLabel().setVisible(true);
             miDialog.getTextField().setVisible(true);
             miDialog.getjTextArea1().setVisible(false);
             miDialog.getjScrollPane1().setVisible(false);
    }

    @Override
    public void executeTres() {
            miDialog.getjButton1().setVisible(true);
            miDialog.getjButton1().setText("CONSULTAR");
            miDialog.getDniLabel().setVisible(true);
            miDialog.getTextField().setVisible(true);
            miDialog.getjTextArea1().setVisible(true);
            miDialog.getjScrollPane1().setVisible(true);
            miDialog.getjTextArea1().setText("");
    }
    
    
}
