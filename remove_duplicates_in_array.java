import java.util.*;
public class remove_duplicates_in_array
{
	static int removeDuplicates(int arr[], int n) 
	{ 
		if(n==0||n==1)
		{
			return n;
		}
		int[] temp = new int[n]; 
		int j = 0; 
		for(int i=0;i<n-1;i++)
		{
			if (arr[i] != arr[i+1])
			{
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1]; 
		for (int i=0;i<j;i++)
		{
			arr[i] = temp[i];
		}
		return j; 
	} 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array : ");
		int n1=sc.nextInt();
		int arr[]=new int[n1];
		for(int k=0;k<n1;k++)
		{
			arr[k]=sc.nextInt();
		}
		int n = removeDuplicates(arr, n1); 
		for (int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" "); 
		}
	} 
} 


