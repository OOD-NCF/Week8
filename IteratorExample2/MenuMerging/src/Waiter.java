import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Waiter {
    private Iterable<MenuItem> breakfastMenu;
    private Iterable<MenuItem> lunchMenu;

    public Waiter(Iterable<MenuItem> breakfastMenu, Iterable<MenuItem> lunchMenu) {
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
    }

    public void printMenu() {
        System.out.println("BREAKFAST MENU:");
        printMenu(breakfastMenu.iterator());

        System.out.println("\nLUNCH MENU:");
        printMenu(lunchMenu.iterator());
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem);
        }
    }
}
