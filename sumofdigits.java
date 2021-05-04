
import java.util.Scanner;
public class sumofdigits
{
    public static void main(String arg[])
    {
        int n,sum=0,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Digit:");
        n=sc.nextInt();
        int m=n;
        while(n!=0)
        {
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.println("Sum Of Digits Of A Number "+m+" is "+sum+".\n");
    }
}
