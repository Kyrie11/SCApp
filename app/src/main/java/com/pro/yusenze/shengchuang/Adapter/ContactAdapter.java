package com.pro.yusenze.shengchuang.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.pro.yusenze.shengchuang.Item.MQ3;
import com.pro.yusenze.shengchuang.R;
import java.io.File;
import java.util.List;

public class ContactAdapter extends BaseAdapter {
    private List<MQ3> data;
    private int listviewItem;
    private File cache;
    LayoutInflater layoutInflater;


    public ContactAdapter(Context context,List<MQ3> data,int listviewItem,File cache){
        this.data = data;
        this.listviewItem = listviewItem;
        this.cache = cache;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount(){
        return data.size();
    }

    @Override
    public Object getItem(int position){
        return data.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        TextView textView = null;
        TextView textView1 = null;
        if(convertView==null){
            convertView = layoutInflater.inflate(listviewItem,null);
            textView = (TextView) convertView.findViewById(R.id.ItemText);
            textView1 = (TextView) convertView.findViewById(R.id.ItemTitle);
            convertView.setTag(new DataWrapper(textView,textView1));
        }else{
            DataWrapper dataWrapper = (DataWrapper) convertView.getTag();
            textView = dataWrapper.textView;
            textView1 = dataWrapper.textView1;
        }
        MQ3 mq3 = data.get(position);
        textView.setText(mq3.getData());
        textView1.setText(mq3.getTime().toString());
        return convertView;
    }

    private final class DataWrapper{
        public TextView textView;
        public TextView textView1;
        public DataWrapper(TextView textView,TextView textView1){
            this.textView = textView;
            this.textView1 = textView1;
        }
    }
}
