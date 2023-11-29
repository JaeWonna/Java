package java_package;

class GenericTest<A,B,C>{
    private A first;
    private B second;
    private C third;

    public void setFirst(A first){
        this.first = first;
    }
    public void setSecond(B second){
        this.second = second;
    }
    public void setThird(C third){
        this.third = third;
    }

    public void show(){
        System.out.println("A의 타입은 : " + first.getClass().getTypeName());
        System.out.println("B의 타입은 : " + second.getClass().getTypeName());
        System.out.println("C의 타입은 : " + third.getClass().getTypeName());
    }
}

public class practice {
    public static void main(String[] args){
        GenericTest<String, Integer, Double> genericTest = new GenericTest<>();
        genericTest.setFirst("안녕하세요");
        genericTest.setSecond(10);
        genericTest.setThird(10.0);

        genericTest.show();
    }
}
