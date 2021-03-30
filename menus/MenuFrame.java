/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;

/**
 *
 * @author Azucena
 */
public class MenuFrame extends JFrame{
    
    private JMenuBar mnBar;
    private JMenu mnArchivo;
    private JMenu mnAyuda;
    private JMenuItem mitNuevo;
    private JMenuItem mitAbrir;
    private JMenuItem mitSalir ;
    private JMenuItem mitAcerca;
    private JSeparator separador;
    
    public MenuFrame(){
        super("Menus");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 300);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        mnBar = new JMenuBar();
        mnBar.setLayout(new FlowLayout(FlowLayout.LEADING));
        mnBar.setPreferredSize(new Dimension(434, 24));
        
        mnArchivo= new JMenu("Archivo");
        mnAyuda = new JMenu("Ayuda");
        mitNuevo = new JMenuItem();
        mitNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Vas a crear un archivo nuevo", "Nuevo", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        mitAbrir = new JMenuItem();
        mitSalir = new JMenuItem();
        mitAcerca = new JMenuItem();
        separador = new JSeparator();
   
        mitNuevo.setText("Nuevo");
        mitNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
        mnArchivo.add(mitNuevo);
        mitAbrir.setText("Abrir");
        mnArchivo.add(mitAbrir);
        mnArchivo.add(separador);
        mitSalir .setText("Salir");
        mnArchivo.add(mitSalir );

        mnBar.add(mnArchivo);
      
        mitAcerca.setText("Acerca de...");
        mitAcerca.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.CTRL_DOWN_MASK));
        mnAyuda.add(mitAcerca);
     
        mnBar.add(mnAyuda, BorderLayout.NORTH);
        
        super.add(mnBar, BorderLayout.NORTH);
        super.setVisible(true);
    }
    
     public static void main(String[] args){
        new MenuFrame();
     }
}
