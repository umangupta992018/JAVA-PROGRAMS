/*QUESTON 1 - A character is a vowel or consonant*/
package mypack;
import java.util.Scanner;
class characterisvowelorconsonant 
{
     public static void main(String arg[])
     {
        Scanner sc = new Scanner(System.in);
        char c;
        System.out.println("Enter The Character\n");
        c = sc.next().charAt(0);
        System.out.println("\n");
       if((c == 'A')||(c == 'E')||(c == 'I')||(c == 'O')||(c == 'U')||(c == 'a')||(c == 'e')||(c == 'i')||(c == 'o')||(c == 'u'))
       {
            System.out.println(c+" is a VOWEL.");
       }
       else if((c!='A')||(c!='E')||(c!='I')||(c != 'O')||(c != 'U')||(c != 'a')||(c != 'e')||(c != 'i')||(c != 'o')||(c != 'u'))
       {
            System.out.println(c+" is a CONSONANT.");
       }
     }
}
