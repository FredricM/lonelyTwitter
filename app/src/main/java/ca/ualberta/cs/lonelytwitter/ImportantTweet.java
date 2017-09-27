/*
 * ImportantTweet
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
 * Represents an important tweet
 *
 * * @author Fredric Mendi
 * @version 1.5
 * @see Tweet
 * @since 1.0
 */
public class ImportantTweet extends Tweet implements Tweetable{

    /**
     * construct an important tweet message
     *
     * @param message important tweet message
     */
    public ImportantTweet(String message){
        //gets parent
        super(message);

    }

    /**
     * construct an important tweet message with a set date
     *
     * @param message important tweet message
     * @param date important tweet message date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Finds if it is a important tweet
     *
     * @return boolean true or false
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
