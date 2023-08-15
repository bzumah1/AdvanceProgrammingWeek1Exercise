package bank;

public class CurrentAccount extends SuperBankClass {
	double overdraftvalue;
	public CurrentAccount(String acno, double acbal, double overdraft ) {
		super(acno,acbal);
		this.overdraftvalue = overdraft;
	}
}
