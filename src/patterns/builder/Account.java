package patterns.builder;

public class Account {

	public static class AccountBuilder {
		private long accountNumber;
		private String owner;
		private String branch;
		private double balance;
		private double interestRate;

		public Account buildAccount() {
			return new Account(accountNumber, owner, branch, balance, interestRate);
		}

		public AccountBuilder accountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}

		public AccountBuilder owner(String owner) {
			this.owner = owner;
			return this;
		}

		public AccountBuilder branch(String branch) {
			this.branch = branch;
			return this;
		}

		public AccountBuilder balance(double balance) {
			this.balance = balance;
			return this;
		}

		public AccountBuilder interestRate(double interestRate) {
			this.interestRate = interestRate;
			return this;
		}

	}

	private long accountNumber;
	private String owner;
	private String branch;
	private double balance;
	private double interestRate;

	private Account(long accountNumber, String owner, String branch, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.branch = branch;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	@Override // Print
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", owner=" + owner + ", branch=" + branch + ", balance="
				+ balance + ", interestRate=" + interestRate + "]";
	}

}
