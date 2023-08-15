package college;

import java.util.Scanner;

public class KGConverter {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter weight in grams: ");
	        double grams = sc.nextDouble();
	        double kilograms = grams / 1000;
	        System.out.printf("Weight in kilograms: %.3f kg%n", kilograms);
	}

}
