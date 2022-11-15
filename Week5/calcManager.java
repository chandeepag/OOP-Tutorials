package Week5;

public class calcManager {

    private int n;
    private int x;
    private int z;

    public boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

   int returnCube(int n){
        int cube = n*n*n;
        return cube;
    }

    double add(int n, int x, int z){
        int add = n+x+z;
        return add;
    }




    public static void main(String[] args) {
        calcManager number = new calcManager();
        System.out.println(number.isEven(7));
        System.out.println(number.isEven(20));
        System.out.println(number.returnCube(5));
        System.out.println(number.add(5,20,35));

    }
}