import java.util.Scanner;
public class Smallest
 {
     public static void main(String[] args)
     {
         Scanner in = new Scanner(System.in);
         System.out.println("Input the first number:");
         double x = in.nextDouble();
         System.out.println("Input the second number:");
         double y = in.nextDouble();
         System.out.println("Input the third number:");
         double z = in.nextDouble();
         System.out.print("The smallest value is " +smallest(x,y,z)+"\n");
     }
     public static double smallest(double x,double y,double z)
     {
         return Math.min(Math.min(x,y),z);
     }
}
