package com.excelonline.core.threads;
/**
 * 
    NEW
    A thread that has not yet started is in NEW state.
    RUNNABLE
    A thread executing in the Java virtual machine is in RUNNABLE state.
    BLOCKED
    A thread that is blocked waiting for a monitor lock is in BLOCKED state.
    WAITING
    A thread that is waiting indefinitely for another thread to perform a particular action is in WAITING state.
    TIMED_WAITING
    A thread that is waiting for another thread to perform an action for up to a specified waiting time is in TIMED_WAITING state.
    TERMINATED
    A thread that has exited is in TERMINATED state.

 */
public class Thread_1 extends Thread {
	public static void main(String[] args) {
		RunnableThread rt = new RunnableThread();
		
		Thread t1 = new Thread(rt,"JayramThread");
		Thread t2 = new Thread(rt,"PavanThread");
		
//		System.out.println("Thread_1.main()" + t1.isAlive() +" " + t1.getState());
		t1.start();
		t2.start();
		System.out.println("Thread_1.main()" + t1.isAlive() +" " + t1.getState());
		while(true){
			System.out.println("INSIDE " + t1.isAlive() +" " + t1.getState());	
			if(t1.getState().toString() == "TERMINATED") break;
		}
//		t2.start();
		System.out.println("Thread_1.main()" + t1.isAlive() +" " + t1.getState());
	}
}