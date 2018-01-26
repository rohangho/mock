package com.getterexample.android.screenshot1;

/**
 * Created by ROHAN on 25-01-2018.
 */

public class CustomClass {

    int image;
    String name;
    CustomClass()
    {

    }

    public CustomClass(String s, int resourceId) {
        this.image=resourceId;
        this.name=s;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
