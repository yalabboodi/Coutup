public class App {
    public static void main(String[] args) {

        GroceryCounter counter = new GroceryCounter();

        System.out.println(counter.total());
        counter.tens();
        counter.tens();
        counter.hundreths();

        System.out.println(counter.total());
    }
}
