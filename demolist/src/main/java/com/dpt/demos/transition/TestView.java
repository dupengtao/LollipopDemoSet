package com.dpt.demos.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by dupengtao on 15-1-21.
 */
public class TestView extends TextView{
    private static final String TAG="TestView";
    private TextPaint paint;
    private int onDrawTimes=0;
    public TestView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = getPaint();
    }

    public TestView(Context context) {
        super(context);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.e(TAG,"onLayout");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e(TAG,"onMeasure");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e(TAG,"onDraw --onDrawTimes--"+this.toString());
    }


}
