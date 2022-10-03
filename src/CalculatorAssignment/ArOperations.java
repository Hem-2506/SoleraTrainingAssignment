package CalculatorAssignment;
import java.util.List;

public class ArOperations {
	ArithOverrid ad=new ArithOverrid();
    public double arith(List<String> arr ) {
    	double res = 0;
        for (int i = 1; i < arr.size() - 1; i = i + 2) {
            int counter = 0;
            counter = i;
            double res1 = 0;
            double num1 = 0;
            double num2 = 0;
            double num3 = 0;
            if (i == 1) {
                 num1 = Double.parseDouble(arr.get(counter - 1));
                 num2 = Double.parseDouble(arr.get(counter + 1));
                if (arr.get(i).equals("+")) {
                    res1 =ad.add(num1,num2);
                } else if (arr.get(i).equals("-")) {
                    res1 = ad.sub(num1,num2);
                } else if (arr.get(i).equals("*")) {
                    res1 = ad.mul(num1, num2);
                } else if (arr.get(i).equals("/")) {
                    res1 = ad.div(num1, num2);
                }
                else if (arr.get(i).equals("%")) {
                    res1 = ad.mod(num1, num2);
                }
                res += res1;
            } else {

                num3 = Double.parseDouble(arr.get(counter + 1));
                if (arr.get(i).equals("+")) {
                    res =ad.add(res,num3);
                } else if (arr.get(i).equals("-")) {
                    res =ad.sub(res,num3);
                } else if (arr.get(i).equals("*")) {
                	res =ad.mul(res,num3);
                } else if (arr.get(i).equals("/")) {
                	res =ad.div(res,num3);
                }else if (arr.get(i).equals("%")) {
                	res =ad.mod(res,num3);
                }
                res += res1;
            }
//       if(arr[i].equals("+") || arr[i].equals("*") || arr[i].equals("-")|| arr[i].equals("/")) {
//          int num1 = Integer.parseInt(arr[counter-1]);
//          int num2 = Integer.parseInt(arr[counter+1]);
//
//       }
        }
        return res;
}
}
