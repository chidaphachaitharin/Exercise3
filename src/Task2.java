import java.util.Scanner;
import java.lang.Math;
public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Height (cm): ");
        float heightBielecki = sc.nextFloat();

        System.out.print("Enter your Weight (kg): ");
        float weightBielecki = sc.nextFloat();

        float BMI = (float) (weightBielecki / (Math.pow(heightBielecki/100, 2)));
        System.out.printf("BMI: %.2f\n", BMI);

        if (BMI == 16.00)
        {
            System.out.printf("BMI index: starvation");
        }
        else if (BMI > 16.00 || BMI <= 16.99)
        {
            System.out.printf("BMI index: emaciation");
        }
        else if (BMI >= 17.00 || BMI <= 18.49)
        {
            System.out.printf("BMI index: underweight");
        }
        else if (BMI >= 18.50 || BMI <= 22.99)
        {
            System.out.printf("BMI index: normal, low range");
        }
        else if (BMI >= 23.00 || BMI <= 24.99)
        {
            System.out.printf("BMI index: normal, high range");
        }
        else if (BMI >= 25.00 || BMI <= 27.49)
        {
            System.out.printf("BMI index: overweight, low range");
        }
        else if (BMI >= 27.50 || BMI <= 29.99)
        {
            System.out.printf("BMI index: overweight, high range");
        }
        else if (BMI >= 30 || BMI <= 34.9)
        {
            System.out.printf("BMI index: 1st degree obesity");
        }
        else if (BMI >= 35 || BMI <= 39.9)
        {
            System.out.printf("BMI index: 2nd degree obesity");
        }
        else if (BMI >= 40)
        {
            System.out.printf("BMI index: 3rd degree obesity");
        }

    }
}
