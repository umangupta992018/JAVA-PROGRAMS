import java.util.Scanner;
public class pallindrome
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n,rev=0,d;
        System.out.println("Enter The Number:\n");
        n=sc.nextInt();
        int m=n;
        while(n!=0)
        {
            d=n%10;
            rev = d + (rev*10);
            n/=10;
        }
        if(rev==m)
        {
            System.out.println(rev+" Is A Pallindrome Number.\n");
        }
        else
        {
            System.out.println(rev+" Is Not A Pallindrome Number.\n");
        }
    }
}
