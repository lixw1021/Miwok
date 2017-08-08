package com.example.android.miwok;

/**
 * Created by xianwei li on 8/7/2017.
 */

public class Word {
    private String miwokWord;
    private String defaultWord;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultWord, String miwokWord) {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
    }

    public Word(String defaultWord, String miwokWord, int imageResourceId) {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
        this.imageResourceId = imageResourceId;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public String getDefaultWord() {
        return defaultWord;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
