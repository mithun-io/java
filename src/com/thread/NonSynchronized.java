package com.thread;

class NonSynchronized extends Thread {
	private String task;

	public NonSynchronized(String task) {
		this.task = task;
	}

	public void run() {
		try {
			System.out.println(task);
			System.out.println("thread id       : " + Thread.currentThread().getId());
			System.out.println("thread name     : " + Thread.currentThread().getName());
			System.out.println("thread priority : " + Thread.currentThread().getPriority());
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Thread one = new NonSynchronized("chicken");
		Thread two = new NonSynchronized("fish");
		Thread three = new NonSynchronized("mutton");

		one.start();
		two.start();
		three.start();
	}
}

/* 
---------- by extending thread class ----------

class NonSynchronized extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Main {
	public static void main(String[] args) {
		NonSynchronized nonsynchronized = new NonSynchronized();
		Thread thread = new Thread(nonsynchronized);
		thread.start();
	}
}


---------- by implementing runnable interface ----------

class NonSynchronized implements Runnable {
public void run() {
    for (int i = 1; i <= 10; i++) {
        System.out.println(i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}

class Main {
public static void main(String[] args) {
    Thread t = new Thread(new NonSynchronized());
    t.start();
}
}
*/

