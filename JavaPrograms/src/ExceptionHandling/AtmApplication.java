package ExceptionHandling;

import java.util.Scanner;

public class AtmApplication {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.accept();
	}
}

class InValidInputException extends Exception {
	public String getMessage() {
		return "Invalid Input please try again";
	}
}

class ATM extends Exception {
	Scanner scan = new Scanner(System.in);
	int accNo = 1111;
	int pwd = 2222;
	int ua;
	int up;

	public void acceptInput() {
		System.out.println("Enter accNo & pwd");
		ua = scan.nextInt();
		up = scan.nextInt();
	}

	public void verify() throws InValidInputException {
		if (accNo == ua && pwd == up) {
			System.out.println("Collect Your Money ");
		} else {
			InValidInputException iie = new InValidInputException();
			System.out.println(iie.getMessage());
			throw iie;
		}
	}

}

class Bank {
	public void accept() {
		ATM atm = new ATM();
		try {

			atm.acceptInput();
			atm.verify();
		} catch (InValidInputException e1) {
			try {
				atm.acceptInput();
				atm.verify();
			} catch (InValidInputException e2) {
				try {
					atm.acceptInput();
					atm.verify();
				} catch (Exception e) {
					System.out.println("Idot card blocked get lost ....");
				}
			}
		}
	}
}
