package Bank;

public class BankClass {
	int Accno;
	double  InitialBalance;
	

	public BankClass(int acc, double initialbal) {
		this.Accno = acc;
		this.InitialBalance = initialbal;
	}
	
	public void AddNewAmt(double amt) {
		InitialBalance +=  amt;
		System.out.println(InitialBalance);
	}
	
	public double getInitialBalance() {
		return InitialBalance;
	}
	public void displayDetails(){
	System.out.println(Accno);
	System.out.println(InitialBalance);

	}

}
