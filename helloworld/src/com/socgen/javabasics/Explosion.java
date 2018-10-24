package com.socgen.javabasics;

public class Explosion {

    public static void main(String[] args) {
	String explosion = "Explosion";
	char[] exploded = explosion.toCharArray();
	for (int i = 0; i < exploded.length; i++)
	    System.out.println(exploded[i]);
    }
}