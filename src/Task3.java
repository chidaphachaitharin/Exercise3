import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();

        if (a == 0)
        {
            System.out.println("Coefficient 'a' cannot be zero for a quadratic equation.");
        }
        else
        {
            System.out.print("Enter the value of b : ");
            double b = sc.nextDouble();
            System.out.print("Enter the value of c : ");
            double c = sc.nextDouble();

            double root = b * b - 4 * a * c;

            switch (getroot(root)) {
                case 0:
                    System.out.println("No real roots exist.");
                    break;
                case 1:
                    double x1 = (-b) / (2 * a);
                    System.out.printf("The root is x1 = %.2f\n", x1);
                    break;
                case 2:
                    double x = (-b + Math.sqrt(root)) / (2 * a);
                    double x2 = (-b - Math.sqrt(root)) / (2 * a);
                    System.out.printf("The roots are x1 = %.2f and x2 = %.2f\n", x, x2);
                    break;
            }
        }

        sc.close();
    }

    private static int getroot(double rootresult) {
        if (rootresult > 0) {
            return 2; // Two answer
        } else if (rootresult == 0) {
            return 1; // One answer
        } else {
            return 0; // No answer
        }
    }
}


