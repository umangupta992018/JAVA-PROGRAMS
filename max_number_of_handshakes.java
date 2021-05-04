import java.util.Scanner;
public class max_number_of_handshakes
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,maxhandshakes;
        System.out.print("Enter The Number Of Person : ");
        n=sc.nextInt();
        maxhandshakes=(n*(n-1))/2;
        System.out.println("Maximum Number Of Handshakes Between "+n+" the person is : "+maxhandshakes);
    }
}
