
import java.util.*;
public class frequency_of_3 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int min,max,i,n,c=0;
        System.out.print("Enter The Minimum Limit:");
        min=sc.nextInt();
        System.out.print("Enter The Maximum Limit:");
        max=sc.nextInt();
        for(i=min;i<=max;i++)
        {
            n=i;
            while(n!=0)
            {
                if(n%10==3)
                {
                    c++;
                }
                n/=10;   
            }
        }
        System.out.println("Number of Times The Number 3 Occurs Between "+min+" and "+max+" is "+c+" .");
        
        
    }
}
