
import java.util.*;
public class floyd_triangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j,c=1;
        System.out.print("Enter The Number Of Terms:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.print("\n");
        }
                
    }
}
