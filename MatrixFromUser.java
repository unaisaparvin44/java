import java.util.Scanner;

public class MatrixFromUser {

    public static void readAndMultiplyMatrices() {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of rows of the first matrix:");
        int m1 = in.nextInt();
        System.out.println("Enter the number of columns of the first matrix:");
        int n1 = in.nextInt();
        
        int[][] first = new int[m1][n1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                first[i][j] = in.nextInt();
            }
        }
        
        System.out.println("Enter the number of rows of the second matrix:");
        int m2 = in.nextInt();
        System.out.println("Enter the number of columns of the second matrix:");
        int n2 = in.nextInt();
        
        if (n1 != m2) {
            System.out.println("Matrix multiplication is not possible. Number of columns of first matrix must be equal to number of rows of second matrix.");
            in.close();
            return;
        }
        
        int[][] second = new int[m2][n2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                second[i][j] = in.nextInt();
            }
        }
        
        int[][] result = new int[m1][n2];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
        
        in.close();
    }

    public static void main(String[] args) {
        readAndMultiplyMatrices();
    }
}
