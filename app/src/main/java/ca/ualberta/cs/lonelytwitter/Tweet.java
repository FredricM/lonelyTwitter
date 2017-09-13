package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by fmendi on 9/12/17.
 */

// class always has capital.
public abstract class Tweet {
    // uppercase latter words.
    // only things in this class can change with private
    private String message;
    private Date date;

    //doesnt exist unless constructor
    public Tweet(String message){
        // this takes the attribute of the class not the arugement.
        this.message = message;
        this.date = new Date(); //will just use current date if nothing given

    }

    public Tweet(String message,Date date) {
        this.message = message;
        this.date = date;
    }

    //lets the child classes their own implementation
    public abstract Boolean isImportant();

    //attributes, contructor, methods.
    // Can change a private attribute.  say it's going to throw an Exception.
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140 ){
            throw new TweetTooLongException();
        }else{
            this.message = message;
        }
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
