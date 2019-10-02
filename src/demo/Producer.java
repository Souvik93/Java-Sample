package demo;

public class Producer implements Runnable {
	
	ProduceAndConsume pac;
	Producer(ProduceAndConsume pac) {
		this.pac = pac;
	}

	
	@Override 
	public void run() {
		try {
			pac.produce();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
