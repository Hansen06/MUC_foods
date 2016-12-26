package com.example.dell.muc_foods.util;

/**
 * Created by DELL on 2016/12/19.
 */

public class Favfood {

    private int food_img;
    private String food_name;
    private String food_des;
    public Favfood(int food_img, String food_name,String food_des){
        this.food_img = food_img;
        this.food_name = food_name;
        this.food_des = food_des;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public int getFood_img() {
        return food_img;
    }

    public void setFood_img(int food_img) {
        this.food_img = food_img;
    }

    public String getFood_des() {
        return food_des;
    }

    public void setFood_des(String food_des) {
        this.food_des = food_des;
    }
}
