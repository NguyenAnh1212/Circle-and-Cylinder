public class Main {
    public static void main(String[] args) {
        Circle ci1 = new Circle(2.5,"red");
        Cylinder cy1 = new Cylinder(2.5, "red", 15);
        Cylinder cy2 = new Cylinder(15);
        System.out.println(cy1.toString());
        System.out.println(cy2.toString());
    }
}
