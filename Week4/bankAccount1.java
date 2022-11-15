package Week4;

public class bankAccount1 implements Comparable<bankAccount1> {

    private double balance;


    public bankAccount1(double balance){

        this.balance = balance;
    }

    @Override
    public int compareTo(bankAccount1 o) {
        if(this.balance == o.balance) return 0;
        else if (this.balance>o.balance) {
            return 1;
        }
        else return -1;

    }

    public double getBalance() {
        return balance;
    }
}
