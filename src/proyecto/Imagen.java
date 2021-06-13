
package proyecto;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


class Imagen extends javax.swing.JPanel {
    int x, y;
    String ruta;

    public Imagen(JPanel jPanel1, String rut) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
        ruta = rut;
    }

    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(getClass().getResource(ruta));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    }    

}

