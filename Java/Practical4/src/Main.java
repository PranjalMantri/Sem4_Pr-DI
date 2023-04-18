import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Using a Temporary Variable
        /*Scanner x = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter A: ");
        a = x.nextInt();

        System.out.println("Enter B: ");
        b = x.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("A is : " + a);
        System.out.println("B is : " + b);
*/
        //Without Temporary variable
        int a = 12, b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("A is : " + a);
        System.out.println("B is : " + b);
    }
}