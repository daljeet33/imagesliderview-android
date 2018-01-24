package com.example.imagesliderview.Views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import android.view.Gravity;
import android.widget.LinearLayout;

import com.example.imagesliderview.R;


/**
 * Created by daljeet on 17/1/18.
 */

@SuppressLint("ViewConstructor")
public class IndicatorView extends android.support.v7.widget.AppCompatImageView {
    private int indicatorSize;

    public IndicatorView(Context context, int indicatorSize) {
        super(context);
        this.indicatorSize = indicatorSize;
        setIndicator();
    }

    private void setIndicator(){
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(indicatorSize, indicatorSize);
        layoutParams.gravity = Gravity.CENTER_VERTICAL;
        layoutParams.setMargins(4, 0, 4, 0);
        setLayoutParams(layoutParams);
    }

    public void onSelectedChange(boolean isSelected){
        if(isSelected){
            setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_selected, null));
        }else{
            setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_unselected, null));
        }
    }
}
