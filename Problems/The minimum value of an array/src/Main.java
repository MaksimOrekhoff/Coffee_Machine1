import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArray = sc.nextInt();
        int[] array = new int[sizeArray];
        int minNumArr = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array [i] < minNumArr) {
                minNumArr = array[i];
            }
        }
        System.out.println(minNumArr);
        // put your code here
    }
}