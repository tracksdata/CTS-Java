package com.multi;

class HelloServlet {

	Object key = new Object();

	public String doService(String url) {

		if (url.equals("/greet")) {
			synchronized (key) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return "GREETINGS";
			}
		}
		return "HELLOOOOOO";
	}
}

class Container {

	HelloServlet helloServlet = new HelloServlet();

	public void doProcess(String url) {

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				String resp = helloServlet.doService(url);
				System.out.println(resp);
			}
		});
		thread.start();

	}
}

public class Thread_Sync_Block {

	public static void main(String[] args) {

		Container container = new Container();
		container.doProcess("/greet");
		container.doProcess("/greet");
		container.doProcess("/hello");

	}

}
