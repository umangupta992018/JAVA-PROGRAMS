import java.util.Scanner;
public class sum_of_two_prime 
{
    public static void main(String args[])
    {
           Scanner sc = new Scanner(System.in);
           int n,i,num,j=0,z,o,m,d;
           int arr[]=new int[10000];
           System.out.print("\nEnter The Number:");
           n=sc.nextInt();
           for(i=1;i<=n;i++)         
           { 		  	  
             int c=0; 	  
             for(num=i;num>=1;num--)
	     {
                if(i%num==0)
	        {
 		  c=c+1;
	        }
	     }
	     if(c==2)
	     {
                  o=j++;
                  arr[o]=i;
	     }	
           }
           for(z=0;z<j;z++)
           {
              // System.out.print(arr[z]+",");
           }
           System.out.println(n+" Can Be Expressed As Sum Of Two Prime Numbers As:\n");
           for(m=0;m<j;m++)
           {
               for(d=0;d<j;d++)
               {
                   if((arr[m]+arr[d])==n)
                   {
                       System.out.println(arr[m]+" "+arr[d]);
                   }
               }
           }
    }
}
