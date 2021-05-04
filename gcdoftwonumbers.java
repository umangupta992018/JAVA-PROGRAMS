
import java.util.Scanner;
public class gcdoftwonumbers
{
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        int a,b,i,gcd=0;
        System.out.println("Enter The 1st Number:");
        a=sc.nextInt();
        System.out.println("Enter The 2nd Number:");
        b=sc.nextInt();
        
        
        for(i=1;i<=a&&i<=b;i++)
        {
            if((a%i==0)&&(b%i==0))
            {
                gcd=i;
            }
        }
        System.out.println("GCD Of Two Number "+a+" and "+b+" is "+gcd+".\n");
       
    }
}
