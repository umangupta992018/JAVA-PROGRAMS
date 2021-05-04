
import java.util.*;
public class common_sequence_in_a_string 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1,str2;
        int n1,n2,i,j;
        char ch1,ch2;
        System.out.print("Enter The First String : ");
        str1=sc.nextLine();
        System.out.print("Enter The Second String : ");
        str2=sc.nextLine();
        n1=str1.length();
        n2=str2.length();
        int arr[][]=new int[n1+1][n2+1];
        for(i=0;i<=n1;i++)
        {
            for(j=0;j<=n2;j++)
            {
                arr[i][j]=0;
            }
        }
        for(i=1;i<=n1;i++)
        {
            for(j=1;j<=n2;j++)
            {
                ch1=str1.charAt(i-1);
                ch2=str2.charAt(j-1);
                if(ch1==ch2)
                {
                    arr[i][j]=1+arr[i][j-1]+arr[i-1][j];
                }
                else
                {
                    arr[i][j]=arr[i][j-1]+arr[i-1][j]-arr[i-1][j-1]; 
                }
            }
        }
        System.out.print("Total Common Subsequence In Two Strings "+str1+" And "+str2+" Is "+arr[n1][n2]);
    }
    
}
