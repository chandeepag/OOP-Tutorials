package Week4;

import java.util.ArrayList;
import java.util.Collections;

public class bankAccount1Test {
    public static void main(String[] args) {
        bankAccount1 acc1 = new bankAccount1( 50);
        bankAccount1 acc2 = new bankAccount1( 80);
        bankAccount1 acc3 = new bankAccount1( 30);
        bankAccount1 acc4 = new bankAccount1( 60);
        bankAccount1 acc5 = new bankAccount1( 10);

        System.out.println("Account One compared to account Two: " + acc1.compareTo(acc2));
        System.out.println("Account Two compared to account One: " + acc2.compareTo(acc1));


        ArrayList<bankAccount1> list = new ArrayList<bankAccount1>();
        list.add(acc1);
        list.add(acc2);
        list.add(acc3);
        list.add(acc4);
        list.add(acc5);

        Collections.sort(list);

        //print the sorted list
        for (bankAccount1 x: list){
            System.out.println(x.getBalance());
        }
    }
}
