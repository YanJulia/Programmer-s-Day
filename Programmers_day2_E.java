import java.util.Scanner;

public class Programmers_day2_E {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Year:");
      int year = scanner.nextInt();

      if (isLeapYear(year)) {
         System.out.println("Programmer's day - 13.09."+year+".");
      } else {System.out.println("Programmer's day - 12.09."+year+".");
      }
   }

   public static boolean isLeapYear(int year) {
	    if (year%400==0) {return true;}
	    if (year%100==0) {return false;}
	    if (year%4==0) {return false;}
	    return true;
   }
}