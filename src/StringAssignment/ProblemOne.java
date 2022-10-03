package StringAssignment;

import java.util.Scanner;

public class ProblemOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	         System.out.println("enter the string");
	         String str =sc.next();
	          if(str.matches("[0-9]+"))
	                 System.out.println("It contains  digit only.");
	             else if(str.matches("[a-z]+") | str.matches("[A-Z]"))
	                 System.out.println("It contains  String only");
	             else
	                 System.out.println("It contains String as well as digit");  

	}

}
