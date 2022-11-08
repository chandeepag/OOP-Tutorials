package Week5;

interface Equation {
    int numberOfVariables = 1;

    private double solve() {
        return 0;      //private methods in interfaces should have a body
    }

    public default void printFormula(){
        System.out.println("x^2 + 3x + 1");     //interface abstract methods cannot have a body so made it a default method
    }
}

class LinearEquation implements Equation {
    public double solve() {
//        numberOfVariables = 2;    //(the variable is immutable)
        // ... details omitted

        return 0; // private methods in interfaces should have a body
    }
        public static void main(String[] args){
        }
}