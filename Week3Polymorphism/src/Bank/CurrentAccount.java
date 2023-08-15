package Bank;

public class CurrentAccount extends BankClass {

	double overdraft;
	double CalcAmt;
	public CurrentAccount(int acc, double initialbal, double overdraft) {
		super(acc,initialbal);
	}
	public void depositeAmt() {
		CalcAmt = 500;
		AddNewAmt(CalcAmt);
	}
}
