package vna05_J_NCE;

public class TestThread implements Runnable {

	public void run() {
		int j = 1;
		LongContainer test = new LongContainer();
		test.assignValue(j);
	}
	
}

