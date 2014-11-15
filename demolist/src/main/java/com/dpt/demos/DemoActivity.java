package com.dpt.demos;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.dpt.demos.adapter.DemoListAdapter;

import java.util.ArrayList;
import java.util.List;


public class DemoActivity extends Activity {

    private RecyclerView mRvList;
    private LinearLayoutManager mLinearLayoutManager;
    private DemoListAdapter mDemoListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        initView();
    }

    private void initView() {
        mRvList=(RecyclerView)findViewById(R.id.rv_list);
        mRvList.setHasFixedSize(true);
        mLinearLayoutManager = new LinearLayoutManager(this);
        //mLinearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRvList.setLayoutManager(mLinearLayoutManager);
        List<String> items= new ArrayList<String>();
        for(int i=0;i<100;i++){
            items.add("item_"+i);
        }
        mDemoListAdapter = new DemoListAdapter(items);
        mRvList.setAdapter(mDemoListAdapter);

        mDemoListAdapter.setItemClickListener(new DemoListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(DemoActivity.this,String.valueOf(position),Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(DemoActivity.this, com.example.android.lnotifications.LNotificationActivity.class);
                //DemoActivity.this.startActivity(intent);
            }
        });


        //com.example.android.lnotifications
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
