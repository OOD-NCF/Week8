public class Restaurant {
    public static void main(String[] args) {
        IterableCollection<MenuItem> breakfastMenu = new BreakfastMenu();
        IterableCollection<MenuItem> lunchMenu = new LunchMenu();

        Waiter waiter = new Waiter(breakfastMenu, lunchMenu);
        waiter.printMenu();  // Merge and print both menus
    }
}
