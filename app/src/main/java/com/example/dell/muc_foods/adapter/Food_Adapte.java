package com.example.dell.muc_foods.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.muc_foods.Interface.RecycleItemClickListener;
import com.example.dell.muc_foods.R;
import com.example.dell.muc_foods.util.Food;

import java.util.List;

/**
 * Created by DELL on 2016/11/6.
 */
public class Food_Adapte extends RecyclerView.Adapter<Food_Adapte.FoodViewHolder> {

    private List<Food> foods;

    public Food_Adapte(List<Food> list) {
        foods = list;
    }

    private RecycleItemClickListener mOnItemClickListener;
    public void setOnItemClickListener(RecycleItemClickListener listener){
        this.mOnItemClickListener = listener;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.food_item, viewGroup, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final FoodViewHolder holder, final int position) {
        holder.imageView.setImageResource(foods.get(position).getImg());
        holder.textView.setText(foods.get(position).getTitle());

        if(mOnItemClickListener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.onItemClick(holder.itemView,position);
                }
            });
        }


    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public static class FoodViewHolder extends  RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public FoodViewHolder(View itemView){
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.food_item_img );
            textView= (TextView) itemView.findViewById(R.id.food_item_title);
        }
    }

    public void addItem(int pos){
        notifyItemInserted(pos);
    }
    public void deleteItem(int pos){
        notifyItemRemoved(pos);
    }
}
