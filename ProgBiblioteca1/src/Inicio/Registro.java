/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import javax.swing.JFrame;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
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
        jLabel3 = new javax.swing.JLabel();
        fSTexField_Usuario = new LIB.FSTexFieldMD();
        fSPassword_ContraseñaRepeat = new LIB.FSPasswordFieldMD();
        fSPassword_Contraseña = new LIB.FSPasswordFieldMD();
        Button_Registro = new LIB.FSButtonMD();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fSTexField_Nombre = new LIB.FSTexFieldMD();
        fSTexField_Codigo = new LIB.FSTexFieldMD();
        fSTexField_Correo = new LIB.FSTexFieldMD();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel3.setText("Bienvenido a Athos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        fSTexField_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        fSTexField_Usuario.setBordeColorFocus(new java.awt.Color(96, 45, 29));
        fSTexField_Usuario.setBordeColorNoFocus(new java.awt.Color(96, 45, 29));
        fSTexField_Usuario.setCaretColor(new java.awt.Color(96, 45, 29));
        fSTexField_Usuario.setMaterialDesing(true);
        fSTexField_Usuario.setPlaceholder("Usuario");
        jPanel1.add(fSTexField_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        fSPassword_ContraseñaRepeat.setForeground(new java.awt.Color(0, 0, 0));
        fSPassword_ContraseñaRepeat.setBordeColorFocus(new java.awt.Color(96, 45, 29));
        fSPassword_ContraseñaRepeat.setBordeColorNoFocus(new java.awt.Color(96, 45, 29));
        fSPassword_ContraseñaRepeat.setCaretColor(new java.awt.Color(96, 45, 29));
        fSPassword_ContraseñaRepeat.setMaterialDesing(true);
        fSPassword_ContraseñaRepeat.setPlaceholder("Repite Contraseña");
        fSPassword_ContraseñaRepeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSPassword_ContraseñaRepeatActionPerformed(evt);
            }
        });
        jPanel1.add(fSPassword_ContraseñaRepeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        fSPassword_Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        fSPassword_Contraseña.setBordeColorFocus(new java.awt.Color(96, 45, 29));
        fSPassword_Contraseña.setBordeColorNoFocus(new java.awt.Color(96, 45, 29));
        fSPassword_Contraseña.setCaretColor(new java.awt.Color(96, 45, 29));
        fSPassword_Contraseña.setMaterialDesing(true);
        fSPassword_Contraseña.setPlaceholder("Contraseña");
        jPanel1.add(fSPassword_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        Button_Registro.setText("Crear Cuenta");
        Button_Registro.setColorHover(new java.awt.Color(241, 90, 34));
        Button_Registro.setColorNormal(new java.awt.Color(241, 90, 34));
        Button_Registro.setColorPressed(new java.awt.Color(255, 84, 31));
        Button_Registro.setColorTextPressed(new java.awt.Color(0, 0, 0));
        Button_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RegistroActionPerformed(evt);
            }
        });
        jPanel1.add(Button_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Ya tienes cuenta?, Ingresa");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, 20));

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 20, 20));

        fSTexField_Nombre.setForeground(new java.awt.Color(0, 0, 0));
        fSTexField_Nombre.setBordeColorFocus(new java.awt.Color(96, 45, 29));
        fSTexField_Nombre.setBordeColorNoFocus(new java.awt.Color(96, 45, 29));
        fSTexField_Nombre.setCaretColor(new java.awt.Color(96, 45, 29));
        fSTexField_Nombre.setMaterialDesing(true);
        fSTexField_Nombre.setPlaceholder("Nombres");
        jPanel1.add(fSTexField_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        fSTexField_Codigo.setForeground(new java.awt.Color(0, 0, 0));
        fSTexField_Codigo.setBordeColorFocus(new java.awt.Color(96, 45, 29));
        fSTexField_Codigo.setBordeColorNoFocus(new java.awt.Color(96, 45, 29));
        fSTexField_Codigo.setCaretColor(new java.awt.Color(96, 45, 29));
        fSTexField_Codigo.setMaterialDesing(true);
        fSTexField_Codigo.setPlaceholder("Codigo");
        jPanel1.add(fSTexField_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        fSTexField_Correo.setForeground(new java.awt.Color(0, 0, 0));
        fSTexField_Correo.setBordeColorFocus(new java.awt.Color(96, 45, 29));
        fSTexField_Correo.setBordeColorNoFocus(new java.awt.Color(96, 45, 29));
        fSTexField_Correo.setCaretColor(new java.awt.Color(96, 45, 29));
        fSTexField_Correo.setMaterialDesing(true);
        fSTexField_Correo.setPlaceholder("Correo");
        jPanel1.add(fSTexField_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 340, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro2.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 340, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/241468302_859234871625468_3605033002232276093_n.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fSPassword_ContraseñaRepeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSPassword_ContraseñaRepeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fSPassword_ContraseñaRepeatActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Login b = new Login();
        b.setVisible(true);
        b.pack();
        b.setLocationRelativeTo(null);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Button_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RegistroActionPerformed
        String nombres = fSTexField_Nombre.getText();
        String codigo = fSTexField_Codigo.getText();
        String correo = fSTexField_Correo.getText();
        String usuario = fSTexField_Usuario.getText();
        String contraseña = String.valueOf(fSPassword_Contraseña.getPassword());
        String repitecontraseña = String.valueOf(fSPassword_ContraseñaRepeat.getPassword());
        
        if(nombres.equals("")){
            JOptionPane.showMessageDialog(null,"Agrega un nombre");
        
        
        }else if(codigo.equals("")){
             JOptionPane.showMessageDialog(null,"Agrega un codigo de alumno");
        
        }else if(correo.equals("")){
             JOptionPane.showMessageDialog(null,"Agrega un correo");
        
        }else if(usuario.equals("")){
             JOptionPane.showMessageDialog(null,"Agrega un usuario");
        
        }else if(contraseña.equals("")){
             JOptionPane.showMessageDialog(null,"Agrega una contraseña");
        
        }else if(!contraseña.equals(repitecontraseña)){
             JOptionPane.showMessageDialog(null,"repite la contraseña inicial");
        
        } else{
        
        PreparedStatement bd;
        String datos="INSERT INTO `registro`(`nombres`, `codigo`, `correo`, `usuario`, `contraseña`, `repitecontraseña`) VALUES (?,?,?,?,?,?)";
        
        try {
            bd =Basededatos.conectar().prepareStatement(datos);
            
            bd.setString(1, nombres);
            bd.setString(2, codigo);
            bd.setString(3, correo);
            bd.setString(4, usuario);
            bd.setString(5, contraseña);
            bd.setString(6, repitecontraseña);
            
            if(bd.executeUpdate()>0){
                JOptionPane.showMessageDialog(null,"Cuenta creada con exito!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_Button_RegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD Button_Registro;
    private LIB.FSPasswordFieldMD fSPassword_Contraseña;
    private LIB.FSPasswordFieldMD fSPassword_ContraseñaRepeat;
    private LIB.FSTexFieldMD fSTexField_Codigo;
    private LIB.FSTexFieldMD fSTexField_Correo;
    private LIB.FSTexFieldMD fSTexField_Nombre;
    private LIB.FSTexFieldMD fSTexField_Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
