package com.getterexample.android.screenshot1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ROHAN on 25-01-2018.
 */

public class ListAdapter extends BaseAdapter {

    Context context;
    List<CustomClass> items;

    ListAdapter(Context context,List<CustomClass>items)
    {
        this.context=context;
        this.items=items;
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return items.indexOf(getItem(position));
    }
    public  class ViewHolder{
        ImageView pictureofitem  ;
        TextView typename;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        LayoutInflater min=(LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView==null)
        {
            convertView = min.inflate(R.layout.customlist,null);

        }
        holder=new ViewHolder();

       holder.pictureofitem=(ImageView)convertView.findViewById(R.id.img);
        holder.typename=(TextView)convertView.findViewById(R.id.type);
        holder.pictureofitem.setImageResource(items.get(position).getImage());
        holder.typename.setText(items.get(position).getName());
        return convertView;
    }
}
