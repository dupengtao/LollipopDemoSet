package com.dpt.demos.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.dpt.demos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dupengtao on 14-11-12.
 */
public class DemoListAdapter extends RecyclerView.Adapter<DemoListAdapter.ViewHolder> {

    private List<DemoAdapterItem> mDataSet;
    OnItemClickListener itemClickListener;

    public DemoListAdapter(List<DemoAdapterItem> dataSet) {
        mDataSet = dataSet == null ? new ArrayList<DemoAdapterItem>() : dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        CardView cv = (CardView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_demo_list2, viewGroup, false);
        //TextView tv = (TextView)View.inflate(viewGroup.getContext(),R.layout.item_demo_list,null);

        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        DemoAdapterItem item = mDataSet.get(i);
        viewHolder.setItemName(item.getAppName());
        viewHolder.setImageRes(item.getAppResIcon());
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private CardView mCv;
        private ImageView mIvDemoIcon;
        private TextView mTvDemoName;


        public ViewHolder(CardView itemView) {
            super(itemView);
            mCv = itemView;
            mTvDemoName = (TextView) mCv.findViewById(R.id.tvDemoName);
            mIvDemoIcon = (ImageView) mCv.findViewById(R.id.ivDemoIcon);
            mCv.setOnClickListener(this);
        }

        public void setItemName(String text){
            mTvDemoName.setText(text);
        }

        public void setImageRes(int resId){
            mIvDemoIcon.setImageResource(resId);
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
