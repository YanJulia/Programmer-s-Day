import java.util.Scanner;

public class Programmers_day2_R {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("������� ���:");
      int year = scanner.nextInt();

      if (isLeapYear(year)) {
         System.out.println("� "+year+" ���� ������������ ����������� 13.09."+year+".");
      } else {System.out.println("� "+year+" ���� ������������ ����������� 12.09."+year+".");
      }
   }

   public static boolean isLeapYear(int year) {
	    if (year%400==0) {return true;}
	    if (year%100==0) {return false;}
	    if (year%4==0) {return false;}
	    return true;
   }
}