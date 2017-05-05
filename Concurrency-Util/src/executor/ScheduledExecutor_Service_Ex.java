package executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor_Service_Ex {

	public static void main(String[] args) {

		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);

		System.out.println("secheduled....");

		Runnable task = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + "-executing..");
			 try {
			 Thread.sleep(1000);
			 } catch (InterruptedException e) {
			 e.printStackTrace();
			 }
			System.out.println(name + "-finished..");
		};
		// executorService.schedule(task, 15, TimeUnit.SECONDS);

		//executorService.scheduleAtFixedRate(task, 0, 4, TimeUnit.SECONDS);
		// executorService.scheduleWithFixedDelay(task, 0, 4, TimeUnit.SECONDS);

		// executorService.shutdown();

	}
}
