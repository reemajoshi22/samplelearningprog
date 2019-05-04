package threads;

public class AccountDanger implements Runnable {
	Account account = new Account();

	public static void main(String[] args) {
		AccountDanger accountDanger = new AccountDanger();
		Thread thread = new Thread(accountDanger);
		thread.setName("REEMA");
		thread.start();

		Thread thread1 = new Thread(accountDanger);
		thread1.setName("KARTIK");
		thread1.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			makeWithdrawal(10);
			if (account.getBalance()<0) {
				System.out.println("NO SUFFICIENT BALANCE");
			}
		}
	}

	private synchronized void  makeWithdrawal(int amount) {
		if (account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName()
					+ " is going to make withdrawl ");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+ " completes the withdrwal "+" completed ");
			account.withdraw( amount);
		} else {
			System.out.println("NOT enough balance for " + " "
					+ Thread.currentThread().getName());
		}
	}

}
