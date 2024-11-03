

public class Task4 {
    public static void main(String[] args) {
        int [] array = {45, 46, 47, 48, 49, 50, 51, 52};
        String stringValue = null ;


        try {
            System.out.println("Array index is out of bounds.");
            System.out.println(stringValue.length());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds.");
        }
        catch (NullPointerException e){
            System.out.println("String variable is null.");
        }

    }
}
