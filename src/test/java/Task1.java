import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Please enter first number: ");
        int secondNum = scanner.nextInt();

        try {
            int result = firstNum/secondNum;
            System.out.println("Your result after divide is " + result);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by Zero");
        }

        scanner.close();
    }
}
