package synchronizors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

// Lock

public class Ex1 {

	static int count = 0;

	private static ReentrantLock lock = new ReentrantLock(); // mutex

	// synchronized static void increment() {
	// count = count + 1;
	// }

	// static void increment() {
	// synchronized (Ex1.class) {
	// count = count + 1;
	// }
	// }

	static void increment() {

		lock.lock();
		try {
			count = count + 1;
			m();
		} finally {
			lock.unlock();
		}
	}
	
	static void m() {
		
		lock.lock();
		try {
			count = count + 1;
		} finally {
			lock.unlock();
		}
		
	}

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		 IntStream.range(0, 10000).forEach(i ->
		 executorService.submit(Ex1::increment));

		//		 for (int i = 0; i < 10000; i++) {
		//		 Runnable task = new Runnable() {
		//		 @Override
		//		 public void run() {
		//		 Ex1.increment();
		//		 }
		//		 };
		// executorService.submit(task);
		// }

		// -------------------------------------

		 stop(executorService);
//
		 System.out.println(Ex1.count);

		// -----------------------------------------

	//		ExecutorService executorService = Executors.newFixedThreadPool(2);
	//
	//		ReentrantLock lock = new ReentrantLock();
	//
	//		executorService.submit(() -> {
	//			System.out.println(Thread.currentThread().getName() + "--> owning lock");
	//			lock.lock();
	//			try {
	//				sleep(1);
	//
	//			} finally {
	//				lock.unlock();
	//				System.out.println(Thread.currentThread().getName() + "--> releasing lock");
	//			}
	//		});
	//
	//		executorService.submit(() -> {
	//			System.out.println(Thread.currentThread().getName());
	//			System.out.println("Locked-" + lock.isLocked());
	//			System.out.println("Held By me -" + lock.isHeldByCurrentThread());
	//			boolean locked = lock.tryLock();
	//			System.out.println("Lock acquired :" + locked);
	//
	//		});

		stop(executorService);

	}

	public static void stop(ExecutorService executor) {
		try {
			executor.shutdown();
			executor.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println("termination interrupted");
		} finally {
			if (!executor.isTerminated()) {
				System.err.println("killing non-finished tasks");
			}
			executor.shutdownNow();
		}
	}

	public static void sleep(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}

}
