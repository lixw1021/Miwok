package com.example.android.miwok;

/**
 * Created by xianwei li on 8/7/2017.
 */

public class Word {
    private String miwokWord;
    private String defaultWord;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int audioResourceId;

    public Word(String defaultWord, String miwokWord, int audioResourceId) {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
        this.audioResourceId = audioResourceId;
    }

    public Word(String defaultWord, String miwokWord, int imageResourceId,int audioResourceId) {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
        this.imageResourceId = imageResourceId;
        this.audioResourceId = audioResourceId;
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

    public int getAudioResourceId() {
        return audioResourceId;
    }
}
