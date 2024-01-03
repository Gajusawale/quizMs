package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WithExceptionHandling {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        try {
            int numerator = sc.nextInt();
            int denominator = sc.nextInt();

            int result=numerator/denominator;
            System.out.println("result of denominator is : "+result);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Error: Denominator cannot be zero! ");
            ex.printStackTrace();
        }
        catch (InputMismatchException ex)
        {

            Error:
            System.out.println("Please enter valid integers!");
        } finally {
            System.out.println("connections are closed.");
            sc.close();
        }



    }
}
