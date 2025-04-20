package com.geeks.threads;
public class WaitNotifySimpleEx {
public static void main(String[] args) throws InterruptedException {
	Task3 task=new Task3();
	Thread t1=new Thread(task);
	t1.start();
	Thread.sleep(2000);
	synchronized(task) {
		task.notify();
	}
	System.out.println("Main Ends ....");
}
}
class Task3 implements Runnable{
	public void run() {
		f1();
	}
	synchronized void f1() {
		try {
			System.out.println("I m Waiting .....");
			wait();
			System.out.println("I m Back .....");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}