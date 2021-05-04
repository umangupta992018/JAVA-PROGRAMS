import java.util.*;
class special_patterns
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,j,n,k=1;
        System.out.print("Enter The Value Of N:");
        n=sc.nextInt();
        System.out.println("1");
            for(j=1;j<=n;j++)
            {
                k=k*11;
                System.out.print((k)+" \n");
            }
    }
}