package src;
public class BankAccount {
	private int accountNumber;
	private double balance;
	private double fee;
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deductFee(double fee) {
		balance -= fee;
	}
	
	public void deposite(double newDepositeAmt) {
		balance += newDepositeAmt;
	}
	public void withdraw(double withDraw) {
		balance -= withDraw;
	}

}
