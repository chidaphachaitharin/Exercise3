import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float firstNumberBielecki = sc.nextFloat();

        System.out.print("Enter the second number: ");
        float secondNumberBielecki = sc.nextFloat();

        float sum = firstNumberBielecki + secondNumberBielecki;
        float difference = firstNumberBielecki - secondNumberBielecki;
        float product = firstNumberBielecki * secondNumberBielecki;
        float quotient = firstNumberBielecki / secondNumberBielecki;

        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %.2f\n", product);

        if (secondNumberBielecki != 0) {
            System.out.printf("Quotient: %.2f\n", quotient);
        } else {
            System.out.println("Quotient: The answer is not defined");
        }

        sc.close();

    }
}
