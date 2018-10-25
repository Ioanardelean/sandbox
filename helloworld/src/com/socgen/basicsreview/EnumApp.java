package com.socgen.basicsreview;

public class EnumApp {

    public static void main(String[] args) {

	CardinalPoint[] points = CardinalPoint.values();
	for (CardinalPoint cardinalPoint : points) {
	    System.out.println(cardinalPoint + " hot " + cardinalPoint.isHot() + " , preferd sport= "
		    + cardinalPoint.getPreferdSport());

	}
    }

}
