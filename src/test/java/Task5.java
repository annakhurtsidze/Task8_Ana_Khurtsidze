import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];

        for(int i=0; i<array.length; i++){
            System.out.println("Please enter the number for array: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Please enter integer number: ");
        int index = scanner.nextInt();


        try{
            int result = array[index]/index;
            System.out.println("Your result is " + result);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index.");
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }finally {
            scanner.close();
        }
    }
}
