public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(0, 0, 5);
        Circle c2 = new Circle(10, 10, 3);
        Circle c3 = new Circle(15, 15, 5);

        Group root = new Group();
        root.add(c1);
        root.add(c2);
        root.add(c3);
        root.draw();

        System.out.println();

        root.move(5, 5);
        System.out.println("After move:");
        root.draw();
    }
}