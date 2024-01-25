import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a = ");
        int a = sc.nextInt();
        System.out.println("enter the value of b =");
        int b = sc.nextInt();
        System.out.println("before swapping a = "+a+" and b = "+b);
         a= a+b;
         b=a-b;
         a=a-b;
        System.out.println("after swapping value of a is "+a+" and value of b is "+b);

    }
}
