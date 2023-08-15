package Bank;

public class savingAccount {
private int acno;
private double balance;
public savingAccount(int ac, double blc) 
{
		acno = ac;
		balance = blc;
}

public double displayBalance() {
	return balance;
}

public double displayAccount() {
	return acno;
}

public void servicefee(double fee) {
	balance -=   fee;
}

public void deposite(double newAmt) {
	balance += newAmt;
}

public void withdraw(double withdrawAmnt) {
	balance -= withdrawAmnt;
}

}
