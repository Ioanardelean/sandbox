package com.socgen.basicsreview;

public class Application {

    private static void compare() {
	boolean cond = 10 < 0;
	if (cond) {
	    System.out.println("10 is not less than 0");
	} else {
	    System.out.println("10 is greater then 0");
	}

	int value = 10;
	if (value == 0) {
	    System.out.println("value equals 0");
	} else if (value == 5) {
	    System.out.println("value equals 5");
	} else {
	    System.out.println("value equals " + value);
	}
    }

//    private static void autoboxing() {
//	int value = 21;
//	Integer boxed = Integer.valueOf(value);
//	Integer autoBoxed = value;
//
//	int age = Integer.valueOf(32);
//
//	Integer boxedValue = null;
//	int unboxedValue = boxedValue;
//	System.out.println(unboxedValue);

    // }

//    private static void compare() {
//	boolean cond = 10 < 0;
//	System.out.println(cond);
//	System.out.println(10 > 0);
//	System.out.println(10 == 0);
//	System.out.println(10 <= 0);
//	System.out.println(10 >= 0);
//	System.out.println(10 != 0);
//
//    }

    public static void main(String[] args) {

//	String majorityStr = args[0];
//	Integer majority = Integer.valueOf(majorityStr);
//	int maj = majority.intValue();
//	System.out.println("Majority=" + maj);

	String ioanaFirstname = args[0];
	String ioanaLastname = args[1];

	String marcusFirstname = args[2];
	String marcusLastname = args[3];
	String marcusAge = args[4];
	Integer age = Integer.valueOf(marcusAge);

	Person ioana = new Person(args[0], ioanaLastname);
	Person marcus = new Person(args[2], args[3], age.intValue());

	System.out.println(ioana);
	System.out.println(marcus);

	compare();
	// autoboxing();
	sum(12);
    }

    private static void sum(double... args) {
	double total = 0.0;
	for (double d : args) {
	    total += d;
	}
	System.out.println(total);
    }
}
