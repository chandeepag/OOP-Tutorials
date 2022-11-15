package Week4;

import java.util.ArrayList;

public class bankAccount2Test {
    public static void main(String[] args) {
        bankAccount2 acc1 = new bankAccount2( 50);
        bankAccount2 acc2 = new bankAccount2( 80);
        bankAccount2 acc3 = new bankAccount2( 30);
        bankAccount2 acc4 = new bankAccount2( 60);
        bankAccount2 acc5 = new bankAccount2( 10);

        System.out.println("Account One compared to account Two: " + acc1.compare(acc1.getBalance(),acc2.getBalance()));
        System.out.println("Account Two compared to account One: " + acc2.compare(acc2.getBalance(),acc1.getBalance()));


        ArrayList<bankAccount2> list = new ArrayList<bankAccount2>();
        list.add(acc1);
        list.add(acc2);
        list.add(acc3);
        list.add(acc4);
        list.add(acc5);

        //print the sorted list
        for (bankAccount2 x: list){
            System.out.println(x.getBalance());
        }
    }
}
