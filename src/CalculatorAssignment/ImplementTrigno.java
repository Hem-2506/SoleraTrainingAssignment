package CalculatorAssignment;

public class ImplementTrigno implements Trigno {

	public double sin(double x) {
		// TODO Auto-generated method stub
		return (Math.sin(Math.toRadians(x)));
	}

	public double cosec(double x) {
		// TODO Auto-generated method stub
		return (1/Math.sin(Math.toRadians(x)));
	}

	public double cos(double x) {
		// TODO Auto-generated method stub
		return Math.cos(Math.toRadians(x));
	}

	public double sec(double x) {
		// TODO Auto-generated method stub
		return (1/Math.cos(Math.toRadians(x)));
	}

	public double tan(double x) {
		// TODO Auto-generated method stub
		return Math.tan(Math.toRadians(x));
	}

	public double cot(double x) {
		// TODO Auto-generated method stub
		return (1/Math.tan(Math.toRadians(x)));
	}
	

	
}
