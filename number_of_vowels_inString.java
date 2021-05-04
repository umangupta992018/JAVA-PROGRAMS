
import java.util.*;
public class number_of_vowels_inString 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int l,i,count=0;
        System.out.println("Enter The String:");
        s=sc.nextLine();
        System.out.print(s);
        char arr[]=s.toCharArray();
        l=s.length();
        for(i=0;i<l;i++)
        {
            if(arr[i]=='A'||arr[i]=='a'||arr[i]=='E'||arr[i]=='e'||arr[i]=='I'||arr[i]=='i'||arr[i]=='O'||arr[i]=='o'||arr[i]=='U'||arr[i]=='u')
            {
                count++;                
            }
        }
        //System.out.println("Number Of Vowels In String "+s+" Is : "+count);
    }
}
