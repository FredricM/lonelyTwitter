/*
 * Tweet
 *
 * Version 1.0
 *
 * September 26, 2017
 *
 * Copyright 2017 Fredric Mendi CMPUT 301 University of Alberta. All rights reserved.
 * You may use, distribute or modify this code under terms and conditions of the Code of Student Behavior
 * at you may find a copy of the licence in this project. Otherwise please contact contact@abc.ac
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet
 *
 * @author Fredric Mendi
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet {

    private String message;
    private Date date;


    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();

    }

    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message,Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Finds if the tweet is important
     *
     * @see NormalTweet
     * @see ImportantTweet
     */
    public abstract Boolean isImportant();

    /**
     * Sets tweet message
     *
     * @param message Tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140 ){
            throw new TweetTooLongException();
        }else{
            this.message = message;
        }
    }

    /**
     * get a tweet message
     *
     * @return return message
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * get the date of tweet
     *
     * @return return date value
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the tweet date
     *
     * @param date date of tweet
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Convert message and date into string
     *
     * @return returns date(string form) and message
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
