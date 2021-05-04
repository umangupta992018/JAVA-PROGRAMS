import java.util.*;
public class numbers_of_can_be_made_equal 
{
	public static void main(String args[])
	{
		int j,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter The Array Elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
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
			System.out.println("yes-Can the numbers of an array be made equal");
		}
		if(c!=n)
		{
			System.out.println("Cannot  numbers of an array be made equal?");
		}
	}
}
