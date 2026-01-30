package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Synchronized extends Thread {
	private String task;
	private static final Lock lock = new ReentrantLock(); 

	public Synchronized(String task) {
		this.task = task;
	}

	public void run() {
		lock.lock();

		try {
			System.out.println(task);
			System.out.println("thread id       : " + Thread.currentThread().getId());
			System.out.println("thread name     : " + Thread.currentThread().getName());
			System.out.println("thread priority : " + Thread.currentThread().getPriority());
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Thread one = new Synchronized("chicken");
		Thread two = new Synchronized("fish");
		Thread three = new Synchronized("mutton");

		one.start();
		two.start();
		three.start();
	}
}
