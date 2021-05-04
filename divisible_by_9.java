
import java.util.*;
public class divisible_by_9 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int min,max,i,j,c,k,m=0;
        System.out.println("Enter The Minimum Limit:");
        min=sc.nextInt();
        System.out.println("Enter The Maximum Limit:");
        max=sc.nextInt();
        for(i=min;i<=max;i++)
        {
            k=i;
            c=0;
            for(j=1;j<=k;j++)
            {
              if(k%j==0)
              {
                c++;
              }
            }
            if(c==9)
            m++;
        }   
        System.out.print("Number of integers which has exactly 9 divisors From "+min+" and "+max+" Is "+m+" \n");
    }
}

