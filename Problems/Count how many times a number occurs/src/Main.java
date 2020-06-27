import java.util.Scanner;

class CountNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amountOfNumbers = sc.nextInt();
        int[] arrayNumber = new int[amountOfNumbers];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] == n) {
                count++;
            }
        }
        System.out.println(count);
        // put your code here
    }
}