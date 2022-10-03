package Assignment3;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    Student[] arr;
    arr = new Student[n];
    
    for(int i=0; i<n; i++) {
    	int id = sc.nextInt();
        String fname = sc.next();
        double cgpa = sc.nextDouble();
        arr[i] = new Student(id, fname, cgpa);
    }
	}

}
