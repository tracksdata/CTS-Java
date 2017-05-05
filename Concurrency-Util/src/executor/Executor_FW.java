package executor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.management.RuntimeErrorException;

/*
 *  Threads  and Executors
 *  -----------------------
 * 
 * 
 */

public class Executor_FW {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

		// Runnable task = new Runnable() {
		// @Override
		// public void run() {
		// System.out.println("Hello - " + Thread.currentThread().getName());
		// try {
		// TimeUnit.SECONDS.sleep(2);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// System.out.println("Bye - " + Thread.currentThread().getName());
		// }
		// };

		// task.run();

		// before concurrency API

		// Thread thread=new Thread(task,"A");
		// thread.start();
		//
		//
		// System.out.println("Done!");

		// -----------------------------------------

		// with Concurrency API ( java.util.concurrent.* )

		// ExecutorService executorService =
		// Executors.newSingleThreadExecutor();

		// executorService.submit(task);
		// executorService.submit(task);

		// executorService.shutdown();
		// executorService.awaitTermination(1, TimeUnit.SECONDS);
		// executorService.shutdownNow();

		// try {
		// System.out.println("attempt to shutdown executor");
		// executorService.shutdown();
		// executorService.awaitTermination(5, TimeUnit.SECONDS);
		// } catch (InterruptedException e) {
		// System.out.println("Task are interrupted");
		// } finally {
		// if (!executorService.isTerminated()) {
		// System.out.println("cancen non-finished tasks");
		// }
		// executorService.shutdownNow();
		// System.out.println("shuddown finished..");
		// }

		// ---------------------------------------------------------

		// Callable And Future

		// Callable<Integer> task=new Callable<Integer>() {
		// @Override
		// public Integer call() throws Exception {
		// TimeUnit.SECONDS.sleep(5);
		// System.out.println("callble task finished....");
		// return 123;
		// }
		// };
		//
		// ExecutorService executorService=Executors.newFixedThreadPool(1);
		// Future<Integer> future=executorService.submit(task);
		//
		//
		// System.out.println("future done? "+future.isDone());
		//
		// try {
		// //Integer integer=future.get();
		// //System.out.println("future done? "+future.isDone());
		//
		// Integer integer=future.get(2, TimeUnit.SECONDS);
		//
		// System.out.println("result : "+integer);
		// } catch (ExecutionException | TimeoutException e) {
		// future.cancel(true);
		// //e.printStackTrace();
		// System.out.println("Timeout...");
		// }
		//
		//
		// executorService.shutdown();

		// ---------------------------------------------------------

		// System.out.println(Runtime.getRuntime().availableProcessors());

		// ExecutorService executorService=Executors.newWorkStealingPool();
		//
		// List<Callable<String>> callables=Arrays.asList(
		// ()->{TimeUnit.SECONDS.sleep(3); return "Task-1";},
		// ()->{TimeUnit.SECONDS.sleep(1); return "Task-2";},
		// ()->{TimeUnit.SECONDS.sleep(0); return "Task-3";}
		// );
		//
		// String firstResult=executorService.invokeAny(callables);
		// System.out.println(firstResult);

		// executorService.invokeAll(callables)
		// .stream()
		// .map(future->{try {
		// return future.get();
		// } catch (Exception e) {
		// throw new IllegalStateException();
		// }})
		// .forEach(System.out::println);

		// List<Future<String>> futures=executorService.invokeAll(callables);
		// List<String> results=new ArrayList<>();
		// for(Future<String> future:futures){
		// try {
		// String string=future.get();
		// results.add(string);
		// } catch (ExecutionException e) {
		// e.printStackTrace();
		// }
		//
		// }
		// for(String result:results){
		// System.out.println(result);
		// }

		// Runnable runnable=(()->{try {
		// if(1==1){
		// throw new RuntimeException("oops");
		// }
		// Thread.sleep(2000);
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// //e.printStackTrace();
		// }System.out.println("do something...");});
		//
		// ExecutorService pool=Executors.newFixedThreadPool(10);
		// Future<?> future=pool.submit(runnable);
		//
		//
		// System.out.println(future.isDone());
		//
		// Object object=future.get(3, TimeUnit.SECONDS);
		// System.out.println(object);
		//
		//
		//
		// executorService.shutdown();

		// ---------------------------------

		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<?> future = service.submit(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("task finished..");
			}
		});

		if (future.get() == null) {
			System.out.println("Task has finished...");
		}

		System.out.println("main with other work...");

	}

}
