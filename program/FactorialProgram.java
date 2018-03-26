
package factorial.program;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialProgram {
    public static BigInteger factorial(long num){        
        BigInteger fact = BigInteger.ONE;
        long c;        
        c = num;
        while (c > 1)
        {
        fact = fact.multiply(BigInteger.valueOf(c));
        c--;
        
        System.out.println(fact +" * "+ c +" = "+ fact.multiply(BigInteger.valueOf(c)));
      	}
            return fact;
        
    }
            
    public static void main(String[] args) {
        
        Scanner c = new Scanner (System.in);
        System.out.println("Enter integer: ");
        int num = c.nextInt();
        System.out.println("Expected output: ");
        BigInteger factor = factorial(num);
        System.out.println("Factorial of " +num+ " is: "+factor);
    }
    
}
