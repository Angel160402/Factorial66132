/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial66132;

/**
 *
 * @author User
 */
public class Factorial66132 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador=1;
        int multiplicación=1;
        
        while (contador <= 15) {
            System.out.println("Es: " + contador );
            multiplicación *=  contador;
            contador ++;
            
        }
        System.out.println("El resultado es: " + multiplicación );
    }
    
}
