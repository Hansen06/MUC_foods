package com.example.dell.muc_foods.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.muc_foods.R;
import com.example.dell.muc_foods.util.Favfood;

import java.util.List;


/**
 * Created by DELL on 2016/12/19.
 */

public class FavoriteAdapter extends RecyclerView.Adapter<ViewHolder> {

    private LayoutInflater mInflater;//得到一个LayoutInfalter对象用来导入布局
    private Context context;
    private List<Favfood> favfood;

    public FavoriteAdapter(Context context, List<Favfood> datas){
        this.context = context;
        this.favfood = datas;
        this.mInflater = LayoutInflater.from(context);
    }




    @Override
    public int getItemCount() {
        return favfood.size();
    }

    @Override
    public void onBindViewHolder(final ViewHolder myViewHolder, final int pos) {
        myViewHolder.food_image.setImageResource(favfood.get(pos).getFood_img());
        myViewHolder.food_name.setText(favfood.get(pos).getFood_name());
        myViewHolder.food_detail.setText(favfood.get(pos).getFood_des());

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.favoritecell, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


}
class ViewHolder extends RecyclerView.ViewHolder {

    ImageView food_image;
    TextView food_name;
    TextView food_detail;

    public ViewHolder(View arg0){
        super(arg0);
        food_image = (ImageView)arg0.findViewById(R.id.food_image);
        food_name = (TextView)arg0.findViewById(R.id.food_name);
        food_detail = (TextView)arg0.findViewById(R.id.food_detail);

    }
}