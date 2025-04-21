package collectionTest;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread th=new Thread(new SampleThread());
		th.start();
		
		Thread th1=new Thread(new SampleThread());
		th1.start();
		
		
		
		

	}

}
