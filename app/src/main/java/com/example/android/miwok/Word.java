package com.example.android.miwok;

/**
 * Created by xianwei li on 8/7/2017.
 */

public class Word {
    private String miwokWord;
    private String defaultWord;
    private int imageResourceId;

    public Word(String miwokWord, String defaultWord) {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
    }

    public Word(String miwokWord, String defaultWord, int imageResourceId) {
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
}
