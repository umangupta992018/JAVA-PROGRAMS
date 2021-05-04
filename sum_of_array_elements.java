
import java.util.*;
public class sum_of_array_elements
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,sum=0;
        System.out.print("Enter The Size Of The Array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.print("Sum Of The Elements Of The Array Is : "+sum+"\n");
    }
}
