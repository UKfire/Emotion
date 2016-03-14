package com.ytying.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by UKfire on 15/11/22.
 */
public class DotGroup extends LinearLayout {

    private int unchooseResId;
    private int chooseResId;
    private int pageCount;

    public DotGroup(Context context) {
        super(context);
    }

    public DotGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void init(int pageCount,int currentPage,int dotHight,int unchooseResId,int chooseResId){
        this.removeAllViews();
        this.setOrientation(LinearLayout.HORIZONTAL);
        this.setGravity(Gravity.CENTER_VERTICAL);
        this.unchooseResId = unchooseResId;
        this.chooseResId = chooseResId;
        this.pageCount = pageCount;
        for(int i = 0;i < pageCount;i ++){
            ImageView ivDot = new ImageView(getContext());
            ivDot.setPadding(0,0,dotHight,0);
            this.addView(ivDot,dotHight*2,dotHight);
        }
        setCurrentItem(currentPage);
    }

    public void init(int pageCount){
        init(pageCount,0, 15, R.drawable.cirle_dot_gray5,R.drawable.circle_dot_gray4);
    }

    public void setCurrentItem(int currentPage) {
        for(int i = 0;i < pageCount;i ++){
            ImageView iv = (ImageView) this.getChildAt(i);
            if(i == currentPage)
                iv.setImageResource(chooseResId);
            else
                iv.setImageResource(unchooseResId);
        }
    }

}
