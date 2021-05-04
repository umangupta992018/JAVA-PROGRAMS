import java.util.*;
public class number_of_even_odd_element_in_array
{
	public static void main(String args[])
	{
		int ce=0,co=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("\n\nArray Elements Are : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			if(arr[j]%2==0)
			{
				ce++;
			}
		}
		for(int j=0;j<n;j++)
		{
			if(arr[j]%2!=0)
			{
				co++;
			}
		}
		System.out.println("Number of even and odd elements in an array are : "+ce+" "+co);
	}
}
