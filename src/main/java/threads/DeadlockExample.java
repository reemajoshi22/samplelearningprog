package threads;

public class DeadlockExample extends Thread {
	FirstDeadlock firstDeadlock = new FirstDeadlock();
	SecondDeadlock secondDeadlock = new SecondDeadlock();

	public void m1() {
		this.start();
		firstDeadlock.d1(secondDeadlock); // main thread
	}

	@Override
	public void run() {
		secondDeadlock.d2(firstDeadlock); // child thread
	}

	public static void main(String[] args) {
		DeadlockExample deadlockExample = new DeadlockExample();
		deadlockExample.m1();

	}

}

class FirstDeadlock {
	public synchronized void d1(SecondDeadlock deadlock) {
		System.out
				.println("Thread FirstDeadlock starts execution of d1() method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}
		System.out
				.println("Thread FirstDeadlock trying to call SecondDeadlock's last() method");
		deadlock.last();
	}

	public synchronized void last() {
		System.out.println("Inside FirstDeadlock last method ");

	}

}

class SecondDeadlock {
	public synchronized void d2(FirstDeadlock deadlock) {
		System.out
				.println("Thread SecondDeadlock starts execution of d2() method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}
		System.out
				.println("Thread SecondDeadlock trying to call FirstDeadlock last() method");
		deadlock.last();
	}

	public synchronized void last() {
		System.out.println("Inside SecondDeadlock last method ");

	}

}
