package java_package;

abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Tiger extends Animal {
    @Override
    public void eat(){
        System.out.println("호랭쓰가 먹이를 먹습니당");
    }
    @Override
    public void sleep(){
        System.out.println("호랭쓰가 잠을 콜콜 잡니다");
    }
    public void jump(){
        System.out.println("점핌 베이비");
    }
}

class Eagle extends Animal {
    @Override
    public void eat(){
        System.out.println("독수리가 냠");
    }
    @Override
    public void sleep(){
        System.out.println("독수리가 쿨쿨");
    }
    public void flying(){
        System.out.println("난 날아가고 싶어요");
    }
}

public class practice {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        tiger.jump();

    }
}

