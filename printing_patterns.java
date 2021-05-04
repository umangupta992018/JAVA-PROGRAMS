
import java.util.*;
public class printing_patterns
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k,z;
        System.out.print("Enter The Value Of Value:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n-1;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*    ");
            }
            /*for(z=i;z>1;z--)
            {
                System.out.print("   "+(z-1)+" ");
            }*/
            System.out.print("\n");
        }
    }
}
