package Week5;

interface Printable{
    void print();
}

class Letter implements Printable {
   private String text;

   Letter(String text){
       this.text=text;
   }

    @Override
    public void print() {
       System.out.println("text: "+text);
    }
}
class Student implements Printable {
    private String name;
    private String grades[];

    Student(String name, String grades[]){
        this.name=name;
        this.grades=grades;
    }

    public void print() {
        System.out.println("name: " + name);
        System.out.print("grades: ");
        for (String x : grades)
            System.out.print(x + " ");
        System.out.println();
    }
}

