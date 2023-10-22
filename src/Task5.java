import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int collect = 10 , i = 1 , number , min = 101 , max = 0;

        Random r = new Random();
        while (i<= collect){
            number = Math.round((r.nextInt(100)+1));
            System.out.print(number + " , ");

        }
    }
}
