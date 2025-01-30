//public class ThreadClass extends Thread{
//	
//	@Override
//	public void run() {
//		System.out.println("thread class object");
//	}
//	
//	public static void main(String[] args) {
//		ThreadClass thread = new ThreadClass();
//			thread.start();
//	}
//
//}

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable thread class object");
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread());
		thread.start();
	}

	
}

//public class MyThread{
//	
//	public static void main(String[] args) {
//		Thread thread = new Thread(()->{
//				System.out.println("lambda thread");
//		});
//		thread.start();
//	}
//	
//}
	