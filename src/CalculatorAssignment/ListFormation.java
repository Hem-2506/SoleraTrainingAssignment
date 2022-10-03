package CalculatorAssignment;
import java.util.ArrayList;
import java.util.List;


public class ListFormation {
public double listf(String exp) {
		
		String s[] = exp.split(" ");
		List<String> l=new ArrayList<>();
        //object of ImplementTrigno and ImplementSci
		ImplementSci imps=new ImplementSci();
		ImplementTrigno impt=new ImplementTrigno();
		System.out.println("++++++++++++++++++++++++++++");
        for(int i=0;i<s.length;i++) {
        	
            if (s[i].equals("abs")) {
                l.add(String.valueOf(imps.absolute(Double.parseDouble(s[i + 1]))));
                i = i + 1;
            }
            else if(s[i].equals("sqrt")){
                l.add(String.valueOf(imps.squart(Double.parseDouble(s[i + 1]))));
                i = i + 1;
            }
            else if(s[i].equals("sqr")){
                l.add(String.valueOf(imps.square(Double.parseDouble(s[i + 1]))));
                i = i + 1;
                }
            else if(s[i].equals("log")){
                l.add(String.valueOf(imps.log(Double.parseDouble(s[i + 1]))));
                i = i + 1;
                }
            else if(s[i].equals("sin")){
                l.add(String.valueOf(impt.sin(Double.parseDouble(s[i + 1]))));
                i = i+1;
            }
            else if(s[i].equals("cos")){
                l.add(String.valueOf(impt.cos(Double.parseDouble(s[i + 1]))));
                i = i+1;
            }
            else if(s[i].equals("tan")){
                l.add(String.valueOf(impt.tan(Double.parseDouble(s[i + 1]))));
                i = i+1;
            }
            else if(s[i].equals("cot")){
                l.add(String.valueOf(impt.cot(Double.parseDouble(s[i + 1]))));
                i = i+1;
            }
            else if(s[i].equals("cosec")){
                l.add(String.valueOf(impt.cosec(Double.parseDouble(s[i + 1]))));
                i = i+1;
            }
            else if(s[i].equals("sec")){
                l.add(String.valueOf(impt.sec(Double.parseDouble(s[i + 1]))));
                i = i+1;
            }
            else
                l.add(s[i]);
        }
		
		ArOperations ao=new ArOperations();
		return (ao.arith(l));
	}
}
