
import java.util.*;
public class number_of_patterns_in_string
{
    static int find_pattern(char str[])
    {
        char last=str[0];
        int i=1,counter=0;
        //System.out.println(str.length);
        while(i<str.length)
        {
            if(str[i]=='1'&&last=='0')
            {
                while(str[i]=='1')
                {
                    i++;
                }
                if(str[i]=='0')
                {
                    counter++;
                }
            }
            last=str[i];
            i++;
        }
        return counter;
}
    
public static void main(String args[])
{
    String string;
    System.out.println("Patterns of 0(1+)0 in the given string : ");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string : ");
    string=sc.next();
    char[] str=string.toCharArray();
    System.out.print("Number of patterns : " +find_pattern(str));
} 
}