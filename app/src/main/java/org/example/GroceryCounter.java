public class GroceryCounter {

    private int value;
    private int overflows;

    public GroceryCounter() {
        value = 0;
        overflows = 0;
    }

    public void tens() { add(1000); }
    public void ones() { add(100); }
    public void tenths() { add(10); }
    public void hundreths() { add(1); }

    private void add(int amount) {
        value += amount;

        if (value > 9999) {
            value -= 10000;
            overflows++;
        }
    }

    public String total() {
        int dollars = value / 100;
        int cents = value % 100;
        return "$" + dollars + "." + (cents < 10 ? "0" : "") + cents;
    }

    public int overflows() {
        return overflows;
    }

    public void clear() {
        value = 0;
        overflows = 0;
    }
}
