/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import bibliopatrones.IzMostrarPublicDialog;

/**
 *
 * @author doverride
 */
public class CommandPublicIntz implements CommandInterfaz{
    private final IzMostrarPublicDialog miDialog;

    public CommandPublicIntz(IzMostrarPublicDialog miDialog) {
        this.miDialog = miDialog;
    }
    
    
    @Override
    public void executeUno() {
            miDialog.getTipoPubliLabel().setText("LIBRO");
            miDialog.getParam1Label().setText("Editorial");
            miDialog.getParam2Label().setText("Contenido");
            miDialog.getParam3Label().setText("Edición");
    }

    @Override
    public void executeDos() {
            miDialog.getTipoPubliLabel().setText("REVISTA");
            miDialog.getParam1Label().setText("Periodicidad");
            miDialog.getParam2Label().setText("Volumen");
            miDialog.getParam3Label().setText("NºPubli");
    }

    @Override
    public void executeTres() {
            miDialog.getTipoPubliLabel().setText("TESIS");
            miDialog.getParam1Label().setText("Tribunal");
            miDialog.getParam2Label().setText("Departamento");
            miDialog.getParam3Label().setText("Calificación");
    
    }
    
}
