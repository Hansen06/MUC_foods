package com.example.dell.muc_foods.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.muc_foods.MainActivity;
import com.example.dell.muc_foods.R;
import com.example.dell.muc_foods.util.Food;

import java.util.List;

/**
 * Created by DELL on 2016/11/6.
 */
public class Fooddetail_Adapter extends RecyclerView.Adapter<Fooddetail_Adapter.FoodViewHolder> {

    int pos = Integer.parseInt(MainActivity.instance.getImg_position());

    private LayoutInflater mInflater;
    private List<Food> food;
    private Context mContext;
    public Fooddetail_Adapter(Context context, List<Food> foods) {
        this.mContext = context;
        this.food = foods;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public FoodViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view= mInflater.inflate(R.layout.food_des, viewGroup, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final FoodViewHolder holder, final int position) {
//        holder.imageView.setImageResource(mDatas.get(position));

        holder.textView.setText(food.get(pos).getTitle());
        holder.imageView.setImageResource(food.get(pos).getImg());

    }

    @Override
    public int getItemCount() {
        return food.size();
    }

    public static class FoodViewHolder extends  RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public FoodViewHolder(View itemView){
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.food_des_img );
            textView= (TextView) itemView.findViewById(R.id.food_des_title);
        }

    }
}
