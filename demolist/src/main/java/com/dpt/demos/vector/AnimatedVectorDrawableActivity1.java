package com.dpt.demos.vector;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.dpt.demos.R;

/**
 * Created by dupengtao on 14-12-24.
 */
public class AnimatedVectorDrawableActivity1 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_1);

    }

    public void play(View v){
        ImageView iv = (ImageView)findViewById(R.id.iv);
        Drawable drawable = iv.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public void play2(View v){
        ImageView iv = (ImageView)findViewById(R.id.iv2);
        Drawable drawable = iv.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public void play3(View v){
        ImageView iv = (ImageView)findViewById(R.id.iv3);
        Drawable drawable = iv.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
