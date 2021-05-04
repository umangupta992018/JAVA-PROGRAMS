
import java.util.*;
public class non_repeating_character_in_string 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int l,i,j;
        System.out.println("Enter The String:");
        s=sc.nextLine();
        l=s.length();
        char c[]=s.toCharArray();
        int freq[]=new int[l];
        System.out.println("Non-Repeating Characters In A String "+s+" Is : ");
        for(i=0;i<l;i++)
        {
            freq[i]=1;
            for(j=i+1;j<l;j++)
            {
                if(c[i]==c[j])
                {
                    freq[i]++;
                    c[j]='\0';
                }
            }
            if(freq[i]<=1)
            {
                System.out.print(c[i]+" ");
            }
        }
        System.out.println("\n\n");
        /*for(i=0;i<freq.length;i++)
        {    
            if(c[i]!=' '&&c[i]!='0')    
                System.out.println(c[i] + "-" + freq[i]);    
        }*/
    }
}
