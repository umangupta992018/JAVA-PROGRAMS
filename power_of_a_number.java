import java.util.Scanner;
public class power_of_a_number 
{
    public static void main(String arg[])
    {
        int pow=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Base:\n");
        int base=sc.nextInt();
        System.out.println("Enter The Exponent:\n");
        int expo=sc.nextInt();
        for(int i=1;i<=expo;i++)
        {
            pow=base*pow;
        }
        System.out.println(base+" To The Power "+expo+" Is : "+pow);
    }
}
