public class Calculator {

    
    public int multiply(int a, int b) {
        return a * b;
    }
    public float divide(int a, int b) {
        if(b==0){
            throw new ArithmeticException("Division by zero");
        }
        return (float)a / (float)b;
    }

    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;

    }
    public static void main(String[] args) {
    }
}
