import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class LunchMenu implements Iterable<MenuItem> {
    private List<MenuItem> items;

    public LunchMenu() {
        items = new ArrayList<>();
        addItem("Burger", "Beef burger with fries", 7.99);
        addItem("Salad", "Fresh green salad", 5.99);
        addItem("Sandwich", "Turkey sandwich with lettuce", 6.99);
        addItem("Soup", "Chicken noodle soup", 3.99);
    }

    public void addItem(String name, String description, double price) {
        items.add(new MenuItem(name, description, price));
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return items.iterator(); // Use ArrayList's built-in iterator
    }
}
