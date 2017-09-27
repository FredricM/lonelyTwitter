/*
 * NormalTweet
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
 * Represents a normal tweet
 *
 * @author Fredric Mendi
 * @version 1.5
 * @see Tweet
 * @since 1.0
 *
 */
public class NormalTweet extends Tweet {

    /**
     * Set a normal message
     *
     * @param message normal tweet message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Set a normal message with a date
     *
     * @param message normal tweet message
     * @param date normal tweet message date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }


    /**
     * Figure out if tweet is important
     *
     * @return boolean true of false
     * @see Tweet
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
