
import java.util.*;
public class pascal_triangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,j,k,l=1,n;
        System.out.println("Enter The Number Of Rows:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
                if(k==0||i==0)
                {
                    l=1;
                }
                else
                {
                    l=l*(i-k+1)/k;
                }
                System.out.print(l);
            }
                System.out.print("\n");
        }
    }
}

