package demo;

import collection.demo.CollectionDemoDriver;
public class DemoTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PanFinder pf = new PanFinder();
		// pf.panCardFinder();
		ConcurrentHashMapExample chm = new ConcurrentHashMapExample();
		// chm.exampleConcurrentHashMap();
		
		ThreadExample te = new ThreadExample();
		// te.threadImplementation();
		
		ProducerConsumer pc = new ProducerConsumer();
		// pc.startProducerConsumer(8);
		
		CollectionSortExample cse = new CollectionSortExample();
		// cse.comparatorExample();
		
		CollectionDemoDriver cdd = new CollectionDemoDriver();
		//cdd.executeCustomLinkedList();
		cdd.executeCustomTree();

	
}
}