package java_package;

public class practice {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student std = new Student("홍길동", 35);
        System.out.println(std);

        Student std2 = (Student) std.clone();
        System.out.println(std2);
    }
}

class Student implements Cloneable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "name:" + name + " age:" + age;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
