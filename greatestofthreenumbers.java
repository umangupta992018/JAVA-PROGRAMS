
import java.util.Scanner;
public class greatestofthreenumbers
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3,a,b,c;
        System.out.println("Enter The 1st Number:");
        n1=sc.nextInt();
        a=n1;
        System.out.println("Enter The 2nd Number:");
        n2=sc.nextInt();
        b=n2;
        System.out.println("Enter The 3rd Number:");
        n3=sc.nextInt();
        c=n3;
        n1=(n1>n2)?n1:n2;
        n2=(n1>n3)?n1:n3;
        System.out.println("Greatest of "+a+" , "+b+" , "+c+" is "+n2+".\n");
    }
}
