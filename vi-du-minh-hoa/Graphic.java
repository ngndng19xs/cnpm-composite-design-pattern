// Component

public interface Graphic {
    void draw();
    void move(int dx, int dy);
    
    default void add(Graphic g) { 
        throw new UnsupportedOperationException(); 
    }

    default void remove(Graphic g) {
        throw new UnsupportedOperationException();
    }
}