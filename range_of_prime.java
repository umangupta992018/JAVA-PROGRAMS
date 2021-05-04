import java.util.Scanner;
public class range_of_prime 
{
   public static void main (String[] args)
   {	
       int i=0,num=0,min,max;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter The Minimum Limit:");
       min=sc.nextInt();
       System.out.print("\nEnter The Maximum Limit:");
       max=sc.nextInt();
       System.out.println("Prime numbers from "+min+" to "+max+" are :");
       for(i=min;i<=max;i++)         
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
	     System.out.print(i+"\n");
	  }	
       }	
   }
}