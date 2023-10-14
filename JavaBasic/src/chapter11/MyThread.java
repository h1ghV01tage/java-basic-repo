package chapter11;

public class MyThread implements Runnable {

	String thrdName;
	
	MyThread (String name){
		thrdName = name;
	}
	
	//entry point of thread
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(thrdName + "Starting");
		try {
			for(int count=0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In" + thrdName + "count is" + count);
			}
		}
		
		catch(InterruptedException exc) {
			System.out.println(thrdName + "interrupted");
		}
		
		System.out.println(thrdName + "terminating");
		
		
	}

}

