package com.dpt.demos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

/**
 * Created by dupengtao on 14-11-17.
 */
public class DetailInfo extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_detail);
        TextView tv = (TextView) findViewById(R.id.tv_demo_detail_name);
        tv.setText(getIntent().getStringExtra("itemName"));
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAfterTransition();
            }
        });

        ImageView iv = (ImageView) findViewById(R.id.iv_demo_detail);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        GridView gridView=(GridView)findViewById(R.id.gv);
        gridView.setNumColumns(3);
        gridView.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 200;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                TextView tv = new TextView(DetailInfo.this);
                tv.setText("view");
                return tv;
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
