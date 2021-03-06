/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Reglas de las interfaces:
* No puedes crear objetos a partir de ellas
* Todos sus métodos son implícitamente abstractos
* Al implementar la interface debe de tener la misma firma del método abstracto
  las clases que la implementen a dicha interface
* Puedes declarar variables siempre y cuando se inicialice el valor, si no se 
  viola la regla de los constructores
*/

/*
Pasos para crear tu propia excepción:
1. Crear la clase siguiendo la covención de nombres: Para la convención verificar que va a validar la excepción, en éste 	caso "Número no negativo"  y darle ese nombre seguido de la palabra Exception (NumeroNoNegativoException)
2. Crear una clase separada que sea la que valida "ValidarValorNoNegativo"
*/

package unitec_proyecto_geometria;

/**
 *
 * @author ricar_000
 */
public class ProyectoGeometria extends javax.swing.JFrame {

    /**
     * Creates new form ProyectoGeometria
     */
    public ProyectoGeometria() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textoLado = new javax.swing.JTextField();
        botonCalcularArea = new javax.swing.JButton();
        etiquetaResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 0));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("¿Cuál es el valor del lado?");

        textoLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoLadoActionPerformed(evt);
            }
        });

        botonCalcularArea.setText("Procesar");
        botonCalcularArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularAreaActionPerformed(evt);
            }
        });

        etiquetaResultado.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        etiquetaResultado.setText("Resultado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoLado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(botonCalcularArea))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiquetaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(textoLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCalcularArea)
                .addGap(59, 59, 59)
                .addComponent(etiquetaResultado)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoLadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoLadoActionPerformed

    private void botonCalcularAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularAreaActionPerformed
        /*Pedirle el valor del número al campo de texto 
        y transformarlo a un número real*/
        
        /*
        Pasos para manejar una excepción y la vea el cliente terminal:
        1.- Identificar el renglón que tiene la posibilidad de lanzar la excepción
        2.- Inmediatamente después de cerrar el "Try", agregar el bloque de "Catch" con el argumento
            correcto y la lógica deseada
        */
        try{
            Cuadrado c=new Cuadrado();
            c.setLado(Float.parseFloat(textoLado.getText()));
            etiquetaResultado.setText("El área es: "+c.calcularArea());
        }
        catch(Throwable algo){
            //etiquetaResultado.setText("El valor que metiste no es un número, tonto");
            etiquetaResultado.setText(algo.getMessage());
        }
    }//GEN-LAST:event_botonCalcularAreaActionPerformed

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
            java.util.logging.Logger.getLogger(ProyectoGeometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoGeometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoGeometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoGeometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoGeometria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcularArea;
    private javax.swing.JLabel etiquetaResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textoLado;
    // End of variables declaration//GEN-END:variables
}
