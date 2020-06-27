import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        for (int i = 0; i < array.length - 2; i++) {
            if ((array[i + 1] - array[i] == 1) && (array[i + 2] - array[i +1] == 1)) {
                count++;
            }
        }
        System.out.println(count);
        // put your code here
    }
}