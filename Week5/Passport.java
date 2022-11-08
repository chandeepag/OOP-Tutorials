package Week5;

public class Passport extends Card {
    private String birthLocation;
    private int expirationYear;

    public Passport(String n, String birth, int expire) {
        super(n);
        birthLocation = birth;
        expirationYear = expire;
    }

    public Passport(String birth, int expire) {
        birthLocation = birth;
        expirationYear = expire;
    }
    // assume never expire
    public boolean isExpired() {
        return false;
    }
}
