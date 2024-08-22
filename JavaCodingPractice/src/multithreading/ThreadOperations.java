package multithreading;

class UserThread extends Thread {
	public void run() {
		// task for the thread
		System.out.println("This is a user defined thread.");
	}
}

public class ThreadOperations {
	public static void main(String[] args) {
		System.out.println("program started..");
		int x = 56 + 34;
		System.out.println("sum is " + x);
		
		// Thread...
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("current running thread is " + tname);  //main
		
		// setName
		t.setName("MyMain");
		System.out.println(t.getName());		//MyMain
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {};
		
		System.out.println(t.getId());
		System.out.println("program ended..");
		
		// going to start user defined thread.
		UserThread thread = new UserThread();
		thread.start();

	}
}
