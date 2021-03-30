/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Azucena
 */
public class NumerosPnl extends JPanel{

    private JTextField edtNum1;
    private JTextField edtNum2;
    private JTextField edtNum3;
    private JLabel lblNum1;
    private JLabel lblNum2;
    private JLabel lblNum3;

    public NumerosPnl() {
        super.setBackground(Color.ORANGE);
        edtNum1 = new JTextField(10);
        edtNum2 = new JTextField(10);
        edtNum3 = new JTextField(10);

        lblNum1 = new JLabel("Numero 1: ");
        lblNum2 = new JLabel("Numero 2: ");
        lblNum3 = new JLabel("Numero 3: ");
       
        super.add(lblNum1);
        super.add(edtNum1);
        super.add(lblNum2);
        super.add(edtNum2);
        super.add(lblNum3);
        super.add(edtNum3);
    }
    public void limmpiarControles(){
        edtNum1.setText("");
        edtNum2.setText("");
        edtNum3.setText("");
    }
   /* public Integer getNumero() throw NumeroIncorrectpException{
        try{
             Integer p = Integer.valueOf(edtNum1.getText());
             Integer s = Integer.valueOf(edtNum2.getText());
             Integer t = Integer.valueOf(edtNum3.getText());
             Integer resultado = p + s + t;
            return resultado;
       }catch(Exception e){
        edtNum1.requestFocus();
        edtNum2.requestFocus();
        edtNum3.requestFocus();
        throw new NumeroIncorrectoException("El dato ingresado no es un número, intentelo nuevamente.");
       }
    }*/
}
