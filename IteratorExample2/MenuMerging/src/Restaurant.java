public class Restaurant {
    public static void main(String[] args) {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        LunchMenu lunchMenu = new LunchMenu();

        Waiter waiter = new Waiter(breakfastMenu, lunchMenu);
        waiter.printMenu();  // Merge and print both menus
    }
}
