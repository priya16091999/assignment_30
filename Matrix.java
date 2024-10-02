
//	4.    Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object. The Matrix class has the following information:
//		a.    number of rows of matrix
//		b.    number of columns of matrix
//		c.    elements of matrix in the form of 2D array
//		The Matrix class has methods for each of the following:
//		a.    get the number of rows
//		b.    get the number of columns
//		c.    set the elements of the matrix at given position (i,j)
//		d.    adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.

package assignments_30;

public class Matrix {

	private int r;
	private int c;
	private int[][] m;

	public Matrix(int rows, int cols) {
		r = rows;
		c = cols;
		m = new int[r][c];
	}

	public void set(int i, int j, int val) {
		if (i >= 0 && i < r && j >= 0 && j < c) {
			m[i][j] = val; // Set the element in the matrix
		} else {
			System.out.println("Invalid index!");
		}
	}

	public Matrix add(Matrix other) {
		if (this.r != other.r || this.c != other.c) {
			System.out.println("Matrices cannot be added.");
			return null;
		}

		Matrix result = new Matrix(r, c);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				result.m[i][j] = this.m[i][j] + other.m[i][j];
			}
		}
		return result;
	}

	public void display() {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
