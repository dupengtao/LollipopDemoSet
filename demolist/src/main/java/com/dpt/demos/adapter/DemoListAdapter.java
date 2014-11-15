package com.dpt.demos.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dpt.demos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dupengtao on 14-11-12.
 */
public class DemoListAdapter extends RecyclerView.Adapter<DemoListAdapter.ViewHolder> {

    private List<String> mDataSet;
    OnItemClickListener itemClickListener;

    public DemoListAdapter(List<String> dataSet) {
        mDataSet = dataSet == null ? new ArrayList<String>() : dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        TextView tv = (TextView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_demo_list, viewGroup, false);
        //TextView tv = (TextView)View.inflate(viewGroup.getContext(),R.layout.item_demo_list,null);

        return new ViewHolder(tv);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.mTv.setText(mDataSet.get(i));
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView mTv;


        public ViewHolder(TextView itemView) {
            super(itemView);
            mTv = itemView;
            mTv.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (itemClickListener != null) {
                itemClickListener.onItemClick(v, getPosition());
            }
        }

    }
        public OnItemClickListener getItemClickListener() {
            return itemClickListener;
        }

        public void setItemClickListener(OnItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        public interface OnItemClickListener {
            public void onItemClick(View view, int position);
        }

}
