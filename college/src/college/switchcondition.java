package college;

import java.util.Scanner;

public class switchcondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks");
		String marks = sc.next();
		switch(marks){
		case "50" :
			System.out.println("Pass");
			break;
		
		case "90" :
			System.out.println("1st");
			break;
		case "10" :
			System.out.println("Fail");
			break;
		}
			
	}

}
