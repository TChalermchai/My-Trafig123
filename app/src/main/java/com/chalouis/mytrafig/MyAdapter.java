package com.chalouis.mytrafig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 5/6/2559.
 */
public class MyAdapter extends BaseAdapter{

    //Explint
    private Context context;
    private int[] ints;
    private  String[] nameStrings, detilStrings;

    public MyAdapter(Context context,
                     int[] ints, String[] nameStrings,
                     String[] detilStrings) {
        this.context = context;
        this.ints = ints;
        this.nameStrings = nameStrings;
        this.detilStrings = detilStrings;
    }

    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);
    //for Image
        ImageView imageView = (ImageView) view1.findViewById(R.id.imageView);
        imageView.setImageResource(ints[i]);

        //for TextView
        TextView nameTextview = (TextView) view1.findViewById(R.id.textView2);
        nameTextview.setText(nameStrings[i]);

        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);
        detailTextView.setText(detilStrings[i]);


        return view1;
    }
}   //main class
