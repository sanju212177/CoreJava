package com.capgemini.Assignment;

public abstract class MediaItem extends Item {
	private int runtime;

    public MediaItem(int uniqueId, String title, int copies, int runtime) {
        super(uniqueId,title,copies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}
