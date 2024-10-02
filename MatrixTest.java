package assignments_30;

import java.util.Scanner;

public class MatrixTest {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Rows for first matrix: ");
	        int r1 = sc.nextInt();
	        System.out.print("Cols for first matrix: ");
	        int c1 = sc.nextInt();
	        Matrix mat1 = new Matrix(r1, c1); 
	        System.out.println("Elements for first matrix:");
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c1; j++) {
	                System.out.print("Element [" + i + "][" + j + "]: ");
	                int val = sc.nextInt();
	                mat1.set(i, j, val);
	            }
	        }



	        System.out.print("Rows for second matrix: ");
	        int r2 = sc.nextInt();
	        System.out.print("Cols for second matrix: ");
	        int c2 = sc.nextInt();
	        Matrix mat2 = new Matrix(r2, c2); 
	        System.out.println("Elements for second matrix:");
	        for (int i = 0; i < r2; i++) {
	            for (int j = 0; j < c2; j++) {
	                System.out.print("Element [" + i + "][" + j + "]: ");
	                int val = sc.nextInt();
	                mat2.set(i, j, val);
	            }
	        }

	        
	        Matrix sumMat = mat1.add(mat2);
	        if (sumMat != null) {
	            System.out.println("Resultant Matrix after Addition:");
	            sumMat.display(); 
	        }
	}

}
