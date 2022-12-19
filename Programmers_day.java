import java.util.Scanner;

public class Programmers_day {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("In "+year+" Programmer's day is 12.09."+year+"." );
        } else {System.out.println("In "+year+" Programmer's day is 13.09."+year+"."  );
        }
    }

    public static boolean isLeapYear(int year) {
	   boolean isLeapYear;
	   isLeapYear=year%400==0;
	   if (isLeapYear) {
	       return;
       	    } else {isLeapYear=(year%100<>0);
	               if (isLeapYear) {isLleapYear=(year%4==0); 
			      return leapYear;
	              } else {return isLeapYear;}
	        }
    }
}