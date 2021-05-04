import java.util.Scanner;
public class perfect_number 
{
 public static void main(String arg[])
 {
    Scanner sc=new Scanner(System.in);
    int n,sum = 0;
    System.out.println("Enter The Number:\n");
    n=sc.nextInt();
    for(int i=1;i<n;i++)
    {
        if(n%i==0)
        {
          sum=sum+i;
        }
    }
    if(sum==n)
    {
        System.out.println(n+" is a perfect number.\n");
    }
    else
    {
        System.out.println(n+" is not a perfect number.\n");
    }
 }
}
