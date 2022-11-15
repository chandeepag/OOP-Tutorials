package Week4;

public class Question1Test {
    public static void main(String[] args) {
        String grades[] = new String[5];
        grades[0] = "A";
        grades[1] = "B";
        grades[2] = "D";
        grades[3] = "C";
        grades[4] = "F";
        Student studentOne = new Student("Jake", grades);
        studentOne.print();
        Letter letter = new Letter("This is the letter");
        letter.print();
    }
}
