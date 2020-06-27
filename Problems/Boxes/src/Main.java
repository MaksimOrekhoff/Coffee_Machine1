import java.util.*;

class Boxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] box1 = new int[3];
        int[] box2 = new int[3];
        for (int i = 0; i < box1.length; i++) {
            box1[i] = scanner.nextInt();
        }

        for (int i = 0; i < box2.length; i++) {
            box2[i] = scanner.nextInt();
        }
        String str = "Incomparable";
        boolean equal = false;
        for (int i = 0; i < 3; i++) {
            int a = box1[i]; int b = box1[(i + 1) % 3]; int c = box1[(i + 2) % 3];
            int a1 = box2[i]; int b1 = box2[(i + 1) % 3]; int c1 = box2[(i + 2) % 3];

            if (a > a1 && (b >= b1 && c >= c1 || b >= c1 && c >= b1)
                    || a > b1 && (b >= c1 && c >= a1 || b >= a1 && c >= c1)) {
                str = "Box 1 > Box 2";
                break;
            }
            if (a < a1 && (b <= b1 && c <= c1 || b <= c1 && c <= b1)
                    || a < b1 && (b <= c1 && c <= a1 || b <= a1 && c <= c1)) {
                str = "Box 1 < Box 2";
                break;
            }
            if (a == a1 && b == b1 && c == c1
                    || a == b1 && b == c1 && c == a1
                    || a == c1 && b == a1 && c == b1) {
                str = "Box 1 = Box 2";
                break;
            }
        }
            /* else if (box1[1] > box2[1] && box1[2] >= box2[2] && box1[0] >= box2[0]) {
            System.out.println("Box 1 > Box 2");
        } else if (box1[2] > box2[2] && box1[0] >= box2[0] && box1[1] >= box2[1]) {
            System.out.println("Box 1 > Box 2");
        } else if (box2[0] > box1[0] && box2[1] >= box1[1] && box2[2] >= box1[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (box2[1] > box1[1] && box2[2] >= box1[2] && box2[0] >= box1[0]) {
            System.out.println("Box 1 < Box 2");
        } else if (box2[2] > box1[2] && box2[0] >= box1[0] && box2[1] >= box1[1]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }*/
        System.out.println(str);
        // write your code here
    }
}