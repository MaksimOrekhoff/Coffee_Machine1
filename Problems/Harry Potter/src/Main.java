import java.util.Scanner;

class HarryPotter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String faculty = scanner.next();
        switch (faculty) {
            case ("gryffindor"):
                System.out.println("bravery");
                break;
            case ("hufflepuff"):
                System.out.println("loyalty");
                break;
            case ("slytherin"):
                System.out.println("cunning");
                break;
            case ("ravenclaw"):
                System.out.println("intellect");
                break;
            default:
                System.out.println("not a valid house");
        }
        // put your code here
    }
}