import java.util.Scanner;
public class harshad_number
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n,d,sum=0;
        System.out.println("Enter The Number:\n");
        n=sc.nextInt();
        int m=n;
        while(m!=0)
        {
            d=m%10;
            sum=sum+d;
            m/=10;
        }
        if((n%sum)==0)
        {
            System.out.println(n+" Is A Harshad(NIVEN) Number.\n");
        }
        else
        {
            System.out.println(n+" Is Not A Harshad(NIVEN) Number.\n");
        }
    }
}
