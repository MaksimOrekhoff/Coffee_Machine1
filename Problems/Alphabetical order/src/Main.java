import java.util.Scanner;

class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] st1 = str.split(" ");
        boolean alph = true;
        /*for(int i = 0; i < st1.length; i++) {
            char[] current = st1[i].toCharArray();
            for(int j = 0; j < current.length - 1; j++) {
                if (current[j] > current[j + 1]){
                    alph = false;
                    break;
                }
            }
            if (!alph) {
                break;
            }
        }*/

        for(int i = 0; i < st1.length - 1; i++) {
            if (st1[i].compareTo(st1[i+1]) > 0) {
                alph = false;
                break;
            }
        }
        System.out.println(alph);

        // put your code here
    }
}