package com.example.karanc.myapplicationgv;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

/**
 * Created by karanc on 29-01-2016.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
    mContext=c;
    }

    @Override
    public int getCount() {
        return pics.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (view == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else
        {
            imageView = (ImageView) view;
        }
        imageView.setImageResource(pics[i]);
        return imageView;
    }

    public Integer pics[]={
            R.drawable.brad,
            R.drawable.canvas,
            R.drawable.chester,
            R.drawable.eminterview,
            R.drawable.emsb,
            R.drawable.images,
            R.drawable.images1,
            R.drawable.images2,
            R.drawable.images5,
            R.drawable.cam,
            R.drawable.man,
            R.drawable.fm

    };
         }

