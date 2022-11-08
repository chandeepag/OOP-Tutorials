package Week5;

public class CreditCard extends Card {
    private int pinNumber;
    private int number;

    public CreditCard(String n, int pin, int num) {
        super(n);
        pinNumber = pin;
        number = num;
    }

    public CreditCard(int pin, int num) {
        pinNumber = pin;
        number = num;
    }


    // assume never expire
    public boolean isExpired() {
        return false;
    }
}
