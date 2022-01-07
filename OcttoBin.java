import java.util.Scanner;
public class OcttoBin
 {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println(" Enter octal number :");
         int octal = Integer.parseInt(sc.nextLine(), 8);
         String strBinary = Integer.toBinaryString(octal);
         System.out.println("Binary value is :" + strBinary);
         sc.close();

     }
    
}
