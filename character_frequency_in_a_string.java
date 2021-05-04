
import java.util.*;
public class character_frequency_in_a_string
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int l=0,i=0,count=0,j=0;
        System.out.println("Enter The String:");
        s=sc.nextLine();
        char []ch = s.toCharArray();
        l=s.length();
        int[] freq=new int[l];
        for(i=0;i<l;i++)
        {    
            freq[i]=1;    
            for(j=i+1;j<l;j++)
            {    
                if(ch[i]==ch[j])
                {    
                    freq[i]++;
                    ch[j]='0';
                } 
                
            }
        }
        System.out.println("Characters And Their Corresponding Frequencies In The String "+s+" Is : ");    
        for(i=0;i<freq.length;i++)
        {    
            if(ch[i]!=' '&&ch[i]!='0')    
                System.out.println(ch[i] + "-" + freq[i]);    
        }
    }
}
