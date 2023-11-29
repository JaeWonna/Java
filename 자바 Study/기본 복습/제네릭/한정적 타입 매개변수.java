package java_package;

class GenericTest<T extends Number>{
    public void set(T t) {}
}

public class practice {
    public static void main(String[] args){
        GenericTest<Integer> genericTest = new GenericTest<>();

        genericTest.set(10);
    }
}
