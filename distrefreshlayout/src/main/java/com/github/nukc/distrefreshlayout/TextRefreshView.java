package com.github.nukc.distrefreshlayout;

import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by C on 16/8/25.
 */
public class TextRefreshView extends FrameLayout {

    private TextView mTextView;

    public TextRefreshView(Context context) {
        super(context);

        mTextView = new TextView(context);
        LayoutParams layoutParams = new LayoutParams(
                LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER);
        addView(mTextView, layoutParams);
    }

    public void start() {
        mTextView.setText("正在加载");
    }

    public void stop() {
        mTextView.setText("");
    }

    public void onPulling(float scrollTop) {
        if (scrollTop < getHeight()) {
            mTextView.setText("下拉刷新");
        } else {
            mTextView.setText("松开刷新");
        }
    }

}
