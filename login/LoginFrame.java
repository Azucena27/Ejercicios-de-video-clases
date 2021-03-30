/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

/**
 *
 * @author Azucena
 */
public class LoginFrame extends JFrame{
    
    private JLabel lblUno;
    private JLabel lblUsuario;
    private JLabel lblPassword;
    private JLabel lbl4;
    private JLabel lblVisible;
    private JTextField edtUsuario;
    private JPasswordField edtPassword ;  
    private JPanel pnlA;
    private JPanel pnlB;
    private JPanel pnlC;
    private JPanel pnlD;
    private JPanel panel;
    private JPanel pnl;
    private JToggleButton btnOjo;
    private ImageIcon imgOjo;
    private JButton btnIngresar;
    
    
    
    public LoginFrame(){
        super("Login");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 300);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);

        pnl = new JPanel();
        pnl.setPreferredSize(new Dimension(400,25));
        pnl.setLayout(new BorderLayout());
        pnl.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        lblUno= new JLabel("Mi super Aplicación");
        lblUno.setFont(new Font("Arial",Font.BOLD , 15));
        lblUno.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnl.add(lblUno);
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,250));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        
        pnlA = new JPanel();
        pnlA.setPreferredSize(new Dimension(400,220));
        pnlA.setLayout(new BorderLayout());
        pnlA.setBorder(new SoftBevelBorder(BevelBorder.LOWERED) ) ;
        pnlA.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlA.add(panel);
        pnlB = new JPanel();
        pnlB.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlB.add(pnlA);
        
        pnlC = new JPanel();
        pnlC.setPreferredSize(new Dimension(400,45));
        pnlC.setLayout(new BorderLayout());
        pnlC.setBorder(new SoftBevelBorder(BevelBorder.LOWERED) ) ;
        pnlC.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        pnlD = new JPanel();
        pnlD.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlD.add(pnlC,BorderLayout.SOUTH);
        
        lblUsuario = new JLabel("Usuario: ");
        edtUsuario = new JTextField(20);
        lblPassword= new JLabel("Password: ");  
        lblVisible = new JLabel(); 
        edtPassword = new JPasswordField(15);  
        btnOjo = new JToggleButton();
 //       btnOjo.setBounds(300, 40 300, 40);
        btnOjo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblVisible.setVisible(btnOjo.isSelected());
                lblVisible.setText(String.valueOf(edtPassword.getPassword()));
            }
        });
      
        imgOjo = new ImageIcon(getClass().getResource("/images/ojo.jpg"));
        //btnOjo.setBounds(20, 20, 20, 20);
        panel.add(lblUsuario);
        panel.add(edtUsuario);
        panel.add(lblPassword);
        panel.add(edtPassword);
        panel.add(btnOjo);
        panel.add(lblVisible);
        
        btnIngresar = new JButton("Ingresar");
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,String.format("Bienvenido(a) %s !",edtUsuario.getText()),"Acceso permitido", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        pnlC.add(btnIngresar);

        super.add(pnlB, BorderLayout.CENTER);
        super.add(pnlD, BorderLayout.SOUTH);
        super.add(pnl, BorderLayout.NORTH);
        super.setVisible(true);
    }
    
    public static void main(String[] args) {
        new LoginFrame();

    }
}
