import java.util.Scanner;

class PlanRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String roomShape = scanner.next();


        switch (roomShape) {
            case ("triangle"):
                double firstNumber = scanner.nextDouble();
                double secondNumber = scanner.nextDouble();
                double thirdNumber = scanner.nextDouble();
                double p = (firstNumber + secondNumber + thirdNumber)/2;

                System.out.println(Math.sqrt(p * (p - firstNumber) *
                        (p - secondNumber) *
                        (p - thirdNumber)));
                break;
            case ("rectangle"):
                 firstNumber = scanner.nextDouble();
                 secondNumber = scanner.nextDouble();
                System.out.println(firstNumber * secondNumber);
                break;
            case ("circle"):
                firstNumber = scanner.nextDouble();
                System.out.println(3.14*firstNumber*firstNumber);
                break;

        }
    }
}