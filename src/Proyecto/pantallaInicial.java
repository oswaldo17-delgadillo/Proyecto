
package Proyecto;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Frame.ICONIFIED;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class pantallaInicial {
    public static void main(String[] args) throws InterruptedException {
        MarcopantallaInicial mimarco= new MarcopantallaInicial();
        //mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setUndecorated(true);
        mimarco.setVisible(true);
        
    }
    
}
class MarcopantallaInicial extends JFrame{
    public MarcopantallaInicial() throws InterruptedException{

        setTitle(" PRESENTACION DEL EQUIPO ");
        setResizable(false);//Permite hacer mas grande o pequeño el frame
        Toolkit mipantalla=Toolkit.getDefaultToolkit();//Almacenamos detro de la variable nuestro sistema nativo de ventanas
        Dimension tamanoPantalla=mipantalla.getScreenSize();//almacenamos la resolucion de mi pantalla
        int alturaPantalla=tamanoPantalla.height;//En el valor entero guardamos el alto de la resolucion de tamano pantalla
        int anchoPantalla=tamanoPantalla.width;//En el valor entero guardaremos el ancho de la resolucion de la pantalla
        //setSize(anchoPantalla/2,alturaPantalla/2);//Esto es para definir el tamaño del frame
        setLocation(anchoPantalla/4,0);
        setSize(800,700);
        //Image miIcono=mipantalla.getImage("C:\\Users\\osba_\\Documents\\NetBeansProjects\\ProyectoModificado\\src\\imagenes/registro.jpg");//en el objeto miIcono agregamos esa imagen 
        Image miIcono=mipantalla.getImage("src/imagenes/registro.jpg");
        setIconImage(miIcono);
        Laminapantalla milamina=new Laminapantalla();
        add(milamina);
        AudioClip musica;
        musica=java.applet.Applet.newAudioClip(getClass().getResource("/Proyecto/tambor.wav"));
        musica.play();
        
        
        //this.setContentPane(milamina);
        
    }
    
}
class Laminapantalla extends JPanel {
     public Laminapantalla()throws InterruptedException{
         try{
        imagen=ImageIO.read(new File("src/imagenes/fondo.jpg"));
        logo=ImageIO.read(new File("src/imagenes/logo.png"));
        iconobtn = new ImageIcon("src/imagenes/icons8_Multiply_32px.png");
        iconobtn2 = new ImageIcon("src/imagenes/icons8_Next_page_64px.png");
        
        }
        catch(IOException e){
            System.out.println("La imagen no se encuentra");
        }
                
     }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;
        g.drawImage(imagen,0,0, getWidth(),getHeight(),this);
         g.drawImage(logo, 280, 10, 200, 200, this);
         setOpaque(false);
         Font mifuente3=new Font("Kristen ITC",Font.BOLD,32);//Tipo de letras y tamaño de la letra
         g2.setFont(mifuente3);
         g2.setColor(Color.BLACK);
         g2.drawString("Universidad Autonoma de Aguascalientes", 30, 280);
         Font mifuente=new Font("Kristen ITC",Font.BOLD,22);//Tipo de letras y tamaño de la letra
         g2.setFont(mifuente);
         g2.setColor(Color.BLACK);//Modificamos el color de la letra
         g2.drawString("Materia: Programacion 3", 30, 350);
         g2.drawString("Alumnos: ", 30, 400);
         g2.drawString("Maestra: Georgina Salazar Partida", 380, 350);
         g2.drawString("ID:", 380, 400);
         Font mifuente2=new Font("Kristen ITC",Font.PLAIN,18);//Tipo de letras y tamaño de la letra
         g2.setFont(mifuente2);
         g2.drawString("Castorena Garcia Gonzalo ", 30, 450);
         g2.drawString("Delgadillo Oswaldo Ismael ", 30, 500);
         g2.drawString("Valdez Rodriguez Luis Adrian ", 30, 550);
         g2.drawString("123345 ", 380, 450);
         g2.drawString("270376 ", 380, 500);
         g2.drawString("270261", 380, 550);
        salir=new JButton("");
        salir.setIcon(iconobtn);
        salir.setBackground(Color.WHITE);
        salir.setBounds(760, 0, 40, 40);
        salir.setLocation(750, 0);
        siguiente=new JButton("");
        siguiente.setIcon(iconobtn2);
        siguiente.setBackground(Color.WHITE);
        siguiente.setBounds(750, 660, 40, 40);
        siguiente.setLocation(750, 660);
        salir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
               AudioClip musica;
               musica=java.applet.Applet.newAudioClip(getClass().getResource("/Proyecto/iph.wav"));
               musica.play(); 
               try {
               Thread.sleep(2000);
               } catch (InterruptedException ex) {
               Logger.getLogger(Laminapantalla.class.getName()).log(Level.SEVERE, null, ex);
         }
               System.exit(0);
            }
        });
        siguiente.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
               
               PresentacionHotel fra=new PresentacionHotel();
               fra.setVisible(true);
               //setState(ICONIFIED);
            }

            });
        add(salir);
        add(siguiente);
         try {
            Thread.sleep(5000);
            } catch (InterruptedException ex) {
             Logger.getLogger(Laminapantalla.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
        
        
    }
    
    private Image imagen;
    private Image logo;
    private  JButton salir;
    private  JButton siguiente;
    private ImageIcon iconobtn;
    private ImageIcon iconobtn2;
    
}
