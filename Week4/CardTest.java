package Week4;

public class CardTest {
    public static void main(String[] args) {
        DriverLicense license1 = new DriverLicense("Jane", 2000);
        System.out.println(license1.getName() + "'s License expired: " + license1.isExpired());

        DriverLicense license2 = new DriverLicense("Kane", 2020);
        System.out.println(license2.getName() + "'s License expired: " + license1.isExpired());


        Passport passport1 = new Passport("Williamson", "London", 2003);
        System.out.println(passport1.getName() + "'s Passport expired: " + passport1.isExpired());

        Passport passport2 = new Passport("Joel", "Glasgow", 2015);
        System.out.println(passport2.getName() + "'s Passport expired: " + passport1.isExpired());


        CreditCard creditCard1 = new CreditCard("John", 1234, 567890123);
        System.out.println(creditCard1.getName() +"'s Credit card expired: " + creditCard1.isExpired());

    }
}
