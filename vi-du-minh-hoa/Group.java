// Composite

import java.util.*;
public class Group implements Graphic {
    private List<Graphic> children = new ArrayList<>();

    public void draw() {
        System.out.println("Draw Group {");
        for (Graphic g : children) g.draw();
        System.out.println("}");
    }

    public void move(int dx, int dy) {
        for (Graphic g : children) g.move(dx, dy);
    }

    public void add(Graphic g) { 
        children.add(g);
    }
    
    public void remove(Graphic g) {
        children.remove(g);
    }
}
