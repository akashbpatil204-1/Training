import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

class Abc implements Runnable {
	ReentrantLock r1 = new ReentrantLock();

	public void run() {

		try {// r1.lock();
			if (r1.tryLock(5, TimeUnit.SECONDS)) {
				for (int i = 0; i < 20; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
					try {
						Thread.sleep(500);
					} catch (Exception e) {

					}

				}
				r1.unlock();
			} else {
				System.out.println(Thread.currentThread().getName() + "thread can not wait");
			}
		} catch (Exception e) {

		}
	}
}

public class ConcurrencyThread {

	public static void main(String args[]) throws Exception {
		Abc a1 = new Abc();
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);
		t1.setName("a");
		t2.setName("b");
		t1.start();
		t2.start();

		// t1.sleep(10000);
		t1.sleep(10000);

	}
}