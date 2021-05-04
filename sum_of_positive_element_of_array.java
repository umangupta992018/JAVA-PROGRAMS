
import java.util.*;
public class sum_of_positive_element_of_array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter The Size Of The Array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            arr[i]=arr[i]*arr[i];
            sum+=arr[i];
        }
        System.out.print("Sum Of Positive Squares Element In The Array : "+sum);
    }
}
