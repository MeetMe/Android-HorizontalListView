package com.meetme.android.horizontallistview.sample;

/** This is just a simple class for holding data that is used to render our custom view */
public class CustomData {
    private int mBackgroundColor;
    private String mText;

    public CustomData(int backgroundColor, String text) {
        mBackgroundColor = backgroundColor;
        mText = text;
    }

    /**
     * @return the backgroundColor
     */
    public int getBackgroundColor() {
        return mBackgroundColor;
    }

    /**
     * @return the text
     */
    public String getText() {
        return mText;
    }
}
