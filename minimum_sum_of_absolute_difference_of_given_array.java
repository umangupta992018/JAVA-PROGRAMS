import java.util.*;
class minimum_sum_of_absolute_difference_of_given_array 
{
	public static void main(String args[])
	{
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("\n\nArray Elements Are : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int sum = 0;
		sum += Math.abs((arr[0])-(arr[1]));
		sum += Math.abs((arr[n-1])-(arr[n-2]));

		for (int i=1;i<n-1;i++)
		sum +=Math.min(Math.abs((arr[i])-(arr[i-1])),Math.abs((arr[i])-(arr[i+1]))); // Total sum of minimum absolute difference

		System.out.println(sum);
	}
}
























//Java program to find the sum of minimum absolute difference in an array

/*import java.*;
import java.util.Arrays;

public class Main
{
static int sumOfMinAbsDifferences(
int arr[] ,int n)
{

Arrays.sort(arr);
int sum = 0;
sum += Math.abs(arr[0] – arr[1]);
sum += Math.abs(arr[n-1] – arr[n-2]);

for (int i = 1; i < n – 1; i++)
sum +=
Math.min(Math.abs(arr[i] – arr[i-1]),
Math.abs(arr[i] – arr[i+1])); // Total sum of minimum absolute difference

return sum;
}

public static void main(String args[])
{
int arr[] = {1, 3, 6, 9, 3};
int n = arr.length;

System.out.println( “Sum = ” + sumOfMinAbsDifferences(arr, n));
}
}*/