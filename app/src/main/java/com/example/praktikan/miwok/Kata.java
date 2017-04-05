package com.example.praktikan.miwok;

/**
 * Created by Praktikan on 21/02/2017.
 */
public class Kata {
    private String mMiwokWord;
    private String mDefaultWord;
    private int mImageResource;


    public Kata(String miwokWord, String defaultWord) {
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
    }

    @Override
    public String toString() {
        return getMiwokWord() + " " + getDefaultWord();
    }

    public Kata(String miwokWord, String defaultWord, int imageResource) {
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
        mImageResource = imageResource;
    }

    public String getMiwokWord() {

        return mMiwokWord;
    }

    public String getDefaultWord() {

        return mDefaultWord;
    }

    public int getImageResource() {
        return mImageResource;
    }

}


