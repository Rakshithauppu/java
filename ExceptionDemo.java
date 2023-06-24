
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An ArithmeticException occurred!");
        }
        
        try {
            int[] arr = new int[5];
            arr[10] = 100; 
            System.out.println("Element at index 10: " + arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An ArrayIndexOutOfBoundsException occurred!");
        }
    }
}