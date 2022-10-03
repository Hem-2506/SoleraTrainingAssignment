package CalculatorAssignment;

import java.util.Scanner;

public class Arithmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithOverrid arith=new ArithOverrid();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please keep a space between operands and Operator");
		String exp;
		while(true) {
			exp=sc.nextLine();
			if(exp.charAt(0)=='+' |exp.charAt(0)=='-'|exp.charAt(0)=='*'|exp.charAt(0)=='/'|exp.charAt(0)=='%') {
				System.out.println("invalid expresion! enter it again..");
				continue;
			}
			else
				break;
		}
		
//		ExceptionHan exh=new ExceptionHan();
//		exh.invalidexp(exp);
		
		ListFormation lf=new ListFormation();
		System.out.println(lf.listf(exp));

	}

}
