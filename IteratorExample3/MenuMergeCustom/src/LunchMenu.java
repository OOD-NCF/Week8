import java.util.ArrayList;
import java.util.List;

class LunchMenu implements IterableCollection<MenuItem> {
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
    public CustomIterator<MenuItem> createIterator() {
        return new LunchMenuIterator();
    }

    private class LunchMenuIterator implements CustomIterator<MenuItem> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < items.size();
        }

        @Override
        public MenuItem next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more items in the lunch menu.");
            }
            return items.get(index++);
        }
    }
}
