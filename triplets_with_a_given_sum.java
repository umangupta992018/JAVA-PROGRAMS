import java.util.*;
public class triplets_with_a_given_sum
{
	static void printMissing(int ar[], int low, int high)
	{
		Arrays.sort(ar);
		int index = ceilindex(ar, low, 0, ar.length - 1);
		int x = low;
		while(index<ar.length && x<=high)
		{
			if (ar[index]!=x)
			{
				System.out.print(x + " ");
			}
			else
			{
				index++;
			}
			x++;
		}
		while(x <= high)
		{
			System.out.print(x + " ");
			x++;
		}
	}
	
	static int ceilindex(int ar[], int val, int low, int high)
	{

		if (val < ar[0])
			return 0;
		if (val > ar[ar.length - 1])
			return ar.length;

		int mid = (low + high) / 2;
		if (ar[mid] == val)
			return mid;
		if (ar[mid] < val) {
			if (mid + 1 < high && ar[mid + 1] >= val)
				return mid + 1;
			return ceilindex(ar, val, mid + 1, high);
		}
		else {
			if (mid - 1 >= low && ar[mid - 1] < val)
				return mid;
			return ceilindex(ar, val, low, mid - 1);
		}
	}

	public static void main(String[] args)
	{
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
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
		
		printMissing(arr, arr[0], arr[n-1]);
	}
}

