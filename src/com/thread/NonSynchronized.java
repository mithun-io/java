package com.thread;

class Counter {
    int count = 0;

    void increment() {
        count++;
    }
}

class MyThread extends Thread {
    Counter c;

    MyThread(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class NonSynchronized {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
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

