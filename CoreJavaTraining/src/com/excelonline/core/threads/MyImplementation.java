package com.excelonline.core.threads;

public class MyImplementation implements Runnable {
	static Thread one;
	@Override
	public synchronized void run() {
		System.out.println("ThreadOne.run()" + Thread.currentThread().getName());
		for(int i=0 ;i < 5 ; i++ ) {
			try{
				System.out.println(" In Try  "+ one.getState());
//				Thread.sleep(1000);
			}catch(Exception exp){
			}
			System.out.println("hello "+ Thread.currentThread().getName() +" " +i);
		}
		System.out.println(" In Run After "+ Thread.currentThread().getState());
	}
	
	public static void main(String[] args) {
		
//		System.out.println("ThreadOne.main()" + Thread.currentThread().getName());
//		 ThreadOne one = new ThreadOne();
//		 one.start();
		
		MyImplementation myImpl = new MyImplementation();
//		myImpl.start();
		
		one = new Thread(myImpl,"Jay");
		System.out.println(" Before Start "+one.getState());
		
//		Thread two = new Thread(myImpl,"Srini");
//		one.run();
//		two.run();
		one.start();
		
		System.out.println("After Start is done "+ one.getState());
//		two.start();
	}
}