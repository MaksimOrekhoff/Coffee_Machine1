import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean check = false;
        for (int i = 1; i < array.length; i++) {
            if ((array[i] == n) && (array[i - 1] == m)) {
                check = true;
                break;
            } else if ((array[i] == m) && (array[i - 1] == n)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        System.out.println(check);
        // put your code here
    }
}