package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by fmendi on 9/12/17.
 */

public class HappyMood extends CurrentMood{

    public HappyMood() {
        super();
    }

    public HappyMood(String mood, Date date) {
        super(date);
    }

    @Override
    public String whatMood(){
        setMood("Happy");
        return getMood();
    }


}
