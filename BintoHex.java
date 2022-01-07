import java.util.Scanner;
public class BintoHex
{
    public static void main(String[] args)
    {
     int number;
     Scanner sc = new Scanner(System.in);
     System.out.println(" Enter a binary number: ");
     number = Integer.parseInt(sc.nextLine(), 2);
     String strHexadecimal = Integer.toHexString(number);
     System.out.println("Hexadecimal value is: " + strHexadecimal);
     sc.close();
    } 
}  
        