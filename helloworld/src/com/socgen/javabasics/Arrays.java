package com.socgen.javabasics;

public class Arrays {
    public static void main(String[] args) {
	int[] ints = new int[10];
	ints[3] = 5;
	System.out.println(ints[3]);
	//

	boolean[] booleans = new boolean[10];
	System.out.println(booleans[3]);
	booleans[3] = true;
	System.out.println(booleans[3]);

	for (int i = 0; i < booleans.length; i++) {
	    System.out.println("index" + i + ", value=" + booleans[i]);
	}

	// test
	String str = "ABCDEFGHIJ";
	char tab[] = str.toCharArray();

	for (int i = 0; i < tab.length; i++) {
	    System.out.println(tab[i]);
	}

	tab[0] = 'J';
	tab[9] = 'Z';
	for (int i = tab.length - 1; i >= 0; i--) {
	    System.out.println(tab[i] + " ");
	}
    }
}
