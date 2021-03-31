/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadora;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Azucena
 */
public class SumadoraFrame extends JFrame{
    
    private BotonesPnl pnlBotones;
    private NumerosPnl pnlNumeros;
    
    public SumadoraFrame(){
        super("Sumadora");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(260, 300);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        pnlBotones = new BotonesPnl(); 
        pnlNumeros = new NumerosPnl();
  
        super.add(pnlBotones, BorderLayout.SOUTH);
        super.add(pnlNumeros, BorderLayout.CENTER);       
        super.setVisible(true);
    }
    
    public static void main(String[] args){
        new SumadoraFrame();
    }
}
