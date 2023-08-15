package Bank;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		savingAccount ram = new savingAccount(121511,6000.00);
		savingAccount shyam = new savingAccount(38989,1500.00);
		
		ram.servicefee(10);
		shyam.servicefee(10);
		
		ram.deposite(500);
		shyam.withdraw(99);
		System.out.println("Ram ko Account : ");
		System.out.println("Accountno : " + ram.displayAccount());
		System.out.println("Balance : " + ram.displayBalance());
		
		System.out.println("");
		System.out.println("Shyham ko Account : ");
		System.out.println("Accountno : " + shyam.displayAccount());
		System.out.println("Balance : " + shyam.displayBalance());
	}

}
