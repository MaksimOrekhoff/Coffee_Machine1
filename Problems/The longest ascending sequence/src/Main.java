import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 1;
        int maxLength = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                count++;
                if (count > maxLength) {
                    maxLength = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(maxLength);
        // put your code here
    }
}