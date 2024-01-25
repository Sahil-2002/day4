import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class poweroftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the power of two : ");
        int N = sc.nextInt();
        if(N>=0 && N<31){


                for (int i = 0; i <= N; i++) {

                    int output = (int) Math.pow(2, i);
                    System.out.println("2^" + i + "= " + output);
                }
            }
        else{
            System.out.println("invalid input ");
        }
    }


}

