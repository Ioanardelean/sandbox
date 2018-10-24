package com.socgen.javabasics;

public class Stringr {

    public static void main(String[] args) {
	StringBuffer buff = new StringBuffer();
	buff.append("hell");
	buff.append(" World!");
	buff.insert(4, "o");
	System.out.println(buff);

    }

}