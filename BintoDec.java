import java.util.Scanner;
public class BintoDec 
{

   public static void main(String[] args) 
   {
      int number, decimal = 0, a = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter binary number: ");
      String strBinary = sc.nextLine();
      number = Integer.parseInt(strBinary);
      while(number != 0){
         decimal += (number % 10) * Math.pow(2, a);
         number = number / 10;
         a++;
      }
      System.out.println("Decimal number: " + decimal);
      sc.close();
   }
}
    

