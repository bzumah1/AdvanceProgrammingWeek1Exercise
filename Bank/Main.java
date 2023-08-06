package Bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankDetails acc1 = new BankDetails(121515,6000.00);
		BankDetails acc2 = new BankDetails(38989,1500.00);
		
		acc1.serivcefee(10.00);
		acc2.serivcefee(10.00);
		acc1.Deposite(500);
		acc2.withdraw(99);
		
		System.out.println("The information of Account1");
		System.out.println("Account no : " + acc1.getBankno());
		System.out.println("Balance : " + acc1.getBalance());
		
		System.out.println("");
		System.out.println("The information of Account2");
		System.out.println("Account no : " + acc2.getBankno());
		System.out.println("Balance : " +acc2.getBalance());
		
	}

}
