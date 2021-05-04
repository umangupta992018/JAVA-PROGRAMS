import java.util.Scanner;
public class factor_of_a_number
{
    public static void main(String arg[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");
            }
        }
    }
}
