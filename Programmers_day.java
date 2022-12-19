import java.util.Scanner;

public class Programmers_day {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("В "+year+"году День программиста празднуют "+12.09."+year+"." );
        } else {System.out.println("В "+year+"году День программиста празднуют "+13.09."+year+"." );
        }
    }

    public static boolean isLeapYear(int year) {
	   isLeapYear=year%400==0
	   if (isLeapYear) {
	       return;
       	    } else {isLeapYear=(year%100<>0);
	               if (isLeapYear) {isLleapYear=(year%4==0); 
			      return leapYear;
	              } else {return isLeapYear;}
	        }
    }
}