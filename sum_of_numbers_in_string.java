
import java.util.*;
public class sum_of_numbers_in_string
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int l,i,sum=0;
        System.out.print("Enter The String:");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            char t=s.charAt(i);
            if(Character.isDigit(t))
            {
                int b;
                b = Integer.parseInt(String.valueOf(t));
                sum=sum+b;
            }
        }
        System.out.println("Sum Of Numbers In The String "+s+" Is "+sum);      
    }
}
