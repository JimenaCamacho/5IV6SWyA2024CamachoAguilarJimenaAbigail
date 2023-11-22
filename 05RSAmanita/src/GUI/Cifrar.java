/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.math.BigInteger;
import javax.swing.JOptionPane;
import java.util.Random;
import pkg05rsamanita.rsa;

public class Cifrar extends javax.swing.JFrame {
    StringBuilder textoCifradoStrBuilder = new StringBuilder();
    String CDescifrado;
    

  
    public Cifrar() {
        initComponents();
        
        setLocationRelativeTo(null);
        textoCifrado.setEditable(false);
        textoCifrado.setEnabled(false);

    
        
    }

    public StringBuilder getTextoCifradoStrBuilder() {
        return textoCifradoStrBuilder;
    }

    public void setTextoCifradoStrBuilder(StringBuilder textoCifradoStrBuilder) {
        this.textoCifradoStrBuilder = textoCifradoStrBuilder;
    }
      
    public String getCDescifrado() {
        return CDescifrado;
    }

    public void setCDescifrado(String CDescifrado) {
        this.CDescifrado = CDescifrado;
    }
     
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textoaCifrar = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoCifrado = new javax.swing.JTextArea();
        cifrarTxt = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tamprimo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoaCifrar.setColumns(20);
        textoaCifrar.setRows(5);
        jScrollPane1.setViewportView(textoaCifrar);

        jLabel1.setText("Ingrese el texto a cifrar:");

        jLabel2.setText("Texto cifrado:");

        textoCifrado.setColumns(20);
        textoCifrado.setRows(5);
        jScrollPane2.setViewportView(textoCifrado);

        cifrarTxt.setText("Cifrar");
        cifrarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cifrarTxtActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresa el tamaño del numero primo (mayor a 3 digitos) ");

        tamprimo.setColumns(20);
        tamprimo.setRows(5);
        jScrollPane3.setViewportView(tamprimo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(cifrarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cifrarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cifrarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cifrarTxtActionPerformed
    BigInteger claveDescifrado;
    BigInteger[] txtCifrado;
    int tamPrimo;
    String textoNPrimo = tamprimo.getText().trim();
    

    if (!textoaCifrar.getText().isEmpty() && !tamprimo.getText().isEmpty() && Integer.parseInt(tamprimo.getText()) >99) {
        
        try {
            tamPrimo = Integer.parseInt(tamprimo.getText());
            rsa obj = new rsa(tamPrimo);
            obj.generarPrimos();
            obj.generarClaves();
            textoCifrado.setEnabled(true);
            textoCifrado.setEnabled(true); 
            txtCifrado = obj.cifrar(textoaCifrar.getText());
      
            textoCifradoStrBuilder.setLength(0); // Restablecer el StringBuilder
            
            for (BigInteger elemento : txtCifrado) {
                textoCifradoStrBuilder.append(elemento.toString()).append(" ");
            }

            String textoCifradoStr = textoCifradoStrBuilder.toString().trim();
            textoCifrado.setText(textoCifradoStr);
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
    } else {
        JOptionPane.showMessageDialog(null, "El numero del tamaño primo no es valido o algún campo esta vacío");
    }
     
    }//GEN-LAST:event_cifrarTxtActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Opciones op = new Opciones();
        op.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_regresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cifrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cifrarTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton regresar;
    private javax.swing.JTextArea tamprimo;
    private javax.swing.JTextArea textoCifrado;
    private javax.swing.JTextArea textoaCifrar;
    // End of variables declaration//GEN-END:variables
}
