public class ShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle(12);

        Rectangle r = new Rectangle(2,4,"red",true);
        Square s = new Square();
        System.out.println(c.getArea() +" "+ r.getColor());
        System.out.println(r.toString());
        System.out.println(s.toString());
        System.out.println(c.toString());
    }
}
