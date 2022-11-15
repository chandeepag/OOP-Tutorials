package Week4;

public class DriverLicense extends Card {
    private int expirationYear;

    public DriverLicense(String n, int expire) {
        super(n);
        expirationYear = expire;
    }

    public DriverLicense(int expire) {
        expirationYear = expire;
    }

    // assume never expire
    public boolean isExpired() {
        return false;
    }
}
