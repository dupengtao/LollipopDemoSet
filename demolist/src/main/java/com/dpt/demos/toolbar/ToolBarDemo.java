package com.dpt.demos.toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.dpt.demos.R;

/**
 * Created by dupengtao on 14-11-27.
 */
public class ToolBarDemo extends ActionBarActivity {

    private Toolbar mToolbar, mToolbar2,mToolbar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_demo_1);
        mToolbar = (Toolbar) findViewById(R.id.tb_demo_1);
        setSupportActionBar(mToolbar);
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                String msg="";
                switch (menuItem.getItemId()) {
                    case R.id.action_edit:
                        msg += "Click edit";
                        break;
                    case R.id.action_share:
                        msg += "Click share";
                        break;
                    case R.id.action_settings:
                        msg += "Click setting";
                        break;
                }
                Toast.makeText(ToolBarDemo.this,msg,Toast.LENGTH_SHORT).show();
                return true;
            }
        });


        //mToolbar = (Toolbar) findViewById(R.id.tb_demo_2);

        // App Logo
        mToolbar.setLogo(R.drawable.ic_launcher);
        // Title
        mToolbar.setTitle("Title");
        // Sub Title
        mToolbar.setSubtitle("Sub title");
        mToolbar.setSubtitleTextColor(Color.RED);
        // Navigation Icon
        mToolbar.setNavigationIcon(R.drawable.ic_launcher);

        mToolbar3 = (Toolbar) findViewById(R.id.tb_demo_3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }
}
