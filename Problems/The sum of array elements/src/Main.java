import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArray = sc.nextInt();
        int[] array = new int[sizeArray];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
        // put your code here
    }
}