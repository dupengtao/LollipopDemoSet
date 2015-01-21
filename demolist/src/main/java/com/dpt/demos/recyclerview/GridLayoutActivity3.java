package com.dpt.demos.recyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;
import com.dpt.demos.R;
import com.dpt.demos.recyclerview.adapter.HeaderNumberedAdapter;

/**
 * Created by dupengtao on 14-12-23.
 */
public class GridLayoutActivity3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        final GridLayoutManager manager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(manager);

        View header = LayoutInflater.from(this).inflate(R.layout.item_header_numbered_adapter, recyclerView, false);
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), R.string.grid_layout_header, Toast.LENGTH_SHORT).show();
            }
        });
        final HeaderNumberedAdapter adapter = new HeaderNumberedAdapter(header, 30);
        recyclerView.setAdapter(adapter);

        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return adapter.isHeader(position) ? manager.getSpanCount() : 1;
            }
        });
    }
}
