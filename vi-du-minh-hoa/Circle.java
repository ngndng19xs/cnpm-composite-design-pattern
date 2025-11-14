// Leaf

public class Circle implements Graphic {
    private int x, y, radius;
    public Circle(int x, int y, int r) { 
        this.x = x;
        this.y = y;
        this.radius = r;
    }

    public void draw() {
        System.out.println("Draw Circle at (" + x + "," + y + "), radius = " + radius);
    }

    public void move(int dx, int dy) {
        x += dx; y += dy;
    }
}
