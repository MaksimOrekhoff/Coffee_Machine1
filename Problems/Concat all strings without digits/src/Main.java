import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            String[] strings1 = strings[i].split("[1234567890]");
            for (int j = 0; j < strings1.length; j++) {
                s.append(strings1[j]);
            }
        }
        String s1 = s.toString();
        return s1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}