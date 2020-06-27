import java.util.Scanner;

class ArrayIsSortedAscending  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArray = sc.nextInt();
        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        boolean count = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                count = true;
                continue;
            } else {
                count = false;
                break;
            }
        }
        System.out.println(count);

    }
}