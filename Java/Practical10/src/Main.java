public class Main {
    public static int sum(int x, int y) {
        return (x + y);
    }
    public static double sum(double x, double y)
    {
        return (x + y);
    }

    public static void main(String[] args)
    {
        Main a = new Main();
        System.out.println(a.sum(10, 20));
        System.out.println(a.sum(10.5, 20.5));
    }
}
