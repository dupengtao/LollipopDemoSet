package com.dpt.demos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.*;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.dpt.demos.adapter.DemoAdapterItem;
import com.dpt.demos.adapter.DemoListAdapter;
import com.dpt.demos.overlay.OverlayTestActivity;
import com.dpt.demos.recyclerview.GridLayoutActivity1;
import com.dpt.demos.recyclerview.GridLayoutActivity2;
import com.dpt.demos.recyclerview.GridLayoutActivity3;
import com.dpt.demos.toolbar.ToolBarDemo;
import com.dpt.demos.toolbar.ToolBarDemo2;
import com.dpt.demos.toolbar.ToolBarDemo3;
import com.dpt.demos.toolbar.ToolBarDemo4;
import com.dpt.demos.transition.OneActivity;
import com.dpt.demos.vector.*;
import com.example.android.lnotifications.LNotificationActivity;

import java.util.ArrayList;


public class DemoList extends ActionBarActivity {

    private RecyclerView mRvList;
    private LinearLayoutManager mLinearLayoutManager;
    private DemoListAdapter mDemoListAdapter;
    private ArrayList<DemoAdapterItem> mItems;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        initView();
    }

    private void initView() {

        // Handle Toolbar
        mToolbar = (Toolbar) findViewById(R.id.tb_list);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        mRvList=(RecyclerView)findViewById(R.id.rv_list);
        mRvList.setHasFixedSize(true);
        mLinearLayoutManager = new LinearLayoutManager(this);
        mRvList.setItemAnimator(new DefaultItemAnimator());
        //mLinearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRvList.setLayoutManager(mLinearLayoutManager);
        mItems= new ArrayList<DemoAdapterItem>();
        addItems();
        for(int i=0;i<100;i++){
            mItems.add(new DemoAdapterItem("item_"+i,R.drawable.ic_launcher));
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
                        openActivity(com.example.android.cardview.CardViewActivity.class);
                    }break;
                    case 9:{
                        openActivity(com.example.android.drawabletinting.MainActivity.class);
                    }break;
                    case 10:{
                        openActivity(com.example.android.apprestrictionschema.MainActivity.class);
                    }break;
                    case 11:{
                        openActivity(LNotificationActivity.class);
                    }break;
                    case 12:{
                        openActivity(com.example.android.interpolator.MainActivity.class);
                    }break;
                    case 13:{
                        CardView cardView = (CardView) view;
                        cardView.setTransitionName("itemBox");
                        animateActivity(cardView,cardView.getChildAt(1));
                    }break;
                    case 14:{
                        openActivity(ToolBarDemo.class);
                    }break;
                    case 15:{
                        openActivity(ToolBarDemo2.class);
                    }break;
                    case 16:{
                        openActivity(ToolBarDemo3.class);
                    }break;
                    case 17:{
                        openActivity(ToolBarDemo4.class);
                    }break;
                    case 18:{
                        openActivity(GridLayoutActivity1.class);
                    }break;
                    case 19:{
                        openActivity(GridLayoutActivity2.class);
                    }break;
                    case 20:{
                        openActivity(GridLayoutActivity3.class);
                    }break;
                    case 21:{
                        openActivity(VectorActivity1.class);
                    }break;
                    case 22:{
                        openActivity(AnimatedVectorDrawableActivity1.class);
                    }break;
                    case 23:{
                        openActivity(AnimatedVectorDrawableActivity2.class);
                    }break;
                    case 24:{
                        openActivity(AnimatedVectorDrawableActivity3.class);
                    }break;
                    case 25:{
                        openActivity(VectorDrawablesActivity.class);
                    }break;
                    case 26:{
                        openActivity(OneActivity.class);
                    }break;
                    case 27:{
                        openActivity(OverlayTestActivity.class);
                    }break;
                    case 28:{
                        openActivity(AnimatedVectorDrawableActivity4.class);
                    }break;
                    case 29:{
                        openActivity(AnimatedVectorDrawableActivity5.class);
                    }break;
                }
            }
        });
    }

    private void addItems() {


        mItems.add(new DemoAdapterItem("LollipopShowcase",com.mikepenz.lollipopshowcase.R.drawable.ic_showcase));
        mItems.add(new DemoAdapterItem("ElevationBasic",com.example.android.elevationbasic.R.drawable.ic_elevation_base));
        mItems.add(new DemoAdapterItem("ElevationDrag",com.example.android.elevationdrag.R.drawable.ic_elevation_drag));
        mItems.add(new DemoAdapterItem("ClippingBasic",com.example.android.clippingbasic.R.drawable.ic_clipping));

        mItems.add(new DemoAdapterItem("NavigationDrawer",com.example.android.navigationdrawer.R.drawable.ic_navigation_drawer));
        mItems.add(new DemoAdapterItem("FloatingActionButtonBasic",com.example.android.floatingactionbuttonbasic.R.drawable.ic_floating_action));
        mItems.add(new DemoAdapterItem("RevealEffectBasicSample",com.example.android.revealeffectbasic.R.drawable.ic_reveal_effect));
        mItems.add(new DemoAdapterItem("RecyclerView",com.example.android.recyclerview.R.drawable.ic_recycler));
        mItems.add(new DemoAdapterItem("CardView",com.example.android.cardview.R.drawable.ic_cardview));
        mItems.add(new DemoAdapterItem("DrawableTinting",com.example.android.drawabletinting.R.drawable.ic_drawable_tinting));
        mItems.add(new DemoAdapterItem("AppRestrictionSchema",com.example.android.apprestrictionschema.R.drawable.ic_appres));
        mItems.add(new DemoAdapterItem("LNotification",com.example.android.lnotifications.R.drawable.ic_l_notifications));
        mItems.add(new DemoAdapterItem("Interpolator",com.example.android.interpolator.R.drawable.ic_interpolator));
        mItems.add(new DemoAdapterItem("Customize Activity Transitions",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("ToolBarDemo",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("ToolBarDemo2",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("ToolBarDemo3",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("ToolBarDemo4",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("Grid layout with RecyclerView",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("Grid layout with RecyclerView2",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("Grid layout with RecyclerView3",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("Vector 1",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("AnimatedVectorDrawable 1",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("AnimatedVectorDrawable 2",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("AnimatedVectorDrawable 3",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("VectorDrawablesActivity",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("Transitions Activity",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("Overlay Test Activity",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("AnimatedVectorDrawable 4",R.drawable.ic_launcher));
        mItems.add(new DemoAdapterItem("AnimatedVectorDrawable 5",R.drawable.ic_launcher));
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

    public void animateActivity(View v1,View v2){
        Intent i = new Intent(this, DetailInfo.class);
        i.putExtra("itemName","Customize Activity Transitions");
        ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(this, Pair.create(v1, "itemBox"),Pair.create(v2, "demoIcon"));
        ActivityCompat.startActivity(this, i, transitionActivityOptions.toBundle());
    }
}
