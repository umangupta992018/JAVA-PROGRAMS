
import java.util.*;
public class quardratic_equation 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c,determinant,root1=0,root2=0,p=0,q=0,q1=0,perfectsquare=0,d;
        System.out.print("Enter The Value Of a in ax^2+bx+c=0 :");
        a=sc.nextDouble();
        System.out.print("Enter The Value Of b in ax^2+bx+c=0 :");
        b=sc.nextDouble();
        System.out.print("Enter The Value Of c in ax^2+bx+c=0 :");
        c=sc.nextDouble();
        determinant=(b*b)-(4*a*c);
        perfectsquare=Math.sqrt(determinant);
        d=perfectsquare*perfectsquare;
      if(determinant==0)
        {
            root1=root2=(-b)/(2*a);
            System.out.print("Root 1="+root1+" Root 2="+root2);
            System.out.println("\n");
        }
      if(determinant<0)
        {
           p=((-b)/(2*a*c));
           q=((Math.sqrt(determinant))/(2*a*c));
           System.out.print(p+"i"+q);
           System.out.print(p+"-i"+q);
        }
      if(determinant>0)
      {
         root1=((-b)+(Math.sqrt(determinant)))/(2*a*c);
         root2=((-b)-(Math.sqrt(determinant)))/(2*a*c);
         System.out.print("Root 1="+root1+" Root 2="+root2);
         System.out.println("\n");
      }
      if((d==determinant)&&(determinant>0))
      {
         root1=((-b)+(Math.sqrt(determinant)))/(2*a*c);
         root2=((-b)-(Math.sqrt(determinant)))/(2*a*c);
         System.out.print("Root 1="+root1+" Root 2="+root2);
         System.out.println("\n");
      }
      if((d!=determinant)&&(determinant>0))
      {
           p=((-b)/(2*a*c));
           q=((Math.sqrt(determinant))/(2*a*c));
           q1=Math.sqrt(q);
           root1=p+q1;
           root2=p-q1;
           System.out.print("Root 1="+root1+" Root 2="+root2);
           System.out.println("\n");
      }
      if((determinant>0)&&(d==determinant)&&(a==1)&&(b>0)&&(c>0))
      {
         root1=((-b)+(Math.sqrt(determinant)))/(2*a*c);
         root2=((-b)-(Math.sqrt(determinant)))/(2*a*c);
         System.out.print("Root 1="+root1+" Root 2="+root2);  
         System.out.println("\n");
      }
    }
}
