package com.excelonline.core.threads;

public class DeadLockDemo4 extends Thread {
	public static String blackBrush = "blackBrush";
	public static String blueBrush = "blueBrush";

	public static void main(String[] a) {
		Thread myThread = new MyThread();
		Thread yourThread = new YourThread();

		myThread.start();
		yourThread.start();
	}
	
	private static class MyThread extends Thread {
		public void run() {
			synchronized (blackBrush) {
				System.out.println("MyThread Holds lock on object "+ blackBrush);
				try {
					Thread.sleep(10);
				}catch (InterruptedException e) {}

				System.out.println("MyThread waiting for lock on object " + blueBrush);
				synchronized (blueBrush) {
					System.out.println("MyThread Holds lock on Both Brushes");
				}
				System.out.println("END OF MYTHREAD");
			}
		}
	}
	
	private static class YourThread extends Thread {
		public void run() {
			/*try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {}*/
			synchronized (blackBrush) {
				System.out.println("YourThread Holds lock on object " + blackBrush);
				
				try {
					Thread.sleep(10);
				}catch (InterruptedException e) {}
				System.out.println("YourThread waiting for lock on object " + blackBrush);
				
				synchronized (blueBrush) {
					System.out.println("YourThread Holds lock on both Objects " + blueBrush);
				}
				System.out.println("END OF YOURTHREAD");
			}
		}
	}
}
