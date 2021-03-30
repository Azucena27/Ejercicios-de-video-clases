/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadora;

/**
 *
 * @author Azucena
 */
public class NumeroIncorrectoException extends Exception{
    
    public NumeroIncorrectoException(){
        
    }
    
    public NumeroIncorrectoException(String msg){
        super(msg);
    }
}
