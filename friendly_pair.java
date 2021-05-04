import java.util.Scanner;
public class friendly_pair 
{
    public static void main(String arg[])
    {
        int m=0,z=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The 1st Number:\n");
        int n1=sc.nextInt();
        System.out.println("Enter The 2nd Number:\n");
        int n2=sc.nextInt();
        for(int i=1;i<n1;i++)
        {
            if(n1%i==0)
            {
                m=m+i;
            }
        }
        //System.out.println("hh"+m);
        for(int j=1;j<n2;j++)
        {
            if(n2%j==0)
            {
                z=z+j;
            }
        }
       // System.out.println(sum_2); 
       if((n1/n2) == (m/z))
           System.out.println(n1+" and "+n2+" a Friendly pair(amicable).\n");
       
       else
       {
                      System.out.println(n1+" and "+n2+" Not a Friendly pair(amicable).\n");
       }
    //  System.out.println(m+" "+z);
         }
        }
    

