package mypack;
import java.util.Scanner;
public class reverse_of_a_number 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int rev=0,n,m,d;
        System.out.println("\nEnter The Number:\n");
        n=sc.nextInt();
        m=n;
        while(n!=0)
        {
            d=n%10;
            rev = d + (rev*10);
            n=n/10;
        }
        System.out.println("\nReverse Of A Number "+m+" is "+rev+" .\n");
    }
}
