import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int maxProduct = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] > maxProduct) {
                maxProduct = array[i] * array[i + 1];
            }
        }
        System.out.println(maxProduct);
        // put your code here
    }
}