/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colores;

import conversor.ConversorFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Azucena
 */
public class ColoresFrame extends JFrame{
    private JSlider sldRojo;
    private JSlider sldVerde;
    private JSlider sldAzul;
    private JLabel lblRojo;
    private JLabel lblVerde;
    private JLabel lblAzul;
    private JSpinner spn1;
    private JSpinner spn2;
    private JSpinner spn3;
    private JPanel panel;
    private JPanel pnlA;
    private JPanel pnlB;
    private JPanel pnlC;
    private JLabel espacio2;
    private JLabel espacio3;
    private JLabel espacio5;
    
    public ColoresFrame(){
        super("Colores");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(535,200);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);       
        
        pnlA = new JPanel();
        pnlA.setBackground(Color.BLACK);
        pnlA.setPreferredSize(new Dimension(200,120));
        pnlA.setLayout(new BorderLayout());
        pnlA.setBorder(new TitledBorder("Color") ) ;
        pnlA.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel = new JPanel();
        panel.add(pnlA,BorderLayout.SOUTH);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        
        pnlB = new JPanel();
        pnlB.setPreferredSize(new Dimension(320,90));
        pnlB.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        pnlC = new JPanel();
        pnlC.setPreferredSize(new Dimension(70,40));
      
        lblRojo = new JLabel("Rojo");
        lblVerde= new JLabel("Verde");
        lblAzul = new JLabel("Azul");    

        sldRojo= new JSlider(JSlider.HORIZONTAL, 0, 255, 0); 
        sldRojo.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                spn1.setValue(sldRojo.getValue());
                changeColor();
            }
        });
        
        sldVerde= new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        sldVerde.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                spn2.setValue(sldVerde.getValue());
                changeColor();
            }
        });
        
        sldAzul= new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        sldAzul.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                spn3.setValue(sldAzul.getValue());
                changeColor();
            }
        });
        
        spn1= new JSpinner();
         spn1.setMaximumSize(new Dimension(0,110));
        spn1.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                sldRojo.setValue((Integer)spn1.getValue());
            }
        });
        
        spn2 = new JSpinner();
        spn2.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                sldVerde.setValue((Integer)spn2.getValue());
            }
        });
        spn3 = new JSpinner();
        spn3.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                sldAzul.setValue((Integer)spn3.getValue());
            }
        });
        espacio2 = new JLabel(" ");  
        espacio3 = new JLabel(" ");  
        espacio5 = new JLabel(" ");  
        
        pnlB.add(lblRojo);
        pnlB.add(espacio2);
        pnlB.add(sldRojo);
        pnlB.add(spn1);
        
        pnlB.add(lblVerde);
        pnlB.add(espacio3);
        pnlB.add(sldVerde);
        pnlB.add(spn2);
        
        pnlB.add(lblAzul);
        pnlB.add(espacio5);
        pnlB.add(sldAzul);
        pnlB.add(spn3);

        super.add(panel, BorderLayout.WEST);
        super.add(pnlB, BorderLayout.CENTER);
        super.add(pnlC, BorderLayout.EAST);
        super.setVisible(true);
    }
           private void changeColor(){
            
            Color color = new Color(
            sldRojo.getValue(),
            sldVerde.getValue(),
            sldAzul.getValue());
            
           pnlA.setBackground(color);
        }
    
    public static void main(String[] args) {
        new ColoresFrame();

    }
}
