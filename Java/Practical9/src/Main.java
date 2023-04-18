public class Main {
    public static void main(String[] args) {
        int x = 6;
        int factorial = Factorial(x);
        System.out.println("The Factorial of " + x + " is : " + factorial);
    }
    public static int Factorial(int n){
        if (n >= 1) {
            return n * Factorial(n - 1);
        }
        else {
            return 1;
        }
    }
}