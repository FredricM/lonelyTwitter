
/*
 * CurrentMood
 *
 * Version 1.0
 *
 * September 26, 2017
 *
 * Copyright 2017 Fredric Mendi CMPUT 301 University of Alberta. All rights reserved.
 * You may use, distribute or modify this code under terms and conditions of the code of Student Behavior at you may fnd a copy of the licence in this project. Otherwise please contact contact@abc
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a mood for the tweet
 *
 * @author Fredric Mendi
 * @version 1.5
 * @see HappyMood
 * @see SadMood
 * @since 1.0
 *
 */
public abstract class CurrentMood {
    private String mood;
    private Date date;

    /**
     * Construct a mood with default date
     */
    public CurrentMood() {
        this.date = new Date();
    }

    /**
     * Construct a mood with a set date
     *
     * @param date date for mood
     */
    public CurrentMood(Date date) {
        this.date = date;
    }

    /**
     * Finds current mood
     *
     * @see HappyMood
     * @see SadMood
     */
    public abstract String whatMood();

    /**
     * Return the mood
     *
     * @return mood
     */
    public String getMood() {
        return mood;
    }

    /**
     * Set the mood for a tweet
     *
     * @param mood mood for the tweet
     */
    public void setMood(String mood) {
        this.mood = mood;
    }

    /**
     * Return the date of the mood
     *
     * @return date of the mood
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the date of the mood
     *
     * @param date date of mood
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
