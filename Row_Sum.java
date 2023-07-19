package sample;

import java.util.Scanner;

public class Row_Sum {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int columns = scanner.nextInt();

	        int[][] matrix = new int[rows][columns];
	        System.out.println("Enter the matrix elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	        int[] rowSum = getrowSum(matrix);
	        System.out.print("Row-wise sums: ");
	        for (int sum : rowSum) {
	            System.out.print(sum + " ");
	        }
	    }

	    public static int[] getrowSum(int[][] matrix) {
	        int rows = matrix.length;
	        int columns = matrix[0].length;
	        int[] rowSum = new int[rows];

	        for (int j = 0; j < columns; j++) {
	            int sum = 0;
	            for (int i = 0; i < rows; i++) {
	                sum += matrix[i][j];
	            }
	            rowSum[j] = sum;
	        }

	        return rowSum;
	    }


	}

}
