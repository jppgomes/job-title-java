package org.feefo.normaliser;

public class JobTitle {

    private String title;

    public JobTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title.toLowerCase();
    }
}
