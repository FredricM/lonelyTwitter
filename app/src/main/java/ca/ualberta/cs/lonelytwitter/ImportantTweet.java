package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by fmendi on 9/12/17.
 */

//importantTweet has all Tweet has. One extend, as many implements as you want.
public class ImportantTweet extends Tweet implements Tweetable{

    public ImportantTweet(String message){
        //gets parent
        super(message);

    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    //makes sure we are overriding something (same spelling) probably overrides anyway
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
