package demo;

import java.util.LinkedList;
import java.util.List;

public class ProduceAndConsume {
	int size=0;
	LinkedList<Integer> ls = new LinkedList<>(); 
	
	ProduceAndConsume(int size) {
		this.size= size;
	}

	public void produce() throws InterruptedException {
		Integer value =0;
		while(true) {
			synchronized(this) {
			while(ls.size()== size) {
				
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println("Item Produced In The List:" + value+" "+Thread.currentThread().getName());
			ls.add(value++);
			notify();
			Thread.sleep(1000);
			}
		}
	}
	
	public void consume() throws InterruptedException {
		while(true) {
			synchronized(this) {
				while(ls.size()==0) {
					wait();
				}
				
				Integer value = ls.removeFirst();
				System.out.println("Cosnumed From The List:"+value+" "+Thread.currentThread().getName());
				
				notify();
				
				Thread.sleep(1000);
			}
			
		}
	}
	
	
}
