/*Solid rectangle star pattern*/

import java.util.*;
public class solid_rectangle_star_pattern 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,i,j,m;
        System.out.print("Enter The Number Of Terms Of The Series:");
        n=sc.nextInt();
        System.out.print("Enter The Number Of Terms Of The Series:");
        m=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                System.out.print("*");
                /*if(i==1||j==1||i==n||j==m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }*/
            }
              System.out.print("\n");
        }
    }
}
