import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCompany = scanner.nextInt();
        int[] income = new int[numCompany];
        int[] taxes = new int[numCompany];
        for (int i = 0; i < income.length; i++) {
            income[i] = scanner.nextInt();
        }

        for (int i = 0; i < income.length; i++) {
            taxes[i] = scanner.nextInt();
        }


        int maxTax = 0;
        int index = 0;
        for (int i = 0; i < taxes.length; i++) {
            if (taxes[i] * income[i] > maxTax) {
                maxTax = taxes[i] * income[i];
                index = i;
            }
        }
        System.out.println(index + 1);
        // write your code here
    }
}