/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Azucena
 */
public class ImagenesFrame extends JFrame{
    
    private JLabel imagen;
    private JCheckBox chkBarbilla;
    private JCheckBox chkLentes;
    private JCheckBox chkCabello;
    private JCheckBox chkDientes;
    private JPanel pnl;
    private JPanel pnl2;
    private JPanel pnl3;
    
    public ImagenesFrame(){
        super("Imagenes");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(310, 180);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        pnl = new JPanel();
        pnl.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnl.setPreferredSize(new Dimension(150,125));
        
        imagen = new JLabel();
        imagen.setIcon(new ImageIcon(getClass().getResource("/images/geek-----.gif")));
        pnl.add(imagen);
        
        chkBarbilla = new JCheckBox("Barbilla");
        chkBarbilla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              imagen.setIcon(new ImageIcon(getClass().getResource(String.format("/images/%s", calcularNombre()))));
            }
        });
        
        chkLentes = new JCheckBox("Lentes");
        chkLentes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 imagen.setIcon(new ImageIcon(getClass().getResource(String.format("/images/%s", calcularNombre()))));
            }
        });
        
        chkCabello = new JCheckBox("Cabello");
        chkCabello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               imagen.setIcon(new ImageIcon(getClass().getResource(String.format("/images/%s", calcularNombre())))); 
            }
        });
        
        chkDientes = new JCheckBox("Dientes");
        chkDientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(getClass().getResource(String.format("/images/%s", calcularNombre()))));
            }
        });
        
        pnl2 = new JPanel();
        pnl2.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl2.setPreferredSize(new Dimension(110, 125));
        
        pnl2.add(chkBarbilla);
        pnl2.add(chkLentes);
        pnl2.add(chkCabello);
        pnl2.add(chkDientes);
        
        pnl3 = new JPanel();
        pnl3.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnl3.setPreferredSize(new Dimension(200, 125));
        pnl3.add(pnl);
        
        super.add(pnl3, BorderLayout.EAST);
        super.add(pnl2, BorderLayout.WEST);
        super.setVisible(true);
    }
    
    private String calcularNombre(){
      String resultado = "geek-";
      
      resultado = resultado +(chkBarbilla.isSelected() ? "c" : "-");
      resultado = resultado +(chkLentes.isSelected() ? "g" : "-");
      resultado = resultado +(chkCabello.isSelected() ? "h" : "-");
      resultado = resultado +(chkDientes.isSelected() ? "t" : "-");
 
        return resultado+".gif"; 
    }
    
    public static void main(String[] args) {
     new ImagenesFrame();
    }
}
