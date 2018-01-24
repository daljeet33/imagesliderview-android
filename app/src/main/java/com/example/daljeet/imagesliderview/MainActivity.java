package com.example.daljeet.imagesliderview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.imagesliderview.Views.SliderViewLayout;
import com.example.imagesliderview.beans.DrawableImage;
import com.example.imagesliderview.beans.SliderImage;
import com.example.imagesliderview.beans.UrlImage;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<SliderImage> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SliderViewLayout sliderViewLayout = findViewById(R.id.sliderLayout);
        UrlImage urlImage1 = new UrlImage("http://i.dailymail.co.uk/i/pix/2016/09/06/11/37F60FD200000578-0-image-a-5_1473156426673.jpg");
        imageList.add(urlImage1);
        UrlImage urlImage2 = new UrlImage("https://www.w3schools.com/w3images/lights.jpg");
        imageList.add(urlImage2);
        UrlImage urlImage3 = new UrlImage("https://www.w3schools.com/w3css/img_fjords.jpg");
        imageList.add(urlImage3);
        sliderViewLayout.setSliderImages(imageList, 0);
        //sliderViewLayout.setCustomIndicators(ContextCompat.getDrawable(this,R.drawable.indicator_square_selected),ContextCompat.getDrawable(this,R.drawable.indicator_square_unselected));
        //sliderViewLayout.setCustomArrows(R.drawable.ic_custom_left,R.drawable.ic_custom_right);
        DrawableImage drawableImage1 = new DrawableImage(R.drawable.ic_home);


    }
}
