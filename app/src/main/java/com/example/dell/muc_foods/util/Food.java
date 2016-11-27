package com.example.dell.muc_foods.util;

/**
 * Created by DELL on 2016/11/6.
 */
public class Food {
    private int img;
    private String title;

    public Food(int img, String title) {
        this.img = img;
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
