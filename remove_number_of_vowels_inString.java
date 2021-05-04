
import java.util.*;
public class remove_number_of_vowels_inString 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int l,i;
        System.out.print("Enter The String:");
        s=sc.nextLine();
        char arr[]=s.toCharArray();
        l=s.length();
        for(i=0;i<l;i++)
        {
            if(arr[i]=='A'||arr[i]=='a'||arr[i]=='E'||arr[i]=='e'||arr[i]=='I'||arr[i]=='i'||arr[i]=='O'||arr[i]=='o'||arr[i]=='U'||arr[i]=='u')               
            {
                arr[i]='\0';
            }   
        }
        System.out.print("String "+s+" After Removing Vowels Is : ");
        for(i=0;i<l;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
