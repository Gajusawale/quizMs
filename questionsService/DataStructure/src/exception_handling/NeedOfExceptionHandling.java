package exception_handling;

import java.util.Scanner;

public class NeedOfExceptionHandling {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

      int numerator=  sc.nextInt();
      int denominator=sc.nextInt();



      if(denominator!=0)
      {
          int result=numerator/denominator;
          System.out.println("result of denominator is : "+result);
      }
      else {
          System.out.println("Error: Denominator cannot be zero! ");
      }

      sc.close();
    }
}
