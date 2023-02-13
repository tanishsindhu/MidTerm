/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic {

    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("Enter the arithmetic operation to perform: ");
        String operationInput = in.next();
        ArithmeticOperation operation = ArithmeticOperation.valueOf(operationInput.toUpperCase());
        double result = r.calculate(m, n, operation);
        System.out.println("Result: " + result);
    }
}
