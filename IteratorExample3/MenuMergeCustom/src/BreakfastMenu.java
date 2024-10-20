class BreakfastMenu implements IterableCollection<MenuItem> {
    private static final int MAX_ITEMS = 4;
    private MenuItem[] items;
    private int count = 0;

    public BreakfastMenu() {
        items = new MenuItem[MAX_ITEMS];
        addItem("Pancakes", "Pancakes with syrup", 2.99);
        addItem("Waffles", "Waffles with blueberries", 3.99);
        addItem("Omelette", "Eggs with cheese", 5.49);
        addItem("Toast", "Toast with butter", 1.99);
    }

    public void addItem(String name, String description, double price) {
        if (count >= MAX_ITEMS) {
            System.out.println("Cannot add more items to the breakfast menu!");
        } else {
            items[count++] = new MenuItem(name, description, price);
        }
    }

    @Override
    public CustomIterator<MenuItem> createIterator() {
        return new BreakfastMenuIterator();
    }

    private class BreakfastMenuIterator implements CustomIterator<MenuItem> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < count;
        }

        @Override
        public MenuItem next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more items in the breakfast menu.");
            }
            return items[index++];
        }
    }
}

