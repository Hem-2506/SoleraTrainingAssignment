package StringAssignment;
import java.lang.reflect.Array;
import java.util.*;

public class ProblemFour {
	
	public static String recursiveReverse(char []str)
	 {
	   Stack<Character> st = new Stack<>();
	   for(int i=0; i<str.length; i++)
	        st.push(str[i]);
	 
	   for (int i=0; i<str.length; i++) {
	    str[i] = st.peek();
	    st.pop();
	   }    
	   return String.valueOf(str);// converting character array to string
	 }
	
	public static char[] stringReverse(String str)
	{
	    
		int n = str.length();
	     char []ch = str.toCharArray();
	     char temp;
	 
	     // Swap character starting from two
	     // corners
	     for (int i=0, j=n-1; i<j; i++,j--)
	     {
	         temp = ch[i];
	         ch[i] = ch[j];
	         ch[j] = temp;
	     }
	         
	      
	    
	    return ch ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	         System.out.println("enter the string");
	         String str =sc.next();
	         
	         str = recursiveReverse(str.toCharArray());// passing character array as parameter
	         char ch[] = stringReverse(str);
	         System.out.println(str);
	}

}
