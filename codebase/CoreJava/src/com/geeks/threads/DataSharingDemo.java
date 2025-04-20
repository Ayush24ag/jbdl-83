package com.geeks.threads;
public class DataSharingDemo {
public static void main(String[] args) throws InterruptedException {
	Task2 task=new Task2();
	Thread t1= new Thread(task);
	Thread t2= new Thread(task);
	Thread t3= new Thread(task);
	t1.start();t2.start();t3.start();
	t1.join();t2.join();t3.join();
	//waits until child threads complete the task
	System.out.println(task.getCount());
}
}
class Task2 implements Runnable{
	private int count=0;
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started running");
		for(int i=1;i<=10000;i++) {
			//shud apply a lock here
			synchronized(this) {
				count++;
			}
		}
	}
	public int getCount() {
		return count;
	}
}
