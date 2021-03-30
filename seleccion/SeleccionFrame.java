/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JFileChooser;

/**
 *
 * @author Azucena
 */
public class SeleccionFrame extends JFrame {

    private JTextField edtAdjuntar;
   // private JFileChooser dlgFile;
    private JColorChooser dlgColor;
    private JLabel lblAdjuntar;
    private JButton btnAdjuntar;
    private JTextField edtGuardar;
    private JLabel lblGuardar;
    private JButton btnGuardar;
    private JLabel lblColor;
    private JLabel lblEspacio;
    private JPanel pnlA;
    private JPanel pnlColor;
    private JButton btnColor;
    private JPanel panel;

    public SeleccionFrame() {
        super("Selección de archivos");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 200);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 200));

        lblAdjuntar = new JLabel("Adjuntar archivos: ");
        lblGuardar = new JLabel("Guardar: ");
        lblColor = new JLabel("Color: ");
        edtAdjuntar = new JTextField(25);
        edtGuardar = new JTextField(25);
        btnAdjuntar = new JButton("...");
        JFileChooser dglFile = new JFileChooser();
        btnAdjuntar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resultado = dglFile.showOpenDialog(null);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    edtAdjuntar.setText(dglFile.getSelectedFile().toString());
                }
            }
        });
        btnGuardar = new JButton("...");
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resultado = dglFile.showSaveDialog(null);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    edtGuardar.setText(dglFile.getSelectedFile().toString());
                }
            }
        });

        lblEspacio = new JLabel("   ");
        pnlColor = new JPanel();
        pnlColor.setPreferredSize(new Dimension(280, 50));
        pnlColor.setBorder(new LineBorder(Color.BLACK));
        btnColor = new JButton("...");
        btnColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = dlgColor.showDialog(null, "Selecciona un color", pnlColor.getBackground());
                if (color != null){
                    pnlColor.setBackground(color);
                }
            }
        });

        pnlA = new JPanel();
        pnlA.setPreferredSize(new Dimension(443, 200));
        pnlA.setLayout(new BorderLayout());
        pnlA.setLayout(new FlowLayout(FlowLayout.RIGHT));

        pnlA.add(lblAdjuntar);
        pnlA.add(edtAdjuntar);
        pnlA.add(btnAdjuntar);
        pnlA.add(lblEspacio);
        pnlA.add(lblGuardar);
        pnlA.add(edtGuardar);
        pnlA.add(btnGuardar);
        pnlA.add(lblColor);
        pnlA.add(pnlColor);
        pnlA.add(btnColor);

        panel.add(pnlA);
        super.add(panel, BorderLayout.CENTER);
        super.setVisible(true);
    }

    public static void main(String[] args) {
        new SeleccionFrame();

    }

}
