package com.example.dell.muc_foods.adapter;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.muc_foods.Interface.RecycleItemClickListener;
import com.example.dell.muc_foods.R;
import com.example.dell.muc_foods.util.Resfood;

import java.util.List;

/**
 * Created by DELL on 2016/11/6.
 */
public class Res_FoodAdapter extends RecyclerView.Adapter<MyViewHolder>{

    private LayoutInflater mInflater;
    private Context mContext;
    private List<Resfood> ResFood;
    public Res_FoodAdapter(Context context,List<Resfood> datas){
        this.mContext = context;
        this.ResFood = datas;
        mInflater = LayoutInflater.from(context);
    }

    private RecycleItemClickListener mOnItemClickListener;
    public void setOnItemClickListener(RecycleItemClickListener listener){
        this.mOnItemClickListener = listener;
    }

    @Override
    public int getItemCount() {
        return ResFood.size();
    }

    @Override
    public void onBindViewHolder(final  MyViewHolder myViewHolder, final int pos) {
        myViewHolder.food_image.setImageResource(ResFood.get(pos).getFood_img());
        myViewHolder.food_name.setText(ResFood.get(pos).getFood_name());
        myViewHolder.food_detail.setText(ResFood.get(pos).getFood_des());
        myViewHolder.food_price.setText(ResFood.get(pos).getPrice());

        if(mOnItemClickListener != null){
            myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.onItemClick(myViewHolder.itemView,pos);
                }
            });
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.res_food_itemview, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }
}

class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView food_image;
    TextView food_name;
    TextView food_detail;
    TextView food_price;
    public MyViewHolder(View arg0){
        super(arg0);
        food_image = (ImageView)arg0.findViewById(R.id.food_image);
        food_name = (TextView)arg0.findViewById(R.id.food_name);
        food_detail = (TextView)arg0.findViewById(R.id.food_detail);
        food_price = (TextView)arg0.findViewById(R.id.food_price);

    }
}
