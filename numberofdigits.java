
import java.util.Scanner;
public class numberofdigits 
{
    public static void main(String arg[])
    {
        int n,c=0,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Digit:");
        n=sc.nextInt();
        int m=n;
        while(n!=0)
        {
            d=n%10;
            c++;
            n=n/10;
        }
        System.out.println("Number Of Digits In "+m+" is "+c+".\n");
    }
}
