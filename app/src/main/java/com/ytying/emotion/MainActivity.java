package com.ytying.emotion;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.ytying.emoji.SmileLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView emoji;
    private SmileLayout smileLayout;
    private RelativeLayout llUp;
    private AppCompatEditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llUp = (RelativeLayout) findViewById(R.id.llUp);
        emoji = (ImageView) findViewById(R.id.emoji);


        editText = (AppCompatEditText) findViewById(R.id.blogEditText);
        smileLayout = (SmileLayout) findViewById(R.id.write_smile_panel);

        smileLayout.setVisibility(View.GONE);

        //!!!初始化，这句话一定要加
        smileLayout.init(editText);

        emoji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideKeyBoard();
                if (smileLayout.getVisibility() == View.GONE)
                    smileLayout.setVisibility(View.VISIBLE);
                else
                    smileLayout.setVisibility(View.GONE);
            }
        });
        llUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smileLayout.setVisibility(View.GONE);
                showKeyboard();
            }
        });
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smileLayout.setVisibility(View.GONE);
                showKeyboard();
            }
        });
    }


    /**
     * 隐藏键盘
     */
    public void hideKeyBoard() {
        if (getWindow().getAttributes().softInputMode != WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN) {
            if (getCurrentFocus() != null) {
                InputMethodManager manager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }
    }

    /**
     * 弹出键盘
     */
    public void showKeyboard() {
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        InputMethodManager inputManager = (InputMethodManager) editText.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.showSoftInput(editText, 0);
    }

}
