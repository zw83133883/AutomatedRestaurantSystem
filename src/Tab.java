public class Tab {
    private Menu menu;
    private Order order;
    private double total;
    private double tax;
    public static boolean paid = false;

    public Tab(Menu m, Order o) {
        menu = m;
        order = o;
    }
    public void getTab() {
        paid = true;
        int i = 0;
        System.out.println("********************");
        double total = getTotal();
        System.out.println();
        System.out.format("Tax: $%.2f",tax);
        System.out.println();
        System.out.format("Total: $%.2f", total);
        System.out.println();
    }
    public double getTotal() {
        int i = 0;
        double total = 0;
        while (i < order.getOrder().size()) {
            MenuItem m = menu.getMenu().get(order.getOrder().get(i).getMenuNum());
            System.out.println(m.getMenuNum() + " " + m.getDescription() + " $" + m.getPrice());
            tax = m.getPrice()*0.06;
            total += m.getPrice()*0.06 + m.getPrice();
            i++;
        }
        return total;
    }
}