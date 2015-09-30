/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Maximiliano
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int operaciones;
        double num1;
        int num2;
        double resultado;

       do 
       {
            operaciones = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Sumar\n"
                    + "2.Restar\n" + "3.Multiplicar\n" + "4.Dividir\n" + "5.salir\n"));
 
            switch (operaciones) {
                case 1:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el primer numero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el segundo numero"));
                    resultado = num1 + num2;
                    JOptionPane.showMessageDialog(null, "la suma es :  " + resultado);
                    break;

                case 2:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el primer numero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el segundo numero"));
                    resultado = num1 - num2;
                    JOptionPane.showMessageDialog(null, "la resta es :  " + resultado);
                    break;
                case 3:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el primer numero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el segundo numero"));
                    resultado = num1 * num2;
                    JOptionPane.showMessageDialog(null, "la multiplicacion es :  " + resultado);
                    break;
                case 4:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el primer numero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el segundo numero"));
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "la division es :  " + resultado);
                    break;
                case 5:
                    JOptionPane.showInputDialog("Deseas abandona el menu:\n 1.Si\n 2.No\n");
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");
            }
            }
       
            while (operaciones < 5);
        
        
        }   }


