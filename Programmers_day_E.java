import java.util.Scanner;

public class Programmers_day_E {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a year:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Programmer's day - 12.09."+year+"." );
        } else {System.out.println("Programmer's day - 13.09."+year+"."  );
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