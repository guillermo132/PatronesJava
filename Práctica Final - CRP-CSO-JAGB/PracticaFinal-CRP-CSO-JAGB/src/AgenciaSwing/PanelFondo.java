/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase PanelFondo
 */
package AgenciaSwing;
import java.awt.*;
import javax.swing.*;
/**
 * jPanel para introducir la imagen de fondo
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class PanelFondo extends javax.swing.JPanel {

    /**
     * Constructor
     */
    public PanelFondo() {
        initComponents();
        this.setSize(1530,700);//tomamos el tamaño del jFrame //948,558
    }
    @Override
    public void paintComponent(Graphics g){
    Dimension tam = getSize();
    /*Creamos un paquete'Imagenes' donde guardamos la imagen de fondo
     * ahora creamos la variable ImagenFondo y hacemos que coja de /Imagenes/Fondo.jpg
     */
    ImageIcon ImagenFondo = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo1.jpg")).getImage());
    g.drawImage(ImagenFondo.getImage(), 0, 0, tam.width,tam.height,null);
    setOpaque(false);
    super.paintComponent(g);
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
