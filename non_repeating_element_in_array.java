import java.util.*;
public class non_repeating_element_in_array
{
	public static int nonrepeatingelement(int arr1[],int n1)
	{
		int count=1,j,i;
		for(i=0;i<n1;i++)
		{
			for( j=0;j<n1;j++)
			{
				if((i!=j)&&(arr1[i]==arr1[j]))
					break;
			}
				if(j == n1)
				{
					System.out.print(arr1[i]+" ");
					++count;
				}
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,j,h;
		System.out.println("Enter The Size Of The Array : ");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(h=0;h<n;h++)
		{
			arr[h]=sc.nextInt();
		}
		nonrepeatingelement(arr,n);
		
	}
}
