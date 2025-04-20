package com.geeks.threads;

public class ProducerConsumerDemo {
public static void main(String[] args) {
	Video v= new Video();
	Audio a=new Audio();
	v.setAudio(a);
	a.setVideo(v);
	Thread t1=new Thread(v);
	Thread t2=new Thread(a);
	t1.start(); t2.start();
	
}
}

class Video implements Runnable{
	private Audio audio;
	
	public void setAudio(Audio audio) {
		this.audio = audio;
	}
	public void run() {
	playVideo();
	}
	 synchronized void playVideo() {
		for(int i=1;i<=100;i++) {
			System.out.println("playing video "+i);
			synchronized (audio) {
				audio.notify();
			}
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Audio implements Runnable{
	private Video video;
	public void setVideo(Video video) {
		this.video = video;
	}
	public void run() {
		playAudio();
	}
	synchronized void playAudio() {
		for(int i=1;i<=100;i++) {
			 try {
				wait();
				System.out.println("playing Audio ..... "+i);
				synchronized (video) {
					video.notify();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
	}
}