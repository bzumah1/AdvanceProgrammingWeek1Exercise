package college;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Ask age from user
		System.out.print("Enter your Marks");
		//initilize the scanner object
		Scanner marks = new Scanner(System.in);
		//pass the user input value into myage value
		String myage = marks.nextLine();
		// yesle int lai string ma convert garxa
		int ag = Integer.parseInt(myage);
		
		
		if(ag>50 || ag>100) {
			System.out.print("Pass");
		}
		else if(ag>=90) {
			System.out.print("1st");
		}
		else {
			
			System.out.print("Fail");
		}
		
		//print the user input value. Also, Concats the values
		//System.out.println("Your age is "+ag);
	}
}
