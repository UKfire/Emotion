##Emotion
帮你快速集成Android表情键盘，让你的应用不止文字，让表情跳动起来
##It looks Cool

![emotion](http://115.29.113.234:8080/yy/emotion.png)

##Usage
Download ZIP，然后解压，将emoji包添加到自己的项目中，然后再Project Structure设置你app的dependiences，点击＋号module dependency将emoji添加进来，接下来你就能在项目中快速集成表情键盘了。
##Sample
先在需要使用表情键盘的xml文件中声明，把它放在最底部，当然该布局文件还需要一个AppcompatEditText来支撑文字和表情输入呀～

	<com.ytying.emoji.SmileLayout
        android:id="@+id/write_smile_panel"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:visibility="visible"></com.ytying.emoji.SmileLayout>      

然后在Activity中，

		AppCompatEditText editText = (AppCompatEditText) findViewById(R.id.blogEditText);
		
        SmileLayout smileLayout = (SmileLayout) findViewById(R.id.write_smile_panel);

        smileLayout.setVisibility(View.GONE);

        //!!!初始化，这句话一定要加
        smileLayout.init(editText);

		//点击表情后弹出表情键盘并隐藏输入法键盘
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
       
       	//点击edittext后弹出输入法键盘并隐藏表情键盘
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smileLayout.setVisibility(View.GONE);
                showKeyboard();
            }
        });    
        
其中的hideKeyBoard方法和showKeyBoard方法如下：
      

	
    /**
     * 隐藏键盘
     */
    public void hideKeyBoard() {
        if (getWindow().getAttributes().softInputMode != 		WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN) {
            if (getCurrentFocus() != null) {
                InputMethodManager manager = (InputMethodManager) 					getSystemService(Context.INPUT_METHOD_SERVICE);
                											manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 			InputMethodManager.HIDE_NOT_ALWAYS);
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
        InputMethodManager inputManager = (InputMethodManager) 		editText.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.showSoftInput(editText, 0);
    }
  
##写在最后
二珂女神镇楼

欢迎大家访问我的主页[二可](http://www.ytying.com)

![pullToRefresh](http://115.29.113.234:8080/yy/8.jpg)
