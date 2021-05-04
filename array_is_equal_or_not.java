import java.util.*;
public class array_is_equal_or_not
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int c=0;
		System.out.println("Enter The Size Of The Array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int j=0;j<n;j++)
		{
			arr[j]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				arr[i]/=2;
			}
			if(arr[i]%3==0)
			{
				arr[i]/=3;
			}
			if(arr[i]==arr[0])
			{
				c++;
			}
		}
		if(c==n)
		{
			System.out.println("\nArray Is Equal.");
		}
		if(c!=n)
		{
			System.out.println("\nArray Is Not Equal.");
		}
	}
}
