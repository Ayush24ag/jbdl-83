package com.geeks.threads;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ExecutorsDemo {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	SimpleTask task=new SimpleTask();
	CalculationTask  cTask= new CalculationTask();
	ExecutorService executor=  Executors.newFixedThreadPool(3); //create 3 threads
	//executor.execute(task);
	Future<Integer> r= executor.submit(cTask);
	System.out.println("waiting for the  results ....");
	System.out.println("Result :"+r.get());
	executor.shutdown();
}
}
class SimpleTask implements Runnable{
	//will not return any computation output to the 
	//parent
	public void run() {
		System.out.println("my task "+Thread.currentThread().getName());
	}
}
class CalculationTask implements Callable<Integer>{
	//returns computation result to the parent
	public Integer call() throws Exception {
		int c=0;
		for(int i=1;i<=10;i++) {
			Thread.sleep(1000);
			c=c+1;
		}
		return c;
	}
}