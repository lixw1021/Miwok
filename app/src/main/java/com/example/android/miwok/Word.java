package com.example.android.miwok;

/**
 * Created by xianwei li on 8/7/2017.
 */

public class Word {
    private String miwokWord;
    private String defaultWord;

    public Word(String miwokWord, String defaultWord) {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public String getDefaultWord() {
        return defaultWord;
    }
}
