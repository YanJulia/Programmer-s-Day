import java.util.Scanner;

public class Programmers_day_R {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("В "+year+" День Программиста празднуется 12.09."+year+"." );
        } else {System.out.println("В "+year+" День Программиста празднуется 13.09."+year+"."  );
        }
    }

    public static boolean isLeapYear(int year) {
	   boolean isLeapYear;
	   isLeapYear=year%400==0;
	   if (isLeapYear) {return isLeapYear;
	    } else {isLeapYear=(year%100==0);
	               if (isLeapYear) {
		   return isLeapYear;
		  } else {isLeapYear=(year%4==0); 
		           return isLeapYear;
	          	            }
	              }
    }
}