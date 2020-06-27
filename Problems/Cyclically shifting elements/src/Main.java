import java.util.Scanner;

class CyclicallyShiftingElements  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        int[] arrayRight = new int[sizeArray];
        int i, j;

        for (i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (j = 1; j < arrayRight.length; j++) {
            //for (i = count; i < array.length - 1; i++) {

                //if (count < array.length - 1) {
                    arrayRight[j] = array[count];
                    count++;
                //}
                //break;

            //}
        }
        arrayRight[0] = array[sizeArray - 1];
        for (j = 0; j < arrayRight.length; j++) {
            System.out.print(arrayRight[j] + " ");
        }
    }
}