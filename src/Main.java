import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] a = new int[2][3];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Printing the entire matrix");
//        for (int i = 0; i < a[0].length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                System.out.print(a[j][i] + " ");
//            }
//            System.out.print("\n");
//        }
//        System.out.println("summing");
//        int sum = 0;
//        for (int i = 0; i < a[0].length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                sum += a[j][i];
//            }
//        }
//        System.out.println(sum);
        System.out.println("row wise printing");
        int[][] b = {
                {4, 3, 8},
                {2, 5, 1},
                {7, -1, 9},
        };
        int[][] result = new int[b.length][0];
        result = getColSum(b);
        for (int i = 0; i < result[0].length; i++) {
            {
                System.out.print(result[0][i] + " ");
                System.out.print("\n");
            }

        }
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i][i]);
        }
        for(int i = 0; i < b.length;i++){
            System.out.println(b[i][(b.length-i-1)]);
        }
    }

    public static int[][] getRowSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] sumresult = new int[rows][1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumresult[i][0] += matrix[i][j];
            }
        }
        return sumresult;
    }
    public static int[][] getColSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] sumresult = new int[1][cols];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                sumresult[0][i] += matrix[j][i];
            }
        }
        return sumresult;
    }
}