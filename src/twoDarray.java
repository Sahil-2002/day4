import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of row ");
        row = sc.nextInt();
        System.out.println("enter the size of column");
        col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("enter the number in an array ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();


        }

    }
}
