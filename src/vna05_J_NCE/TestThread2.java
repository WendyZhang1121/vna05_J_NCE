package vna05_J_NCE;


public class TestThread2 implements Runnable {

	public void run() {	
		LongContainer test  = new LongContainer();
		test.printLong();
	}
	public static void main(String[] args) throws Exception { 
		
		for (int i = 0; i < 5; i ++){
			TestThread T1 = new TestThread();
			Thread t1 = new Thread(T1);
			TestThread T2 = new TestThread();
			Thread t2 = new Thread(T2);
			t2.start();
		}	
	}
}
