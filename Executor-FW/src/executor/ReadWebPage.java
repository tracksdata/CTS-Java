package executor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ReadWebPage {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newCachedThreadPool();

		Callable<List<String>> callable1;

		callable1 = new Callable<List<String>>() {

			@Override
			public List<String> call() throws Exception {
				ArrayList<String> lines = new ArrayList<>();
				FileReader fr = new FileReader("menu1.txt");
				BufferedReader br = new BufferedReader(fr);
				String line;
				while ((line = br.readLine()) != null) {
					lines.add(line);
				}
				br.close();
				return lines;
			}

		};

		Callable<List<String>> callable2;

		callable2 = new Callable<List<String>>() {

			@Override
			public List<String> call() throws Exception {
				ArrayList<String> lines = new ArrayList<>();
				FileReader fr = new FileReader("menu2.txt");
				BufferedReader br = new BufferedReader(fr);
				String line;
				while ((line = br.readLine()) != null) {
					lines.add(line);
				}
				br.close();
				return lines;
			}

		};

		Callable<List<String>> callable3;

		callable3 = new Callable<List<String>>() {

			@Override
			public List<String> call() throws Exception {
				ArrayList<String> lines = new ArrayList<>();
				FileReader fr = new FileReader("menu3.txt");
				BufferedReader br = new BufferedReader(fr);
				String line;
				while ((line = br.readLine()) != null) {
					lines.add(line);
				}
				br.close();
				return lines;
			}

		};

		List<Callable<List<String>>> list = new ArrayList<>();
		list.add(callable1);
		list.add(callable2);
		list.add(callable3);

		try {
			List<Future<List<String>>> futureList = executor.invokeAll(list);

			List<String> lines;

			// lines = future.get();
			// for (String line : lines)
			// System.out.println(line);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		executor.shutdown();

	}

}
