package ArnoldCodeClan.Dealership;

public class Till {

    private double cash;

    public Till(double cash) {
        this.cash = cash;
    }


    public double totalTillValue() {
        return cash;
    }

    public void buy(double value) {
        if (cash > value) {
            cash -= value;
        }
    }

    public void sell(double value) {
        cash += value;
    }
}
