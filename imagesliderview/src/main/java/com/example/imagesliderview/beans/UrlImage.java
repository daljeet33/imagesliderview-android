package com.example.imagesliderview.beans;

import android.os.Parcel;

/**
 * Created by daljeet on 18/1/18.
 */

public class UrlImage extends SliderImage {
    private String url;
    private int placeHolder;

    public UrlImage(String url){
        this.url=url;
    }
    public String getImgUrl() {
        return url;
    }

    public void setImgUrl(String url) {
        this.url = url;
    }

    protected UrlImage(Parcel in) {
        url = in.readString();
        placeHolder=in.readInt();
    }

    public int getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(int placeHolder) {
        this.placeHolder = placeHolder;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(url);
        dest.writeInt(placeHolder);
    }
}
