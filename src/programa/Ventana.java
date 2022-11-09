
package programa;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Ventana extends javax.swing.JFrame {

    
    public Ventana() {
        initComponents();
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImagen = new javax.swing.JPanel();
        botonCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonCargar.setText("Cargar Imagen");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagenLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(botonCargar)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImagenLayout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addComponent(botonCargar)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        JFileChooser escoger = new JFileChooser();
        escoger.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);//Establecemos el modelo
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*jpg","jpg");
        FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("*png","png");//Mas filtros
        escoger.setFileFilter(filtro);
         escoger.setFileFilter(filtro2);
        
        int seleccion = escoger.showOpenDialog(this);//darnos cuentas de la opcion que el usuario ha escogido
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {//si el usuario escogió aceptar 
          File archivo = escoger.getSelectedFile();//Obtenemos el archivo seleccionado
          String ruta = archivo.getAbsolutePath();//Obtenemos la ruta del archivo seleccionado
          
           int ancho = panelImagen.getWidth();
           int alto = panelImagen.getHeight();
           
           Imagen imagen = new Imagen(ancho, alto, ruta);
           panelImagen.add(imagen);
           panelImagen.repaint();
        }
        
        //int ancho = panelImagen.getWidth();
        //int alto = panelImagen.getHeight();
        //String ruta = "/imagenes/backetball.jpg";
        
        //Imagen imagen = new Imagen(ancho, alto, ruta);
        //panelImagen.add(imagen);
        //panelImagen.repaint();
    }//GEN-LAST:event_botonCargarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargar;
    private javax.swing.JPanel panelImagen;
    // End of variables declaration//GEN-END:variables
}
