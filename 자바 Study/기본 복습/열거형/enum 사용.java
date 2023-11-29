package java_package;

class Owner {
    public String brand;
    public int price;
    public CarType type;
}

enum CarType {
    SEDAN, SUV, SPORT
}

public class practice {
    public static void main(String[] args){
        Owner owner = new Owner();
        owner.brand = "현대";
        owner.price = 55000000;
        owner.type = CarType.SEDAN;

        System.out.println("owner.brand = " + owner.brand);
        System.out.println("owner.price = " + owner.price);
        System.out.println("owner.type = " + owner.type);
    }
}







