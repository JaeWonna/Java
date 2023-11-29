package java_package;

interface Runnable {
    public abstract void run();
}

public class practice {
    public static void main(String[] args){
        Runnable runnable = () -> System.out.println("run anything!");
        runnable.run();
    }
}







