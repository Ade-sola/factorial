
package factorial.program;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialProgram {
    public static BigInteger factorial(long num){        
            /*int i = num;
            int fact = 1;*/
            BigInteger fact = BigInteger.ONE;
        /*while (i > 1)
	{
        fact *= i;
        i--;
        
        System.out.println(fact +" * "+ i +" = "+ fact*i);
      	}
            return fact;*/
        for (long i = 2; i<= num; i++){
        fact = fact.multiply(BigInteger.valueOf(i));
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
