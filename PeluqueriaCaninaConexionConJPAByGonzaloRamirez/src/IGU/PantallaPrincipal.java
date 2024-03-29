
package IGU;

import Logica.PeluqueriaCanina;
import Persistencia.ControladoraPersistencia;
import javax.swing.JOptionPane;


public class PantallaPrincipal extends javax.swing.JFrame {

    public PantallaPrincipal() {
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
        numCliente = new javax.swing.JLabel();
        raza = new javax.swing.JLabel();
        nombrePerro = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        alergico = new javax.swing.JLabel();
        atencionEspecial = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        nombreDuenio = new javax.swing.JLabel();
        celularDuenio = new javax.swing.JLabel();
        observaciones = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtNombrePerro = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtNombreDuenio = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtObservaciones = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        txtAlergico = new javax.swing.JComboBox<>();
        txtAtencion = new javax.swing.JComboBox<>();
        guardar = new javax.swing.JButton();
        fotoPerro = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numCliente.setForeground(new java.awt.Color(255, 255, 255));
        numCliente.setText("Cliente N°:");
        jPanel1.add(numCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, -1, -1));

        raza.setForeground(new java.awt.Color(255, 255, 255));
        raza.setText("Raza:");
        jPanel1.add(raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 156, -1, -1));

        nombrePerro.setForeground(new java.awt.Color(255, 255, 255));
        nombrePerro.setText("Nombre:");
        jPanel1.add(nombrePerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        color.setForeground(new java.awt.Color(255, 255, 255));
        color.setText("Color:");
        jPanel1.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 182, -1, -1));

        alergico.setForeground(new java.awt.Color(255, 255, 255));
        alergico.setText("Alérgico:");
        jPanel1.add(alergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 208, -1, -1));

        atencionEspecial.setForeground(new java.awt.Color(255, 255, 255));
        atencionEspecial.setText("Atención especial:");
        jPanel1.add(atencionEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 234, -1, -1));

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 95, 35));

        nombreDuenio.setForeground(new java.awt.Color(255, 255, 255));
        nombreDuenio.setText("Nombre Dueño:");
        jPanel1.add(nombreDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, -1, -1));

        celularDuenio.setForeground(new java.awt.Color(255, 255, 255));
        celularDuenio.setText("Cel. Dueño:");
        jPanel1.add(celularDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 289, -1, -1));

        observaciones.setForeground(new java.awt.Color(255, 255, 255));
        observaciones.setText("Observaciones:");
        jPanel1.add(observaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 312, -1, -1));
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 240, -1));
        jPanel1.add(txtNombrePerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 240, -1));
        jPanel1.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 240, -1));
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 240, -1));
        jPanel1.add(txtNombreDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 241, -1));
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 241, -1));
        jPanel1.add(txtObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 241, 86));

        titulo.setBackground(new java.awt.Color(204, 204, 204));
        titulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Peluquería Canina");
        titulo.setToolTipText("");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 4, -1, 67));

        txtAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));
        txtAlergico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlergicoActionPerformed(evt);
            }
        });
        jPanel1.add(txtAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        txtAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));
        jPanel1.add(txtAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 95, 35));

        fotoPerro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/perro.png"))); // NOI18N
        jPanel1.add(fotoPerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 270, 290));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/fondo.jpg"))); // NOI18N
        fondo.setText("jLabel2");
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlergicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlergicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlergicoActionPerformed
       //accion del boton Guardar
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
       ControladoraPersistencia control = new ControladoraPersistencia();
        
       //Creamos almacenamos los datos de los campos
       int id = Integer.parseInt(this.txtCliente.getText());
       String nombrePerro= this.txtNombrePerro.getText();
       String raza= this.txtRaza.getText();
       String color = this.txtColor.getText();
       String alergico = (String) this.txtAlergico.getSelectedItem();
       String atencion= (String) this.txtAtencion.getSelectedItem();
       String nombreDuenio = this.txtNombreDuenio.getText();
       int celular = Integer.parseInt(this.txtCelular.getText());
       String observaciones = this.txtObservaciones.getText();
       
       //Hacemos el objeto y le pasamos los datos
       PeluqueriaCanina pc1 = new PeluqueriaCanina(id, nombrePerro,raza,color,alergico,atencion,nombreDuenio,celular,observaciones);
       //Lo almacenamos en la Base de Datos
       control.crearDatos(pc1);
       //cartel informativo al usuario de que agrego un cliente
       JOptionPane.showMessageDialog(this, "Cliente Agregado");
        
    }//GEN-LAST:event_guardarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
       this.txtCliente.setText("");
       this.txtNombrePerro.setText("");
       this.txtRaza.setText("");
       this.txtColor.setText("");
       this.txtNombreDuenio.setText("");
       this.txtCelular.setText("");
       this.txtObservaciones.setText("");
    }//GEN-LAST:event_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alergico;
    private javax.swing.JLabel atencionEspecial;
    private javax.swing.JLabel celularDuenio;
    private javax.swing.JLabel color;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fotoPerro;
    private javax.swing.JButton guardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel nombreDuenio;
    private javax.swing.JLabel nombrePerro;
    private javax.swing.JLabel numCliente;
    private javax.swing.JLabel observaciones;
    private javax.swing.JLabel raza;
    private javax.swing.JLabel titulo;
    private javax.swing.JComboBox<String> txtAlergico;
    private javax.swing.JComboBox<String> txtAtencion;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNombrePerro;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
