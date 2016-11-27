package com.example.dell.muc_foods.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.dell.muc_foods.R;
import com.example.dell.muc_foods.adapter.Fooddetail_Adapter;
import com.example.dell.muc_foods.util.Food;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by clevo on 2015/7/30.
 */
public class FragmentTwo  extends Fragment {
    private  ImageView imageView;
    private List<String> mDatas;
    private List<Food> foodList;
    private List<Food> foodList1;
    public static FragmentTwo newInstance(){

        return new FragmentTwo();
    }


    public FragmentTwo() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_fragment_two,container,false );

//        mDatas = new ArrayList<String>();
//        for (int i = 'A'; i <= 'J'; i++) {
//            mDatas.add("" + (char) i);
//        }

        foodList = new ArrayList<Food>();
        Food f1 = new Food(R.mipmap.first_t14, "锅包肉盖饭");
        foodList.add(f1);
        Food f2 = new Food(R.mipmap.first_r5, "铁板土豆牛肉");
        foodList.add(f2);
        Food f3 = new Food(R.mipmap.first_r7, "铁板孜然鸡腿");
        foodList.add(f3);
        Food f4 = new Food(R.mipmap.first_r9, "香辣牛排");
        foodList.add(f4);
        Food f5 = new Food(R.mipmap.first_r10, "香辣牛肉火锅");
        foodList.add(f5);
        Food f6 = new Food(R.mipmap.first_r2, "玉米鸡丁盖饭");
        foodList.add(f6);
        Food f7 = new Food(R.mipmap.first_t16, "黄瓜鸡蛋汤");
        foodList.add(f7);
        Food f8 = new Food(R.mipmap.first_t18, "泡菜炒饭");
        foodList.add(f8);
        Food f9 = new Food(R.mipmap.first_t20, "麻辣土豆粉");
        foodList.add(f9);
        Food f10 = new Food(R.mipmap.first_t11, "莲藕排骨汤");
        foodList.add(f10);
        Food f11 = new Food(R.mipmap.first_t10, "肥牛土豆粉");
        foodList.add(f11);
        Food f12 = new Food(R.mipmap.first_t7, "白菜牛肉盖饭");
        foodList.add(f12);
        Food f13 = new Food(R.mipmap.first_r6, "铁板孜然牛肉");
        foodList.add(f13);
        Food f14 = new Food(R.mipmap.first_r3, "芋儿鸡火锅");
        foodList.add(f14);
        Food f15 = new Food(R.mipmap.first_t12, "豆花牛肉盖饭");
        foodList.add(f15);



        RecyclerView recyclerView= (RecyclerView) view.findViewById(R.id.recycler_fragment_two);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        Res_FoodAdapter adapter=new Res_FoodAdapter(getActivity(),mDatas);
        Fooddetail_Adapter adapter = new Fooddetail_Adapter(getActivity(),foodList);
        recyclerView.setAdapter(adapter);
        return view;
//        View view=inflater.inflate(R.layout.commodity_details_fragment, container, false);
//        imageView = (ImageView) view.findViewById(R.id.imageView);
//        imageLoader=new ImageLoader(getActivity().getApplicationContext());
//        imageLoader.DisplayImage(getUrl(), imageView);
//        return view;

    }
}
