package com.dpt.demos.transition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.dpt.demos.R;

/**
 * Created by dupengtao on 15-1-21.
 */
public class OneActivity extends Activity {

    private ImageView imageView;
    private TextView textView;
    private View itemBox;
    private View testview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        imageView = (ImageView) findViewById(R.id.one_icon);
        textView = (TextView) findViewById(R.id.one_title);
        itemBox = findViewById(R.id.itemBox);
        testview = findViewById(R.id.one_testview);
    }


    public void install(View v){
        animateActivity(imageView,textView);
    }

    public void animateActivity(View v1,View v2){
        Intent i = new Intent(this, TwoActivity.class);
        //i.putExtra("itemName","Customize Activity Transitions");
        ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(this, Pair.create(v1, "icon"),Pair.create(v2, "title"));
        ActivityCompat.startActivity(this, i, transitionActivityOptions.toBundle());
    }

    public void animateActivity(View v1){
        Intent i = new Intent(this, TwoActivity.class);
        //i.putExtra("itemName","Customize Activity Transitions");
        ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(this, Pair.create(v1, "test"));
        ActivityCompat.startActivity(this, i, transitionActivityOptions.toBundle());
    }
}
