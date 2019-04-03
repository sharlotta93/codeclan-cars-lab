package ArnoldCodeClan.Customer;

public class Customer {


    private String name;
    private int age;
    private boolean license;
    private double wallet;

    public Customer(String name, int age, boolean license, double wallet) {
        this.name = name;
        this.age = age;
        this.license = license;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean validLicense() {
        return license;
    }

    public double totalCash() {
        return wallet;
    }

    public void pay(double price) {
        if (wallet >= price) {
            wallet -= price;
        }
    }
}
