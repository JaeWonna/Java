package java_package;

// 내가 오류 하나 만들고
class MyException extends Exception {
    public MyException(){
        super("내가 만든 오류");
    }
}

public class practice {

    static void callException() throws MyException {
        throw new MyException();
    }

    public static void main(String[] args){
        try{
            callException();
        } catch (MyException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("시스템 종료");
        }
    }
}
