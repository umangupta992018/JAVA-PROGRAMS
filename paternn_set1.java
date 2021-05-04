
import java.util.*;
public class paternn_set1 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k,z,l,c;
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
                System.out.print(k+" ");
            }
            for(z=i;z>1;z--)
            {
                System.out.print((z-1)+" ");
            }
            System.out.print("\n");
        }
          for (k=1;k<=n-1;k++)
          {
           for (c=1;c<=k;c++)
           {
             System.out.print("  ");
           }
           for(c=1;c<=2*(n-k)-1;c++)
           {
             System.out.print(c+" ");
           }
             System.out.print("\n");
           }
    } 
}
