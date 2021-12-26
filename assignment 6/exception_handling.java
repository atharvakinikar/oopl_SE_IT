import java.util.*;

public class exception_handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index, num1, num2;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        try {
            try {
                System.out.println("Enter the index of array to be accessed: ");
                index = sc.nextInt();
                System.out.println(arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Enter valid index of array!!");
            }
            try {
                System.out.println("Enter the first number");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Enter only integers!!");
            }
            try {
                System.out.println("Enter the second number");
                num2 = sc.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Enter only integers!!");
            }
            System.out.println(num1 / num2);
        }

        catch (ArithmeticException e) {
            System.out.println("Division by Zero is Not Possible!!");
        }

    }
}
