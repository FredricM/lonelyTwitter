package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by fmendi on 9/12/17.
 */

public class SadMood extends CurrentMood {

    public SadMood(String mood) {
        super();
    }

    public SadMood(Date date) {
        super(date);
    }

    @Override
    public String whatMood(){
        setMood("Sad");
        return getMood();
    }
}
