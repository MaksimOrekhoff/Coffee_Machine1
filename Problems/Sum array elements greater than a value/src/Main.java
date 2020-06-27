import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArray = sc.nextInt();
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                sum += array[i];
            }
        }
        System.out.println(sum);
        // put your code here
    }
}