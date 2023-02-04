package assignment;
import java.util.Scanner;
public class convertmintoyear {

	public static void main(String[] args) {
		double min=60*24*365;
		int numberOne;
		 Scanner scan = new Scanner(System.in);
	     System.out.print("Enter minute: ");
	      numberOne = scan.nextInt();
	      long years = (long) (numberOne / min);
	        int days = (int) (numberOne / 60 / 24) % 365;

	        System.out.println((int) numberOne + " minutes is approximately " + years + " years and " + days + " days");
		
		
	}

}
