import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {

	public static void main(String[] args) {
		ReentrantLock lock1 = new ReentrantLock();
		ReentrantLock lock2 = new ReentrantLock();

		Thread t1 = new Thread( () -> {
			try {
				lock1.lock();
				Thread.sleep(1000);
				lock2.lock();
				System.out.println("t1 finished");
			} catch( InterruptedException e) {
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread( () -> {
			try {
				lock2.lock();
				Thread.sleep(1000);
				lock1.lock();
				System.out.println("t2 finished");
			} catch( InterruptedException e) {
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();
	}
}