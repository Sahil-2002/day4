import java.util.Scanner;

public class harmonicnumber {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the harmonic number N : ");
        int N = sc.nextInt();
        if(N<=0){
            System.out.println("invalid input please enter positive number : ");
        }
        float sum =0f;
        for(float i=1;i<=N;i++ ){


            sum = sum+1/i;
        }
        //System.out.println();
        System.out.println("sum is "+sum);


    }

}
