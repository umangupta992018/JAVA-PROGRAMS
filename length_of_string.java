
import java.util.*;
public class length_of_string 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int count=0;
        System.out.print("Enter The String :");
        s=sc.nextLine();
        int i=0;
        for(char c: s.toCharArray())
        {
            count++;
        }
        System.out.print("Length Of String Is: "+count);
    }
}
