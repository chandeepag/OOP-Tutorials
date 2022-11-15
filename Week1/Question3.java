package Week1;


//print even numbers between 0-100
public class Question3 {
    public static void main(String[] args) {
        for (int i=2; i<100;i+=2) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}