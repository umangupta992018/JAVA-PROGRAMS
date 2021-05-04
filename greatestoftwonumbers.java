
import java.util.Scanner;
public class greatestoftwonumbers 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter THE 1st Number:");
        a=sc.nextInt();
        System.out.println("Enter The 2nd Number:");
        b=sc.nextInt();
        System.out.println("\n\n");
        if(a>b)
        {
            System.out.println(a+" is Greater Than "+b+".\n");
        }
        if(b>a)
        {
            System.out.println(b+" Greater Than "+a+".\n");
        }
        
    }
}
