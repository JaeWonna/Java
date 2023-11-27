package java_package;

import java.util.Random;

class MyRunnable implements Runnable{

    private static final Random random = new Random();

    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println("- " + threadName + " has been started");
        int delay = 1000 + random.nextInt(4000);

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("- " + threadName + " has been ended (" + delay + "ms)");
    }
}

class MyThread extends Thread{

    private static final Random random = new Random();

    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println("- " + threadName + " has been started");
        int delay = 1000 + random.nextInt(4000);

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("- " + threadName + " has been ended (" + delay + "ms)");
    }
}


public class practice {
    public static void main(String[] args){

        Thread thread1 = new MyThread();
        thread1.setName("Thread #1");
        Thread thread2 = new MyThread();
        thread2.setName("Thread #2");

        Runnable runnable1 = new MyRunnable();
        Runnable runnable2 = new MyRunnable();

        Thread thread3 = new MyThread();
        thread3.setName("Thread #3");
        Thread thread4 = new MyThread();
        thread4.setName("Thread #4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}







