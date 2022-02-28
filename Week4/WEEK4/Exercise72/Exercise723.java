package WEEK4;

// Exercise 72.3: Money transfers
public class Exercise723 {
	public static void main(String[] args) {
		Account A = new Account("A", 100.0);
        Account B = new Account("B", 0.0);
        Account C = new Account("C", 0.0);
        transfer(A, B, 50.0);
        transfer(B, C, 25.0);
	}

	public static void transfer(Account form, Account to, double amount) {
		form.withdrawal(amount);
		to.deposit(amount);
	}
}
