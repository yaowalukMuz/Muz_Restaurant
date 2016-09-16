package com.hitachi_tstv.yodpanom.yaowaluk.muzrestaurant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by musz on 9/16/2016.
 */
public class MyAdepter extends BaseAdapter{

    private Context objContext;
    private String[] foodStrings, sourceStrings, pricesStrings;


    public MyAdepter(Context objContext, String[] foodStrings, String[] sourceStrings, String[] pricesStrings) {
        this.objContext = objContext;
        this.foodStrings = foodStrings;
        this.sourceStrings = sourceStrings;
        this.pricesStrings = pricesStrings;
    }

    @Override
    public int getCount() {
        return foodStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //View view1 = objLayoutInflater.inflate(R.layout.my_listview,);

        return view1;
    }
}
