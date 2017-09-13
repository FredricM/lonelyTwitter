package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by fmendi on 9/12/17.
 */

public abstract class CurrentMood {
    private String mood;
    private Date date;

    // default date.
    public CurrentMood() {
        this.date = new Date();
    }

    // constructor that takes date
    public CurrentMood(Date date) {
        this.date = date;
    }

    public abstract String whatMood();

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
