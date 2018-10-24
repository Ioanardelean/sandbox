package com.socgen.javabasics;

/**
 * 
 * @author Administrateur
 *
 */
public class Calculator {
    /**
     * this variable provides.
     */
    private double a;
    private double b;

    /**
     * This constructor
     * 
     * @param a operand a
     */
    public Calculator(double a, double b) {
	this.a = a;
	this.b = b;
    }

    /**
     * method
     * 
     * @return a+b
     */
    public double add() {
	return a + b;

    }

    public double substract() {
	return a - b;
    }

    public double multiply() {
	return a * b;
    }

    public double divide() {
	return a / b;
    }
}
