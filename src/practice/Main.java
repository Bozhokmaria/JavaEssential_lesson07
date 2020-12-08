package practice;

public class Main {
    public static void main(String[] args) {
        Vehicles b = Vehicles.BUS;
        Vehicles c = Vehicles.CAR;
        Vehicles a = Vehicles.BICYCLE;

        a.setColor("green");
        b.setColor("red");
        c.setColor("white");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
