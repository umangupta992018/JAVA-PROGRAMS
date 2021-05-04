import java.util.*;
public class repeating_element_in_array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,count=1,j,c=0;
		System.out.println("Enter The Size Of The Array : ");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]+" Is A Repeating Element In The Array ");
					
				}
			}
		}
		
		
	}
}
