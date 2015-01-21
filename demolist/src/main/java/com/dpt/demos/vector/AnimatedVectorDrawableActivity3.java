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
public class AnimatedVectorDrawableActivity3 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_4);
    }

    public void play(View view){

        ImageView iv=(ImageView)findViewById(R.id.image);
        Drawable drawable = iv.getDrawable();
        if(drawable instanceof Animatable){
            ((Animatable) drawable).start();
        }
    }
}
