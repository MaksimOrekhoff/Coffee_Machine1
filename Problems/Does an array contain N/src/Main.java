import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArray = sc.nextInt();
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int N = sc.nextInt();
        boolean count = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == N) {
                count = true;
                break;
            }
        }
        System.out.println(count);
        // put your code here
    }
}