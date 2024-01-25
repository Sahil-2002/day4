import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whose factor you want : ");
        int N = sc.nextInt();
        if(N>1){
            for(int i=2; i<=N ; i++){

                while(N%i==0){
                    System.out.println("factor is "+i);
                    N=N/i;

                }
            }

        }
        else{
            System.out.println("invalid ");
        }
    }

}
