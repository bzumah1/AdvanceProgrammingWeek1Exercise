package src;
public class Main {

	public static void main(String[] args) {
		BankAccount ac1 = new BankAccount(121515, 6000.00);
		BankAccount ac2 = new BankAccount(38989, 1500.00);
		
		ac1.deductFee(10.00);
		ac2.deductFee(10.00);
		
		ac1.deposite(500);
		ac2.withdraw(99);
		System.out.println("");
		System.out.println("Account number : " + ac1.getAccountNumber());
		System.out.println("Balance RM : " + ac1.getBalance());
		
		System.out.println("");
		System.out.println("Account number : " + ac2.getAccountNumber());
		System.out.println("Balance RM : " + ac2.getBalance());
		
		
	}

}
