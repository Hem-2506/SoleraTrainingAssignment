package Assignment2;

import java.util.Scanner;

public class oddInTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int m=2,n=2;
		int[][] Arr = new int[m][n];
	
		System.out.println("Enter the numbers");
		 for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	               Arr[i][j] = sc.nextInt();
	            }
	           
	        }
		 
		 for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	               if((Arr[i][j]%2)!=0) {
	            	   System.out.println(Arr[i][j]);
	               }
	            }
	           
	        }
		 
	}

}
