/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Azucena
 */
public class ConversorFrame extends JFrame {

    private JLabel lblCantidad;
    private JLabel lblResultado;
    private JTextField edtCantidad;
    private JTextField edtResultado;
    private JButton btnSalir;
    private JPanel pnlA;
    private JPanel pnlB;
    private JPanel pnlSalir;
    private JPanel pnlC;
    private JComboBox combOpc;

    public static final Double DOLAR = 23.78;

    public ConversorFrame() {
        super("Conversor");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(350, 200);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);

        pnlA = new JPanel();
        pnlA.setPreferredSize(new Dimension(100, 70));

        lblCantidad = new JLabel("Cantidad: ");
        pnlA.add(lblCantidad);
        edtCantidad = new JTextField(10);
        pnlA.add(edtCantidad);

        combOpc = new JComboBox();
        combOpc.addItem("Seleccionar");
        combOpc.addItem("Peso a Dolar");
        combOpc.addItem("Dolar a Peso");
        combOpc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double cantidad = Double.valueOf(edtCantidad.getText());
                Double resultado = combOpc.getSelectedIndex() == 1 ? cantidad / DOLAR : cantidad * DOLAR;
                edtResultado.setText(String.format("$ %.2f", resultado));
            }
        });
        pnlA.add(combOpc);

        pnlB = new JPanel();
        pnlB.setPreferredSize(new Dimension(100, 70));

        edtResultado = new JTextField(10);
        edtResultado.setText("$0.00");
        pnlB.add(edtResultado);

        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        pnlC = new JPanel();
        pnlC.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnlC.setBackground(Color.LIGHT_GRAY);
        pnlC.add(btnSalir);

        super.add(pnlA, BorderLayout.NORTH);
        super.add(pnlB, BorderLayout.CENTER);
        super.add(pnlC, BorderLayout.SOUTH);
        super.setVisible(true);

    }

    public static void main(String[] args) {
        new ConversorFrame();

    }
}
