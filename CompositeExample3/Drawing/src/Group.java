// Composite - Group

import java.util.ArrayList;
import java.util.List;

class Group implements Graphic {
    private List<Graphic> childGraphics = new ArrayList<>();

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Group of Graphics:");
        for (Graphic graphic : childGraphics) {
            graphic.draw(); // Delegates drawing to child components
        }
    }
}
