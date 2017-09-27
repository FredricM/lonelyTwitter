
/*
 * Tweetable
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
 * Interface for a tweet get message and date methods
 *
 * @author Fredric Mendi
 * @version 1.5
 * @see Tweet
 * @since 1.0
 */
public interface Tweetable {
    String getMessage();
    Date getDate();

}
