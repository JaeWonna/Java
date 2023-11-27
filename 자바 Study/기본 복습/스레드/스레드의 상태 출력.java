package java_package;

import java.util.Random;

class StatePrintThread extends Thread {

    private Thread targetThread;

    public StatePrintThread(Thread targetThread){
        this.targetThread = targetThread;
    }

    @Override
    public void run(){
        while(true){
            Thread.State state = targetThread.getState();
            System.out.println("Thread state = " + state);

            // new state -> runnable
            if(state == State.NEW){
                targetThread.start();
            }

            // terminated -> end while
            if(state == State.TERMINATED){
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class TargetThread extends Thread {

    @Override
    public void run(){
        for(long i=0; i<1000000000; i++){}

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class practice {
    public static void main(String[] args){
        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());

        statePrintThread.start();
    }
}







