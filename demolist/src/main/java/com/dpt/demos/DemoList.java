package com.dpt.demos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.dpt.demos.adapter.DemoListAdapter;
import com.example.android.lnotifications.LNotificationActivity;

import java.util.ArrayList;


public class DemoList extends Activity {

    private RecyclerView mRvList;
    private LinearLayoutManager mLinearLayoutManager;
    private DemoListAdapter mDemoListAdapter;
    private ArrayList<String> mItems;

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
        mItems= new ArrayList<String>();
        addItems();
        for(int i=0;i<100;i++){
            mItems.add("item_"+i);
        }
        mDemoListAdapter = new DemoListAdapter(mItems);
        mRvList.setAdapter(mDemoListAdapter);

        mDemoListAdapter.setItemClickListener(new DemoListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:{
                        openActivity(com.mikepenz.lollipopshowcase.MainActivity.class);
                    }break;
                    case 1:{
                        openActivity(com.example.android.elevationbasic.MainActivity.class);
                    }break;
                    case 2:{
                        openActivity(com.example.android.elevationdrag.MainActivity.class);
                    }break;
                    case 3:{
                        openActivity(com.example.android.clippingbasic.MainActivity.class);
                    }break;
                    case 4:{
                        openActivity(com.example.android.navigationdrawer.MainActivity.class);
                    }break;
                    case 5:{
                        openActivity(com.example.android.floatingactionbuttonbasic.MainActivity.class);
                    }break;
                    case 6:{
                        openActivity(com.example.android.revealeffectbasic.MainActivity.class);
                    }break;
                    case 7:{
                        openActivity(com.example.android.recyclerview.MainActivity.class);
                    }break;
                    case 8:{
                        openActivity(com.example.android.apprestrictionschema.MainActivity.class);
                    }break;
                    case 9:{
                        openActivity(LNotificationActivity.class);
                    }break;
                }
            }
        });
    }

    private void addItems() {
        mItems.add("LollipopShowcase");
        mItems.add("ElevationBasic");
        mItems.add("ElevationDrag");
        mItems.add("ClippingBasic");
        mItems.add("NavigationDrawer");
        mItems.add("FloatingActionButtonBasic");
        mItems.add("RevealEffectBasicSample");
        mItems.add("RecyclerView");
        mItems.add("AppRestrictionSchema");
        mItems.add("LNotification");
    }

    private void openActivity(Class clazz) {
        Intent intent = new Intent(this, clazz);
        this.startActivity(intent);
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
