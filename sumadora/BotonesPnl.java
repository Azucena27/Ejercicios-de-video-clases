/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Azucena
 */
public class BotonesPnl extends JPanel{
    
    private JButton btnCalcular;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private JPanel pnlSalir;
    private JPanel pnlAcciones;
    private BotonesPanelListener listener;
    
    public BotonesPnl(){
        super.setBackground(Color.LIGHT_GRAY);
        super.setLayout(new BorderLayout());
         
        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                listener.calcularButtonClick();
            }
        });
    
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                listener.limpiarButtonClick();
            }
        });
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                listener.salirButtonClick();
            }
        });
        
        pnlSalir = new JPanel();
        pnlSalir.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnlSalir.setBackground(Color.PINK);
        pnlSalir.add(btnSalir);
        
        pnlAcciones = new JPanel();
        pnlSalir.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnlAcciones.setBackground(Color.CYAN) ;
        pnlAcciones.add(btnCalcular);
        pnlAcciones.add(btnLimpiar);
        
        super.add(pnlSalir,BorderLayout.WEST);
        super.add(pnlAcciones, BorderLayout.EAST);
    } 

    public void setListener(BtnPnlListener listner){
        this.listener = (BotonesPanelListener) listner;
    }
}
