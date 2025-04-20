package com.geeks.threads;
public class MultipleThreadsEx {
public static void main(String[] args) {
	Thread curThread=Thread.currentThread();
	//curThread.setPriority(10);
	System.out.println("Current running thread is "+curThread.getName());
	Task1 task=new Task1();
	//NEW
	Thread t=new Thread(task); //work for this thread is to execute run() of Task1 class
	t.setName("Child");
	//t.setPriority(1);
	t.start();//RUNNABLE 
	//CAN't Predict
	for(int i=1;i<=5000;i++) {
		System.out.println("Main "+i);
	}
	System.out.println("End of main .....");
}
}
class Task1 implements Runnable{
	public void run() {
		//this method executes automatically once the thread started running
		System.out.println("Another thread started .....");
		for(int i=1;i<=5000;i++) {
			System.out.println("Child "+i);
		}
	}
}