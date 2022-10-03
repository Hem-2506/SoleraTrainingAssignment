package Assignment2;

import java.util.Scanner;

public class OuestionSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows in arr1");
		int m = sc.nextInt();
		
		System.out.println("Enter the number of columns in arr1");
		int n = sc.nextInt();
		
		System.out.println("Enter the number of rows in arr2");
		int a = sc.nextInt();
		
		System.out.println("Enter the number of columns in arr2");
		int b = sc.nextInt();

		
		int[][] Arr1 = new int[m][n];
		int[][] Arr2 = new int[a][b];
		int[][] Sum = new int[m][n];
		
		if(m==a && n==b) {
	
		System.out.println("Enter the numbers in Array 1");
		 for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	               Arr1[i][j] = sc.nextInt();
	            }
	           
	        }
		
		 
		 System.out.println("Enter the numbers in Array 2");
		 for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	               Arr2[i][j] = sc.nextInt();
	            }
	           
	        }
		
		 System.out.println("Sum of these Two Array is");
		 for (int i = 0; i < a; i++) {
	            for (int j = 0; j < b; j++) {
	               Sum[i][j] = Arr1[i][j] + Arr2[i][j];
	            }
	           
	        }
		 
		 
		 for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	               System.out.println(Sum[i][j]);
	            }
	           
	        }

		}
		
		else {
			System.out.println("Unmatched Dimension");
		}
		
		
	}

}
