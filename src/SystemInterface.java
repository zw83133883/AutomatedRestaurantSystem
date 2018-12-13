import java.util.Scanner;

public class SystemInterface {
    private static Invoker invoker = new Invoker();
    private static Scanner input = new Scanner(System.in);
    private static final int min = 1;
    private static final int max = 3;

    public static String getMenu() {
        Menu m = invoker.getMenu();
        m.print();
        return m + " ";
    }
    public static String getOrders() {
        Order o = invoker.getOrder();
        return o + " ";
    }
    public static String getTab() {
        Tab t = invoker.getTab();
        t.getTab();
        return t + " ";
    }
    public static int getInt(Scanner input, int min, int max) {
        while (!input.hasNextInt()) {
            System.out.println("Invalid.");
            input.next();
        }
        int choice = input.nextInt();
        if (choice < min || choice > max) {
            System.out.println("Invalid range.");
            choice = getInt(input, min, max);
        }
        return choice;
    }
}