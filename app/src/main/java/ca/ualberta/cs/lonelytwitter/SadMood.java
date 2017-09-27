
/*
 * SadMood
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
 * Represents a sad mood for a tweet
 *
 * @author Fredric Mendi
 * @version 1.5
 * @see CurrentMood
 * @since 1.0
 */
public class SadMood extends CurrentMood {

    /**
     * Construct a sad mood
     *
     * @param mood sad mood
     */
    public SadMood(String mood) {
        super();
    }

    /**
     * Construct a sad mood with a date
     *
     * @param date date for a sad mood
     */
    public SadMood(Date date) {
        super(date);
    }

    /**
     * Set the current mood to sad
     *
     * @return sad mood
     */
    @Override
    public String whatMood(){
        setMood("Sad");
        return getMood();
    }
}
