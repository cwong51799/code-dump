/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
import java.util.Date;
public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	public Account() {
		dateCreated = new Date();
	}
	public Account(int newID, double newBal) {
		dateCreated = new Date();
		id = newID;
		balance = newBal;
	}
	public int getID() {
		return id;
		}
	public double getBal() {
		return balance;
		}
	public double getAIR() {
		return annualInterestRate;
		}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setID(int newID) {
		id = newID;
	}
	public void setBal(double newBal) {
		balance = newBal;
	}
	public void setAIR(double newAIR) {
		annualInterestRate = newAIR / 100;
	}
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}
	public double getMonthlyInterest() {
		return (balance * (annualInterestRate / 12));
	}
	public void withdraw(double x) {
		balance -= x;
	}
	public void deposit(double x) {
		balance += x;
	}
	public static void main(String[] args) {
		Account a = new Account(1122 , 20000);
		a.setAIR(4.5);
		a.withdraw(2500);
		a.deposit(3000);
		System.out.print("Balance: "+a.getBal()+ "\nMonthly interest: "+a.getMonthlyInterest() +"\nDate created: "+a.getDateCreated());
	}
}
