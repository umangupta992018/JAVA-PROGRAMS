
import java.util.*;
public class capitalize_firstsecond_letter_in_string
{ 
	public static void main(String args[]) 
	{ 
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter The String:");
                String str=sc.nextLine();  
		char[]ch = str.toCharArray(); 
		for (int i=0;i<ch.length;i++)
                {  
			int k=i; 
			while(i<ch.length && ch[i]!=' ') 
				i++;  
			ch[k]=(char)(ch[k]>='a'&&ch[k]<='z'?((int)ch[k]-32):(int)ch[k]); 
			ch[i-1]=(char)(ch[i-1] >='a'&&ch[i-1]<='z'?((int)ch[i-1]-32):(int)ch[i-1]); 
		} 
		for(int j=0;j<ch.length;j++)
                {
                    System.out.print(ch[j]+"");
                }
                System.out.print("\n");
	} 
} 

/*public class p73
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int l=0,i=0,a=0,b=0,h=0,k=0,g=1,p=2,o;
        System.out.print("Enter The String : ");
        s=sc.nextLine();
        l=s.length();
        char c[]=s.toCharArray();
        //System.out.println(c[l-l]+" "+(l-l));
        for(i=0;i<l;i++)
        {
            a=i-1;
            b=i+1;
            if(c[i]==' ')
            {
                //System.out.println(c[a]+"   "+c[b]);
                h++;
            } 
        }
        k=(h*2)+2;
        char[] ch = new char[k];
        ch[0]=c[0];
        ch[1]=c[l-1];
        //System.out.println(ch[0]+" "+(l-l));
        //System.out.println(ch[1]+" 1");
        for(i=0;i<l;i++)
        {
            a=i-1;
            //b=i+1;
            if(c[i]==' ')
            {
                p++;
                g++;
                ch[g]=c[a];
                //System.out.println(ch[g]+" "+g);
            }
        }
        for(i=0;i<l;i++)
        {
            //a=i-1;
            b=i+1;
            if(c[i]==' ')
            {
                p++;
                g++;
                ch[g]=c[b];
                //System.out.println(ch[g]+" "+g);
            }
        }
        //System.out.println(c[l-1]+" "+(l-1));
        for(o=0;o<p;o++)
        {
            //System.out.print(ch[o]+"   ");
            if((ch[o]>=97)&&(ch[o])<=122)
            {
                ch[o]=(char)(ch[o]-32);
            }
            else if((ch[o]>=65)&&(ch[o])<=90)
            {
                ch[o]=(char)(ch[o]);
            }
        }
        for(o=0;o<l;o++)
        {
            System.out.print(ch[o]+" ");
        }
        //System.out.print(p+"   ");
    }
}*/

