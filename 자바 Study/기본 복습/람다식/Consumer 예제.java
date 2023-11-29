package java_package;

import java.util.Objects;
import java.util.function.Supplier;

interface Consumer<T>{
    void accept(T t);

    default Consumer<T> andThen(Consumer<? super T> after){
        Objects.requireNonNull(after);
        return (T t) -> {accept(t); after.accept(t);};
    }
}

public class practice {
    public static void main(String[] args){
        Consumer<String> printString = text -> System.out.println("Help " + text + "!!");
        printString.accept("me");
    }
}
