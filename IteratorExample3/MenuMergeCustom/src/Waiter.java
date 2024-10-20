class Waiter {
    private IterableCollection<MenuItem> breakfastMenu;
    private IterableCollection<MenuItem> lunchMenu;

    public Waiter(IterableCollection<MenuItem> breakfastMenu, IterableCollection<MenuItem> lunchMenu) {
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
    }

    public void printMenu() {
        System.out.println("BREAKFAST MENU:");
        printMenu(breakfastMenu.createIterator());

        System.out.println("\nLUNCH MENU:");
        printMenu(lunchMenu.createIterator());
    }

    private void printMenu(CustomIterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem);
        }
    }
}
