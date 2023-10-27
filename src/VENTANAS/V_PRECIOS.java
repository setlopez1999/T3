/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VENTANAS;

import ENTIDADES.Blusa;
import ENTIDADES.Camisa;
import ENTIDADES.Falda;
import ENTIDADES.Pantalon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Administrador
 */
public class V_PRECIOS extends javax.swing.JFrame {

    public PRINCIPAL padre;
    int key;
    DefaultListModel modelo = new DefaultListModel();
    
    public List<Camisa> listacamisas; 
    public List<Pantalon> listapantalones; 
    public List<Falda> listafaldas; 
    public List<Blusa> listablusas; 
    
    public V_PRECIOS() {
        //initComponents();
    }
    public V_PRECIOS(PRINCIPAL padre,int i) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.padre = padre;
        this.key = i;
        
        this.listacamisas = padre.listacamisas;
        this.listapantalones = padre.listapantalones ;
        this.listafaldas = padre.listafaldas;
        this.listablusas = padre.listablusas;
        
       
    }
    
    public void ActualizarModelo(){
        
        this.modelo = new DefaultListModel();
        if(key == 1){
            
            
            jLabel2.setText("PRECIOS DE CAMISAS");
            for(int i = 0;i< listacamisas.size();i++){
            String ropa = listacamisas.get(i).Texto();
            modelo.addElement(ropa);
            }        
   
        }
        else if(key == 2){
            jLabel2.setText("PRECIOS DE PANTALONES");

            for(int i = 0;i< listapantalones.size();i++){
            String ropa = listapantalones.get(i).Texto();
            modelo.addElement(ropa);
            }   
        }
        else if(key ==3){
            jLabel2.setText("PRECIOS DE FALDAS");

            for(int i = 0;i< listafaldas.size();i++){
            String ropa = listafaldas.get(i).Texto();
            modelo.addElement(ropa);
            }   
        }
        else if(key == 4){
            jLabel2.setText("PRECIOS DE BLUSAS");

            for(int i = 0;i< listablusas.size();i++){
            String ropa = listablusas.get(i).Texto();
            modelo.addElement(ropa);
            }   
        }
        listaRopa.setModel(modelo);
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaRopa = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LISTA DE PRECIOS");

        listaRopa.setBorder(null);
        listaRopa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listaRopa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaRopaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaRopa);

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("+");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("VOLVER");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaRopaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaRopaMouseClicked
        //Mandamos a la lista correspondiente
        if (evt.getClickCount() == 2 && listaRopa.getSelectedIndex() != -1){
            //Vamos a buscar el string en la lista actual de Estudiante

        }
    }//GEN-LAST:event_listaRopaMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //Abrimos
        this.dispose();
        V_AGREGAR ventana = new V_AGREGAR(this,key);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.dispose();
        padre.listacamisas =  this.listacamisas ;
        padre.listapantalones =  this.listapantalones ;
        padre.listafaldas =  this.listafaldas ;
        padre.listablusas =  this.listablusas ;
        
        padre.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaRopa;
    // End of variables declaration//GEN-END:variables
}
