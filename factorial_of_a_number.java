package mypack;
import java.util.Scanner;
public class factorial_of_a_number 
{
       public static void main(String arg[])
       {
           int n,i,fact=1;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter The Number:");
           n=sc.nextInt();
           for(i=0;i<n;i++)
           {
               fact=fact*(n-i);
           }
            System.out.println("\nFactorial Of "+n+" is "+fact+" .\n");
       }
}
