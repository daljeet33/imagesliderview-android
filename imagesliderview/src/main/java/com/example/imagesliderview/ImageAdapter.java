package com.example.imagesliderview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.imagesliderview.Views.ImageFragment;
import com.example.imagesliderview.beans.SliderImage;

import java.util.ArrayList;

/**
 * Created by daljeet on 12/1/18.
 */

public class ImageAdapter extends FragmentPagerAdapter {
    private ArrayList<SliderImage> sliderImageArrayList;
    private int placeholder;
    private boolean infiniteView;
    public ImageAdapter(FragmentManager fm, ArrayList<SliderImage> sliderImageList, int placeholder, Boolean infiniteView) {
        super(fm);
        this.sliderImageArrayList=sliderImageList;
        this.placeholder=placeholder;
        this.infiniteView=infiniteView;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle args = new Bundle();
        if(placeholder!=0){
            args.putInt("placeholder",placeholder);
        }else{
            args.putInt("placeholder",R.drawable.ic_oodles_logo);
        }
        if(infiniteView){
            if (position == 0) {
                args.putParcelable("sliderImage", sliderImageArrayList.get(sliderImageArrayList.size()-1));
            } else if (position == sliderImageArrayList.size() + 1) {
                args.putParcelable("sliderImage", sliderImageArrayList.get(0));
            } else {
                args.putParcelable("sliderImage", sliderImageArrayList.get(position-1));
            }
        }
        else{
            args.putParcelable("sliderImage", sliderImageArrayList.get(position));
        }
        ImageFragment fragment = new ImageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        if(infiniteView){
            return sliderImageArrayList.size()+2;
        }else{
            return sliderImageArrayList.size();
        }
    }
}
