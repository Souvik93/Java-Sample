package demo;

public class Consumer implements Runnable {
	
	ProduceAndConsume pac;
	Consumer(ProduceAndConsume pac) {
		this.pac = pac;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			pac.consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
