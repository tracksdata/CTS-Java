package synchronizors;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// readwrite lock

public class Ex2 {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		ReadWriteLock lock = new ReentrantReadWriteLock();

		Map<String, String> map = new HashMap<>();

		Runnable writeTask1 = () -> {
			lock.writeLock().lock();
			try {
				System.out.println(Thread.currentThread().getName()+"write-start");
				sleep(1);
				map.put("menu1", "biryani");
				System.out.println("write task finished...");
			} finally {
				lock.writeLock().unlock();
				System.out.println(Thread.currentThread().getName()+"write-end");
			}
		};
		Runnable writeTask2 = () -> {
			lock.writeLock().lock();
			try {
				sleep(1);
				map.put("menu2", "meals");
				System.out.println("write task finished...");
			} finally {
				lock.writeLock().unlock();
			}
		};
		
		Runnable writeTask3 = () -> {
			lock.writeLock().lock();
			try {
				sleep(1);
				map.put("menu3", "meals");
				System.out.println("write task finished...");
			} finally {
				lock.writeLock().unlock();
			}
		};

		Runnable readTask = () -> {
			lock.readLock().lock();
			try {
				sleep(5);
				System.out.println(map.get("menu1"));
				System.out.println(map.get("menu2"));
			} finally {
				lock.readLock().unlock();
			}
		};

		 executorService.submit(writeTask1);
		 executorService.submit(writeTask2);

		executorService.submit(readTask);
		executorService.submit(readTask);
		
		 executorService.submit(writeTask3);

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
