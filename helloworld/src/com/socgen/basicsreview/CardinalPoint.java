package com.socgen.basicsreview;

public enum CardinalPoint {

    NORTH(false) {
	@Override
	public String getPreferdSport() {

	    return "Ski";
	}
    },
    SOUTH(true) {
	@Override
	public String getPreferdSport() {

	    return "Rugby";
	}
    },
    EAST(false) {
	@Override
	public String getPreferdSport() {

	    return "judo";
	}
    },
    WEST(true) {
	@Override
	public String getPreferdSport() {

	    return "Rodeo";
	}
    };

    private boolean hot = false;

    private CardinalPoint(boolean hot) {
	this.hot = hot;

    }

    public boolean isHot() {
	return hot;
    }

    // constant-specific method
    public abstract String getPreferdSport();

}
