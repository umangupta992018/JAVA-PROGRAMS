
import java.util.*;
public class reverse_of_string
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str,rev="";
        int n,i;
        System.out.print("Enter The String : ");
        str=sc.nextLine();
        n=str.length();
        char c[]=str.toCharArray();
        for(i=n-1;i>=0;i--)
        {
            rev=rev+c[i];
        }
        System.out.print("Reverse Of A String "+str+" Is "+rev);
    }
}
