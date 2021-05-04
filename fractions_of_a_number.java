import java.util.Scanner;
public class fractions_of_a_number 
{
    public static void main(String arg[])
    {
        double num1,num2,deno1,deno2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Numerator1:\n");
        num1=sc.nextDouble();
        System.out.println("Enter The Numerator2:\n");
        num2=sc.nextDouble();
        System.out.println("Enter The Denominator1:\n");
        deno1=sc.nextDouble();
        System.out.println("Enter The Denominator2:\n");
        deno2=sc.nextDouble();
        double frac1=(num1/deno1);
        double frac2=(num2/deno2);
        double addfrac=frac1+frac2;
        System.out.println(addfrac+" Is The Sum Of Two Fractions.\n"); 
    }
}
