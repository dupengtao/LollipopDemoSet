package com.dpt.demos.toolbar;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.dpt.demos.R;


public class ToolBarDemo4 extends ActionBarActivity {
  private DrawerLayout mDrawerLayout;
  private ActionBarDrawerToggle mDrawerToggle;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_toolbar_demo_4);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    toolbar.inflateMenu(R.menu.menu_toolbar);
    setSupportActionBar(toolbar);

    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    // 打開 up bottom
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
    // 實作 drawer toggle 並放入 toolbar
    mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
    mDrawerToggle.syncState();

    mDrawerLayout.setDrawerListener(mDrawerToggle);
  }


  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_toolbar, menu);
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
