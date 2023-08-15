package college;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter temperature in centigrade: ");
	        double centigrade = sc.nextDouble();
	        double fahrenheit = (centigrade * 9/5) + 32;
	        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
	}

}
