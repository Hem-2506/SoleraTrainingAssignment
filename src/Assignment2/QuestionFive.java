package Assignment2;
import java.util.Scanner;

public class QuestionFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     

		Scanner sc = new Scanner(System.in);

		int m=2,n=2;
		int[][] Arr1 = new int[m][n];
		int[][] Arr2 = new int[m][n];
		int[][] Sum = new int[m][n];
		
		
	
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
		 for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	               Sum[i][j] = Arr1[i][j] + Arr2[i][j];
	            }
	           
	        }
		 
		 for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	               System.out.println(Sum[i][j]);
	            }
	           
	        }


		 
	}

}
