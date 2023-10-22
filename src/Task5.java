import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int randomnumber = 10;

        Random random = new Random();

        int count = 0;
        System.out.print("Randomly integers: ");
        while (count < randomnumber) {

            int randomInteger = random.nextInt(100) + 1;
            System.out.print(randomInteger + " ");

            if (randomInteger > largest) {
                largest = randomInteger;
            }
            if (randomInteger < smallest) {
                smallest = randomInteger;
            }

            count++;
        }

        System.out.println("\nLargest number: " + largest);
        System.out.println("Smallest number: " + smallest);

    }
}
