import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;
import java.math.*;
class Solution
{
    public static boolean anagrams(char c1[],char c2[])
    {
        if(c1.length!=c2.length) return false;
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<c1.length;i++)
        {
            if(c1[i]!=c2[i]) return false;
        }
        return true;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();s1=s1.toLowerCase();
        String s2=sc.next();s2=s2.toLowerCase();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        if(anagrams(c1,c2))
        {
            System.out.println("Anagrams");
        }
        else
        {
           System.out.println("Not Anagrams"); 
        }
    }
}
