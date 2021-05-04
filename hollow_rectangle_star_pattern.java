/*Hollow rectangle star pattern*/

import java.util.*;
public class hollow_rectangle_star_pattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,m,i,j;
        System.out.print("Enter The Value Of n:");
        n=sc.nextInt();
        System.out.print("Enter The Value Of m:");
        m=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                if(i==1||j==1||i==n||j==m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
