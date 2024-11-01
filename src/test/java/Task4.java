public class Task4 {
    public static void main(String[] args) {
        String stringValue = null ;
        int [] array = {45, 46, 47, 48, 49, 50, 51, 52};

        try {
            System.out.println(stringValue.length());
        }catch (NullPointerException e){
            System.out.println("String variable is null.");
        }

        try {
            System.out.println(array[12]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds.");
        }
    }
}
