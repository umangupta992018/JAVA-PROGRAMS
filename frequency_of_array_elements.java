import java.util.*;
public class frequency_of_array_elements 
{
	public static void main(String args[])
	{
		int temp,c;
		Scanner sc =new Scanner(System.in);
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
		for(int i=0;i<n;i++)
		{
			int k=arr[i];
			c=0;
			for(int j=0;j<n;j++)
			{
			if(arr[j]==k)
			{
				c++;
			}}
			System.out.println(c+" Times "+arr[i]);
		}
	}
	}


