
package proyecto;

import controlMySql.MySqlConn;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class Menu extends javax.swing.JFrame {

    
    MySqlConn conn;
    
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        conn = new MySqlConn();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAltas = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSencilla = new javax.swing.JMenuItem();
        jMenuItemDoble = new javax.swing.JMenuItem();
        jMenuItemTriple = new javax.swing.JMenuItem();
        jMenuBajas = new javax.swing.JMenu();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemFotos = new javax.swing.JMenuItem();
        jMenuItemIngresos = new javax.swing.JMenuItem();
        jMenuItemOcupacionHab = new javax.swing.JMenuItem();
        jMenuItemHabitaciones = new javax.swing.JMenuItem();
        jMenuItemOcupacionHotel = new javax.swing.JMenuItem();
        jMenuItemCostoHabitacion = new javax.swing.JMenuItem();
        jMenuItemUbicacionHuesped = new javax.swing.JMenuItem();
        jMenuItemEstadoHabitacion = new javax.swing.JMenuItem();
        jMenuItemHabitacionesPiso = new javax.swing.JMenuItem();
        jMenuItemListaHuespedes = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPaneEscritorioLayout = new javax.swing.GroupLayout(jDesktopPaneEscritorio);
        jDesktopPaneEscritorio.setLayout(jDesktopPaneEscritorioLayout);
        jDesktopPaneEscritorioLayout.setHorizontalGroup(
            jDesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        jDesktopPaneEscritorioLayout.setVerticalGroup(
            jDesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jMenuAltas.setText("Registro");
        jMenuAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAltasActionPerformed(evt);
            }
        });

        jMenu1.setText("Tipo de Habitacion");

        jMenuItemSencilla.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSencilla.setText("Sencilla");
        jMenuItemSencilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSencillaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSencilla);

        jMenuItemDoble.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemDoble.setText("Doble");
        jMenuItemDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDobleActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemDoble);

        jMenuItemTriple.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemTriple.setText("Triple");
        jMenuItemTriple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTripleActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemTriple);

        jMenuAltas.add(jMenu1);

        jMenuBar1.add(jMenuAltas);

        jMenuBajas.setText("Salida");
        jMenuBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBajasMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuBajas);

        jMenuConsultas.setText("Consultas");

        jMenuItemFotos.setText("Fotos del hotel");
        jMenuItemFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFotosActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemFotos);

        jMenuItemIngresos.setText("Ingresos del hotel");
        jMenuItemIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIngresosActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemIngresos);

        jMenuItemOcupacionHab.setText("Ocupacion por habitacion");
        jMenuItemOcupacionHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOcupacionHabActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemOcupacionHab);

        jMenuItemHabitaciones.setText("Habitaciones del hotel ");
        jMenuItemHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHabitacionesActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemHabitaciones);

        jMenuItemOcupacionHotel.setText("Ocupacion del hotel");
        jMenuItemOcupacionHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOcupacionHotelActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemOcupacionHotel);

        jMenuItemCostoHabitacion.setText("Costo de las habitaciones");
        jMenuItemCostoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCostoHabitacionActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemCostoHabitacion);

        jMenuItemUbicacionHuesped.setText("Buscar un huesped");
        jMenuItemUbicacionHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUbicacionHuespedActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemUbicacionHuesped);

        jMenuItemEstadoHabitacion.setText("Estado de una habitacion");
        jMenuItemEstadoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstadoHabitacionActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemEstadoHabitacion);

        jMenuItemHabitacionesPiso.setText("Habitaciones por piso");
        jMenuItemHabitacionesPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHabitacionesPisoActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemHabitacionesPiso);

        jMenuItemListaHuespedes.setText("Lista de huespedes");
        jMenuItemListaHuespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaHuespedesActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemListaHuespedes);

        jMenuBar1.add(jMenuConsultas);

        jMenuSalir.setText("Salir");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPaneEscritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAltasActionPerformed
        
        
    }//GEN-LAST:event_jMenuAltasActionPerformed

    private void jMenuItemSencillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSencillaActionPerformed
        // TODO add your handling code here:
        AltasSencillas altas = new AltasSencillas();
        this.jDesktopPaneEscritorio.add(altas);
        altas.show();
    }//GEN-LAST:event_jMenuItemSencillaActionPerformed

    private void jMenuItemTripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTripleActionPerformed
        // TODO add your handling code here:
        AltasTriple altas = new AltasTriple();
        this.jDesktopPaneEscritorio.add(altas);
        altas.show();
    }//GEN-LAST:event_jMenuItemTripleActionPerformed

    private void jMenuItemDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDobleActionPerformed
        // TODO add your handling code here:
        AltasDobles altas = new AltasDobles();
        this.jDesktopPaneEscritorio.add(altas);
        altas.show();
    }//GEN-LAST:event_jMenuItemDobleActionPerformed

    private void jMenuBajasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBajasMouseClicked
        // TODO add your handling code here:
        Salida bajas = new Salida();
        this.jDesktopPaneEscritorio.add(bajas);
        bajas.show();
    }//GEN-LAST:event_jMenuBajasMouseClicked

    private void jMenuItemFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFotosActionPerformed
        // TODO add your handling code here:
        Consulta1 fotos= new Consulta1();
        this.jDesktopPaneEscritorio.add(fotos);
        fotos.show();
    }//GEN-LAST:event_jMenuItemFotosActionPerformed

    private void jMenuItemIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngresosActionPerformed
        // TODO add your handling code here:
        Consulta2 ingresos= new Consulta2();
        this.jDesktopPaneEscritorio.add(ingresos);
        ingresos.show();
    }//GEN-LAST:event_jMenuItemIngresosActionPerformed

    private void jMenuItemCostoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCostoHabitacionActionPerformed
        // TODO add your handling code here:
        Consulta6 costo= new Consulta6();
        this.jDesktopPaneEscritorio.add(costo);
        costo.show();
    }//GEN-LAST:event_jMenuItemCostoHabitacionActionPerformed

    private void jMenuItemUbicacionHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUbicacionHuespedActionPerformed
        // TODO add your handling code here:
        Consulta7 buscar= new Consulta7();
        this.jDesktopPaneEscritorio.add(buscar);
        buscar.show();
    }//GEN-LAST:event_jMenuItemUbicacionHuespedActionPerformed

    private void jMenuItemEstadoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstadoHabitacionActionPerformed
        // TODO add your handling code here:
        Consulta8 buscar= new Consulta8();
        this.jDesktopPaneEscritorio.add(buscar);
        buscar.show();
    }//GEN-LAST:event_jMenuItemEstadoHabitacionActionPerformed

    private void jMenuItemHabitacionesPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHabitacionesPisoActionPerformed
        // TODO add your handling code here:
        Consulta9 buscar= new Consulta9();
        this.jDesktopPaneEscritorio.add(buscar);
        buscar.show();
    }//GEN-LAST:event_jMenuItemHabitacionesPisoActionPerformed

    private void jMenuItemListaHuespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaHuespedesActionPerformed
        // TODO add your handling code here:
        Consulta10 lista = new Consulta10();
        this.jDesktopPaneEscritorio.add(lista);
        lista.show();
    }//GEN-LAST:event_jMenuItemListaHuespedesActionPerformed

    private void jMenuItemOcupacionHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOcupacionHabActionPerformed
        JFreeChart grafica;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        String query = "SELECT estado FROM habitaciones WHERE tipo = 'Sencilla' AND estado = 'Ocupada'";
        int con = 0, con2 = 0, con3 = 0;
        this.conn.Consult(query);
        try{
            this.conn.rs.last();
            con = this.conn.rs.getRow();
            
            query = "SELECT estado FROM habitaciones WHERE tipo = 'Doble' AND estado = 'Ocupada'";
            this.conn.Consult(query);
            this.conn.rs.last();
            con2 = this.conn.rs.getRow();
            
            query = "SELECT estado FROM habitaciones WHERE tipo = 'Triple' AND estado = 'Ocupada'";
            this.conn.Consult(query);
            this.conn.rs.last();
            con3 = this.conn.rs.getRow();
        }catch(SQLException ex){   
        }
        
        datos.addValue( con , "Ocupadas" , "Sencilla");
        datos.addValue( con2, "Ocupadas" , "Doble" );
        datos.addValue( con3 , "Ocupadas" , "Triple" );
        datos.addValue( 13, "Total" , "Sencilla");
        datos.addValue( 10 , "Total" , "Doble");
        datos.addValue( 7 , "Total" , "Triple" );
       
        grafica = ChartFactory.createBarChart(
         "CAR USAGE STATIStICS", 
         "Category", "Score", 
         datos,PlotOrientation.VERTICAL, 
         true, true, false);
        
        
        ChartPanel Panel = new ChartPanel(grafica);
        JFrame Ventana = new JFrame("Habitaciones ocupadas por tipo");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemOcupacionHabActionPerformed

    private void jMenuItemOcupacionHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOcupacionHotelActionPerformed
        DecimalFormat fmt = new DecimalFormat("#.00");
        DefaultPieDataset dataset = new DefaultPieDataset();
        String query = "SELECT habitacion FROM habitaciones WHERE estado = 'Ocupada'";
        int con=0;
        double porOcupadas = 0, porLibres = 0;
        this.conn.Consult(query);
        
        try {
            this.conn.rs.last();
            con = this.conn.rs.getRow();
            porOcupadas = (double)con*100/30;
            porLibres = (double)(30-con)*100/30;
        } catch (SQLException ex) {
        }
            

        dataset.setValue("Habitaciones Ocupadas: %" + fmt.format(porOcupadas), porOcupadas);
        dataset.setValue("Habitaciones libres: %" + fmt.format(porLibres), porLibres);
        
        JFreeChart chart = ChartFactory.createPieChart("Repeticion de randoms",
                            dataset, true, true, true);
        
        ChartPanel Panel = new ChartPanel(chart);
        JFrame Ventana = new JFrame("Total de habitaciones por tipo");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItemOcupacionHotelActionPerformed

    private void jMenuItemHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHabitacionesActionPerformed
        // TODO add your handling code here:
        JFreeChart grafica;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        String query = "SELECT habitacion FROM habitaciones WHERE tipo = 'Sencilla'";
        int con = 0, con2 = 0, con3 = 0;
        this.conn.Consult(query);
        try{
            this.conn.rs.last();
            con = this.conn.rs.getRow();
            
            query = "SELECT habitacion FROM habitaciones WHERE tipo = 'Doble'";
            this.conn.Consult(query);
            this.conn.rs.last();
            con2 = this.conn.rs.getRow();
            
            query = "SELECT habitacion FROM habitaciones WHERE tipo = 'Triple'";
            this.conn.Consult(query);
            this.conn.rs.last();
            con3 = this.conn.rs.getRow();
        }catch(SQLException ex){   
        }
        
        
        datos.addValue( con, "Numero de habitaciones" , "Sencilla");
        datos.addValue( con2 , "Numero de habitaciones" , "Doble");
        datos.addValue( con3 , "Numero de habitaciones" , "Triple" );
       
        grafica = ChartFactory.createBarChart(
         "CAR USAGE STATIStICS", 
         "Category", "Score", 
         datos,PlotOrientation.VERTICAL, 
         true, true, false);
        
        
        ChartPanel Panel = new ChartPanel(grafica);
        JFrame Ventana = new JFrame("Total de habitaciones por tipo");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItemHabitacionesActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuSalirMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPaneEscritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAltas;
    private javax.swing.JMenu jMenuBajas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItemCostoHabitacion;
    private javax.swing.JMenuItem jMenuItemDoble;
    private javax.swing.JMenuItem jMenuItemEstadoHabitacion;
    private javax.swing.JMenuItem jMenuItemFotos;
    private javax.swing.JMenuItem jMenuItemHabitaciones;
    private javax.swing.JMenuItem jMenuItemHabitacionesPiso;
    private javax.swing.JMenuItem jMenuItemIngresos;
    private javax.swing.JMenuItem jMenuItemListaHuespedes;
    private javax.swing.JMenuItem jMenuItemOcupacionHab;
    private javax.swing.JMenuItem jMenuItemOcupacionHotel;
    private javax.swing.JMenuItem jMenuItemSencilla;
    private javax.swing.JMenuItem jMenuItemTriple;
    private javax.swing.JMenuItem jMenuItemUbicacionHuesped;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}