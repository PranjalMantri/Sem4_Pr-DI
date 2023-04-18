public class Main {
    public static void main(String[] args) {
        int[] arr = {100, 47, 550, 217};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The Maximum and Minimum elements of array are: ");
        System.out.println("The maximum element is : " + max);
        System.out.println("The minimum element is : " + min);
    }
}