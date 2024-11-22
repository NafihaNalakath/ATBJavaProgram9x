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

        dog d1 = new dog();
        d1.name ="pappu";
        d1.color ="white";
        d1.age = 1;
        d1.breed = "Bulldog";
        System.out.println("Dog " + d1.name + " has a color " + d1.color  + ", His age is " + d1.age + " and breed is " + d1.breed );
        d1.walk();
        d1.run();

        dog d2 = new dog();
        d2.name ="Rosy";
        d2.color ="Black";
        d2.age = 3;
        d2.breed = "Rotweiler";
        System.out.println("Dog " + d2.name + " has a color " + d2.color  + ", His age is " + d2.age + " and breed is " + d2.breed );
        d2.walk();
        d2.run();

        dog d3 = new dog();
        d3.name ="Rosy";
        System.out.println("Dog name is " + d3.name  );
        d3.walk();
        d3.run();

        dog d4 = new dog();
        d4.name ="Lalu";
        System.out.println("Dog name is " + d4.name  );
        d4.walk();
        d4.run();
    }
}
