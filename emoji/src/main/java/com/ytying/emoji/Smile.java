package com.ytying.emoji;

/**
 * Created by UKfire on 16/3/14.
 */
public class Smile {

    private int resId;
    private String tag;

    public Smile(int resId,String tag){
        this.resId = resId;
        this.tag = tag;
    }

    public int getResId(){
        return this.resId;
    }

    public void setResId(int resId){
        this.resId = resId;
    }

    public String getTag(){
        return this.tag;
    }
}
