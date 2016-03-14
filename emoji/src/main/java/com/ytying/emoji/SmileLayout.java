package com.ytying.emoji;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UKfire on 16/3/14.
 */
public class SmileLayout extends RelativeLayout {

    private int EMITION_BOARD_HEIGHT = getResources().getDimensionPixelOffset(R.dimen.smile_board_height);
    private List<Smile> smileList;

    private int ROW_COUNT = 3;
    private int COLUMN_COUNT = 6;
    private int totalSmileCount;
    private int pageCount;

    private DotGroup dotGroup;
    private ViewPager viewPager;
    private AppCompatEditText blogEditText;


    public SmileLayout(Context context) {
        super(context);
    }

    public SmileLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SmileLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void init(AppCompatEditText blogEditText) {

        smileList = SmileManager.getSmileList();
        totalSmileCount = smileList.size();
        pageCount = totalSmileCount / (ROW_COUNT * COLUMN_COUNT) + 1;


        this.blogEditText = blogEditText;
        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        LayoutInflater.from(getContext()).inflate(R.layout.cpnt_emotionl, this);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        dotGroup = (DotGroup) findViewById(R.id.dotGroup);
        viewPager.setId("vp".hashCode());
        viewPager.setAdapter(mPagerAdapter);
        viewPager.setOffscreenPageLimit(pageCount);
        dotGroup.init(pageCount);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int arg0) {
                dotGroup.setCurrentItem(arg0);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }

    public ViewPager getViewPager() {
        return viewPager;
    }


    AdapterView.OnItemClickListener onEmotionClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Smile bean = (Smile) view.getTag();
            String str = bean.getTag();
            if (str.equals("cancel")) {
                //获取光标当前位置
                int index = blogEditText.getSelectionStart();
                Editable editable = blogEditText.getText();
                if (index == 0) {
                } else if (index > 10) {
                    if (editable.subSequence(index - 4, index).toString().equals("[/e]"))
                        editable.delete(index - 11, index);
                    else
                        editable.delete(index - 1, index);
                } else {
                    editable.delete(index - 1, index);
                }
            } else {
                blogEditText.getEditableText().insert(blogEditText.getSelectionStart(), str);
                int postion = blogEditText.getSelectionStart();
                blogEditText.setText(StringUtil.stringToSpannableString(blogEditText.getText().toString(), getContext()));
                blogEditText.setSelection(postion);
            }
        }
    };

    // ViewPager的适配器
    PagerAdapter mPagerAdapter = new PagerAdapter() {

        @Override
        public View instantiateItem(ViewGroup container, int position) {

            // 填充resList,作为图片数据;
            List<Smile> pageSmileList = new ArrayList<>();

            for (int i = ROW_COUNT * COLUMN_COUNT * position; i < ROW_COUNT * COLUMN_COUNT * (position + 1) - 1; i++) {
                if (i >= totalSmileCount)
                    break;
                pageSmileList.add(smileList.get(i));
            }
            pageSmileList.add(new Smile(R.drawable.icon_delete_normal, "cancel"));

            GridView gridview = new GridView(getContext());
            gridview.setNumColumns(COLUMN_COUNT);
            gridview.setAdapter(new EmotionGridAdapter(getContext(), pageSmileList));
            gridview.setOnItemClickListener(onEmotionClickListener);
            container.addView(gridview, LayoutParams.MATCH_PARENT, EMITION_BOARD_HEIGHT);
            return gridview;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public int getCount() {
            return pageCount;
        }
    };


}
