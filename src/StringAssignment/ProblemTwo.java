package StringAssignment;

import java.util.Scanner;

public class ProblemTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int arr[] = new int[26];

Scanner sc = new Scanner(System.in);
System.out.println("enter the string");
String str = sc.nextLine();


str = str.toUpperCase();
int number = 0;
for(int i=0; i<str.length(); i++) {
	char ch = str.charAt(i);
	
	// check if character is any of a, e, i, o, u
    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
      number = ch - 'A';
    }
	
	else if(ch <='A' && ch >='Z') {
		number = ch - 'A'; 
	}
    arr[number]++;
}

for(int i=0; i<26; i++) {
	int x = i + 'A';
	char ch = (char)x;
	
	// check if character is any of a, e, i, o, u
    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
      System.out.println(ch + " : "+ arr[i]);
    }
	
	else if(ch <='A' && ch >='Z') {
		System.out.println(ch + " : "+ arr[i]);
	}
    
}

	}

}
