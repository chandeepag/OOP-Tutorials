package Week5;

import java.util.Comparator;

public class bankAccount2 implements Comparator<Double> {
    private double balance;


    public bankAccount2(double balance){

        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public int compare(Double o1, Double o2) {
        if(o1 == o2) return 0;
        else if (o1>o2) {
            return 1;
        }
        else return -1;
    }
}
