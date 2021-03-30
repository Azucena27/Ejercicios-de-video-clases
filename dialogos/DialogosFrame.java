/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Azucena
 */
public class DialogosFrame extends JFrame{

    private JLabel lblTitulo;
    private JTextField edtTitulo;
    private JLabel lblMensaje;
    private JTextField edtMensaje;
    private JButton btnGenerar;
    private JPanel pnlGenerar;
    private JPanel pnlOpciones;
    private JPanel pnlAcciones;
    private JRadioButton rbtInfo;
    private JRadioButton rbtPregunta;
    private JRadioButton rbtPrecaucion;
    private JRadioButton rbtError;
    private ButtonGroup grupo1;
    private JLabel lblEspacio;

    public DialogosFrame() {
        super("Dialogos");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 220);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);


        pnlOpciones = new JPanel();
        pnlOpciones.setPreferredSize(new Dimension(150, 80));
        pnlOpciones.setLayout(new FlowLayout(FlowLayout.LEFT));

        pnlAcciones = new JPanel();
        pnlAcciones.setPreferredSize(new Dimension(250, 80));
        pnlAcciones.setLayout(new FlowLayout(FlowLayout.LEFT));

        pnlGenerar = new JPanel();
        pnlGenerar.setBackground(Color.ORANGE);
        pnlGenerar.setPreferredSize(new Dimension(200, 40));
        pnlGenerar.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
       
       

        lblTitulo = new JLabel("Titulo: ");
        edtTitulo = new JTextField(20);
        lblEspacio = new JLabel(" ");
        lblMensaje = new JLabel("Mensaje: ");
        edtMensaje = new JTextField(20);
        pnlAcciones.add(lblTitulo);
        pnlAcciones.add(edtTitulo);
        pnlAcciones.add(lblEspacio);
        pnlAcciones.add(lblMensaje);
        pnlAcciones.add(edtMensaje);

        JRadioButton rbtInfo = new JRadioButton("Información", true);
        JRadioButton rbtPregunta = new JRadioButton("Pregunta", false);
        JRadioButton rbtPrecaucion = new JRadioButton("Precaución", false);
        JRadioButton rbtError = new JRadioButton("Error", false);

        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(rbtInfo);
        grupo1.add(rbtPregunta);
        grupo1.add(rbtPrecaucion);
        grupo1.add(rbtError);

        pnlOpciones.add(rbtInfo);
        pnlOpciones.add(rbtPregunta);
        pnlOpciones.add(rbtPrecaucion);
        pnlOpciones.add(rbtError);
        
         btnGenerar = new JButton("Generar");
        btnGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rbtInfo.isSelected()) {
                    JOptionPane.showMessageDialog(null, edtMensaje.getText(), edtTitulo.getText(), JOptionPane.INFORMATION_MESSAGE);
                }
                if (rbtPregunta.isSelected()) {
                    JOptionPane.showMessageDialog(null, edtMensaje.getText(), edtTitulo.getText(), JOptionPane.QUESTION_MESSAGE);
                }
                if (rbtPrecaucion.isSelected()) {
                   JOptionPane.showMessageDialog(null, edtMensaje.getText(), edtTitulo.getText(), JOptionPane.WARNING_MESSAGE);
                }
                if (rbtError.isSelected()) {
                    JOptionPane.showMessageDialog(null, edtMensaje.getText(), edtTitulo.getText(), JOptionPane.ERROR_MESSAGE);
                }
            }
        }
   );
         pnlGenerar.add(btnGenerar);


        super.add(pnlAcciones, BorderLayout.EAST);
        super.add(pnlOpciones, BorderLayout.CENTER);
        super.add(pnlGenerar, BorderLayout.SOUTH);
        super.setVisible(true);
    }

    public static void main(String[] args) {
        new DialogosFrame();

    }

}
