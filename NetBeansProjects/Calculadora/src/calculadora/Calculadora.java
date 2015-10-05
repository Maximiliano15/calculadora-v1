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
      int operaciones = 0;
        int num1;
        int num2;
        double resultado;
        do {
            try {

                operaciones = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Sumar\n"
                        + "2.Restar\n" + "3.Multiplicar\n" + "4.Dividir\n" + "5.Nº mayor\n"
                        + "6.Pocentaje\n" + "7.Salir"));

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
                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el primer numero"));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el segundo numero"));
                        if (num1 > num2) {
                            JOptionPane.showMessageDialog(null, "el numero mayor es :   " + num1);
                        } else if (num1 < num2) {
                            JOptionPane.showMessageDialog(null, "el numero mayor :   " + num2);
                        } else {
                            JOptionPane.showMessageDialog(null, "son iguales");
                        }
                        break;
                    case 6:
                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero"));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el pocentaje"));
                        resultado = ((num1 * num2) / 100);
                        JOptionPane.showMessageDialog(null, "el porcentaje es:   " + resultado);
                    case 7:
                        int opcion;
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseas salir:\n 1.Si\n 2.No"));
                        if (opcion == 1) {
                            System.exit(0);
                        }

                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Invalida");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error");

            }
        } while (operaciones <= 7);


    }
}
