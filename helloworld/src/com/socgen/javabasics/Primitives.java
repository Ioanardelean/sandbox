package com.socgen.javabasics;

public class Primitives {
    public static void main(String[] args) {
	// constructor;cod client
	Calculator calc2 = new Calculator(5, 5);

	double result = calc2.multiply();
	System.out.println(result);
	System.out.println(calc2.add());
	System.out.println(calc2.divide());
	System.out.println(calc2.substract());

    }

}
