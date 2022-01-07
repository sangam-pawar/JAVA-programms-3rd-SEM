import java.util.Scanner;
public class HextoBin
 {
     public static void main(String[] args)
     {
         int number;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a hexadecimal number: ");
         number = Integer. parseInt(sc.nextLine(), 16)  ;
         String strBinary = Integer.toBinaryString(number) ;
         System.out.println("Binary value is :" +strBinary) ;  
         sc.close();
     }
    
}
