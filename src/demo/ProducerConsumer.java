package demo;

public class ProducerConsumer {
	
	public void startProducerConsumer(int arraySize) {
		ProduceAndConsume pac = new ProduceAndConsume(8);
		Thread producer = new Thread(new Producer(pac));
		Thread consumer = new Thread(new Consumer(pac));
		Thread producer2 = new Thread(new Producer(pac));
		Thread consumer2 = new Thread(new Consumer(pac));
		producer.setName("Producer 1");
		producer2.setName("Producer 2");
		consumer.setName("Consumer 1");
		consumer2.setName("Consumer 2");
		producer.start();
		consumer.start();
		consumer2.start();
		producer2.start();	
	}

}
