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
        System.out.println();

        for(CarType type : CarType.values()){
            System.out.println(type);
            System.out.println(type.ordinal());
        }
        System.out.println();

        CarType type1 = CarType.SEDAN;
        CarType type2 = CarType.valueOf("SUV");

        System.out.println("type1 = " + type1);
        System.out.println(type1.name());
        System.out.println("type2 = " + type2);
        System.out.println(type2.name());
        System.out.println();
    }
}







