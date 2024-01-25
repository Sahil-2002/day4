import java.util.Scanner;

public class QandR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dividend   = ");
        int dividend = sc.nextInt();
        System.out.println("enter the divisor = ");
        int divisor = sc.nextInt();
        int Quotient = dividend/divisor;
        int remainder = dividend%divisor;
        System.out.println("when we divided "+dividend+" by "+divisor+" we got quotient as "+Quotient+ " and reaminder as "+remainder);

    }

}
