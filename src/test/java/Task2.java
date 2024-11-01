import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner readFromFile = null;
        try {
            File file1 = new File("C:\\Users\\anakhurtsidze\\Desktop\\Khurtsidze_practice_8\\src\\test\\data.txt");
            readFromFile = new Scanner(file1);
            String s = readFromFile.nextLine();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please make sure data.txt exists in the directory.");
        } finally {
            if(readFromFile != null) {
                readFromFile.close();
            }
        }
    }
}
