package Week3;

public class Question5 {
    public static void main(String[] args) throws Exception {
        Question4 machine = new Question4();
        machine.addCans(4);
        machine.insertToken();
        machine.insertToken();
        machine.insertToken();
        System.out.println("====Can count====");
        System.out.println(machine.getCanCount());
        System.out.println("====Token Count====");
        System.out.println(machine.getTokenCount());
    }
}
