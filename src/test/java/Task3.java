import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Please enter integer number: ");

        Scanner scanner = new Scanner(System.in);
            int number = 0;

        try {
            number = scanner.nextInt();
            System.out.println(number + " has correct input type");
        }catch (InputMismatchException e){
            System.out.println("“Invalid input. Please enter an integer.");
        }finally {
            if(number != 0) scanner.close();
        }
    }
}
