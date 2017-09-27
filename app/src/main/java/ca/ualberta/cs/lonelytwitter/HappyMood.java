
/*
 * HappyMood
 *
 * Version 1.0
 *
 * Setember 26, 2017
 *
 * Copyright 2017 Fredric Mendi CMPUT 301 University of Alberta. All rights reserved.
 * You may use, distribute or modify this code under terms and conditions of the code of Student Behavior at you may fnd a copy of the licence in this project. Otherwise please contact contact@abc
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a happy mood for a tweet
 *
 * @author Fredric Mendi
 * @version 1.5
 * @see CurrentMood
 * @since 1.0
 */
public class HappyMood extends CurrentMood{

    /**
     * Construct a happy mood
     *
     */
    public HappyMood() {
        super();
    }

    /**
     * construct a happy mood with a date
     *
     * @param mood happy mood
     * @param date date set for mood
     */
    public HappyMood(String mood, Date date) {
        super(date);
    }

    /**
     * Set current mood to a happy mood
     *
     * @return Happy mood
     */
    @Override
    public String whatMood(){
        setMood("Happy");
        return getMood();
    }


}
