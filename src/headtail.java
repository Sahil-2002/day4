import java.util.Scanner;
import java.util.Random;

public class headtail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of flips = ");
        int num = sc.nextInt();
        if (num <= 0) {

            System.out.println("please enter positive number !");
        }
        int head = 0, tail = 0;


        for (int i = 0; i < num; i++) {
            Random r = new Random();
            double task = r.nextDouble();

            if (task < 0.5) {
                head++;
            } else {
                tail++;

            }

        }
        double head_percentage = ((double) head / num) * 100;
        double  tail_percentage = ((double) tail / num) * 100;

        System.out.println("head" + head_percentage);
        System.out.println("tail" + tail_percentage);




    }

}






