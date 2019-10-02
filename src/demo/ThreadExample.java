package demo;

public class ThreadExample implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Doing heavy processing - START "+Thread.currentThread().getName());
        try {
            // Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing heavy processing - END "+Thread.currentThread().getName());
	}
	
	private void doDBProcessing() throws InterruptedException {
        // Thread.sleep(5000);
        for(int i=0;i<=10; i++) {
        	System.out.println(Thread.currentThread().getName()+i);
        }
    }
	
	public void threadImplementation() {
		Thread t1 = new Thread(new ThreadExample(), "t1");
		Thread t2 = new Thread(new ThreadExample(), "t2");
		Thread t3 = new MyThread("t3");
        Thread t4 = new MyThread("t4");
		System.out.println("Starting Runnable threads");
        t1.start();
        t2.start();
        System.out.println("Runnable Threads has been started");
        
        System.out.println("Starting MyThreads");
        t3.start();
        t4.start();
        t1.setPriority(4);
        t2.setPriority(1);
        t3.setPriority(3);
        t4.setPriority(2);
        System.out.println("MyThreads has been started");
	}

}
