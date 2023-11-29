package java_package;

interface Supplier<T>{
    T get();
}

public class practice {
    public static void main(String[] args){
        Supplier<String> getString = () -> "Good morning!";
        String str = getString.get();
        System.out.println(str);
    }
}







