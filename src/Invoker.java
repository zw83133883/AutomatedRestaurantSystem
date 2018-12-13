

public class Invoker {
        Aggregator a = new Aggregator();

        public Menu getMenu() {
            return (Menu) new DisplayMenu(a).execute();
        }
        public Order getOrder() {
            return (Order) new SubmitOrder(a).execute();
        }
        public Tab getTab() {
            return (Tab) new DisplayTab(a).execute();
        }
}
