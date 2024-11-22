package Nov2024.Nov5_OOPS;

public class objects_class {
    public static void main(String[] args) {
        dog d = new dog();
        d.name ="Rockey";
        d.color ="Brown";
        d.age = 2;
        d.breed = "local";
        System.out.println("Dog " + d.name + " has a color " + d.color  + ", His age is " + d.age + " and breed is " + d.breed );
         d.walk();
         d.run();
    }
}
