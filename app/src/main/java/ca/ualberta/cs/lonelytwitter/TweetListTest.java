package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Fredric on 2017-10-11.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my test");

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));

    }


    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my test");

        tweets.addTweet(myTweet);
        tweets.deleteTweet(myTweet);
        assertFalse(tweets.hasTweet(myTweet));

    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my test");

        assertFalse(tweets.hasTweet(myTweet));

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));

    }

    public void testGetTweet(){
        // getTweet method will take an idenx and will return the tweet at that index
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my test");
        tweets.addTweet(myTweet);

        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), myTweet.getMessage());
        assertEquals(returnedTweet.getDate(), myTweet.getDate());
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my test");
        Tweet myTweet1 = new NormalTweet("my test");




        assertEquals(tweets.getCount(), 0 );
        tweets.addTweet(myTweet);
        assertEquals(tweets.getCount(), 1);
        tweets.addTweet(myTweet1);
        assertEquals(tweets.getCount(), 2);
        tweets.deleteTweet(myTweet);
        assertEquals(tweets.getCount(), 1);


    }

}
