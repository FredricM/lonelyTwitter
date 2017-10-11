package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;

/**
 * Created by Fredric on 2017-10-11.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    // add tweet to a list of tweets
    public void addTweet(Tweet tweet){
        tweets.add(tweet);
    }

    // delete the tweet from a lsit of tweets
    public void deleteTweet(Tweet tweet){
        tweets.remove(tweet);

    }

    // check if a list of tweets has the specified tweet
    // if it does, return true, otherwise return false
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public int getCount(){
        return tweets.size();
    }
}
