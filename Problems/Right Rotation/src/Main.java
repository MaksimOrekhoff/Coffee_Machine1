import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int size = array.length;
        int numberOfRotations = scanner.nextInt() % size;
        String[] newArray = new String[size];

        for (int i = 0; i < size; i++) {
            int newIndex = (i + numberOfRotations) % size;
            newArray[newIndex] = array[i];
        }

        for (String elem : newArray) {
            System.out.print(elem + " ");
        }

            // put your code here
    }
}

/*
for(int i = 0; i < numberOfRotations; i++) {
            int j, last;

            last = result[result.length - 1];

            for (j = result.length - 1; j > 0; j--) {
                //Shift element of array by one
                result[j] = result[j - 1];
                result[0] = (char) last;
            }
        }
        for(int i = 0; i< result.length; i++) {
            System.out.print(result[i] + " ");
        }
 */