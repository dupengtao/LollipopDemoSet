package com.dpt.demos.transition;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.dpt.demos.R;

/**
 * Created by dupengtao on 15-1-21.
 */
public class TwoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        TextView textView = (TextView) findViewById(R.id.two_title);
        textView.setText("植物大战僵尸2");
    }

    public void back1(View view){
        finishAfterTransition();
    }
}
