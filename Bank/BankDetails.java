package Bank;
public class BankDetails {
	private int Acno;
	private double balance;
	public BankDetails(int Acno, double bal) {
		Acno = Acno;
		balance = bal;
	}
	public int getBankno() {
		return Acno;
	}
	public double getBalance() {
		return balance;
	}
	
	public void serivcefee(double sfee) {
		balance -=  sfee;
	}
	
	public void Deposite(double newAmt) {
		balance += newAmt;
	}
	public void withdraw(double withdraw) {
		balance -= 99;
	}
}
