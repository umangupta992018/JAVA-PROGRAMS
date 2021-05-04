
import java.util.*;
class decoding_of_number
{
       public static int countDecodingDP(String digits, int n)
       {
	if (digits.charAt(0)=='0')
	{
            return 0;
	}
	int count0=1,count1=1,count2;
	for(int i=2;i<=n;i++)
	{
		int dig1=0,dig2,dig3=0;
		if(digits.charAt(i-1)!='0')
		{
		    dig1=1;
		}
		if(digits.charAt(i-2)=='1')
		{
		    dig2=1;
		}
		else
		    dig2=0;
			
		if(digits.charAt(i-2)=='2'&&digits.charAt(i-1)<'7')
		{
		    dig3=1;
		}
		count2=dig1*count1+dig2+dig3*count0;
		count0=count1;
		count1=count2;
	}
	return count1;
      }
      public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String Digits:");
        String digits=sc.nextLine();
	int n = digits.length();
        System.out.print("Number Of Possible Decodings Of A Given Digit Sequence Is : ");
	System.out.print(countDecodingDP(digits, n));
        System.out.println("\n");
      }
}
