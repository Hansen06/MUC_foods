package com.example.dell.muc_foods.res_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.muc_foods.R;
import com.example.dell.muc_foods.ResDatailActivity;
import com.example.dell.muc_foods.adapter.Res_FoodAdapter;
import com.example.dell.muc_foods.recyclerview.SpacesItemDecoration;
import com.example.dell.muc_foods.util.Resfood;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by clevo on 2015/7/30.
 */
public class Res_FragmentOne extends Fragment {
    private List<Resfood> resfoods;

    private String  res_no = ResDatailActivity.res_instance.getShow_res_no();

    public static Res_FragmentOne newInstance(){
        return new Res_FragmentOne();
    }


    public Res_FragmentOne() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_fragment_one,container,false );


        if(res_no.equals("1")){
            resfoods = new ArrayList<Resfood>();
            Resfood f1 = new Resfood(R.mipmap.first_t1, "卤蛋土豆粉","卤蛋土豆粉详述","￥8.0");
            resfoods.add(f1);
            Resfood f2 = new Resfood(R.mipmap.first_t2, "吉野家牛肉饭","吉野家牛肉饭详述","￥10.0");
            resfoods.add(f2);
            Resfood f3 = new Resfood(R.mipmap.first_t3, "滑蛋牛柳盖饭","滑蛋牛柳盖饭详述","￥9.0");
            resfoods.add(f3);
            Resfood f4 = new Resfood(R.mipmap.first_t4, "火腿鸡蛋炒饭","火腿鸡蛋炒饭详述","￥8.0");
            resfoods.add(f4);
            Resfood f5 = new Resfood(R.mipmap.first_t5, "番茄牛肉火锅","番茄牛肉火锅详述","￥17.0");
            resfoods.add(f5);
            Resfood f6 = new Resfood(R.mipmap.first_t6, "番茄鱼片汤","番茄鱼片汤详述","￥10.0");
            resfoods.add(f6);
            Resfood f7 = new Resfood(R.mipmap.first_t7, "白菜牛肉盖饭","白菜牛肉盖饭详述","￥9.0");
            resfoods.add(f7);
            Resfood f8 = new Resfood(R.mipmap.first_t8, "红烧肉土豆粉","红烧肉土豆粉详述","￥8.0");
            resfoods.add(f8);
            Resfood f9 = new Resfood(R.mipmap.first_t9, "老干妈蛋炒饭","老干妈蛋炒饭详述","￥8.0");
            resfoods.add(f9);
            Resfood f10 = new Resfood(R.mipmap.first_t10, "肥牛土豆粉","肥牛土豆粉详述","￥8.0");
            resfoods.add(f10);
            Resfood f11 = new Resfood(R.mipmap.first_t11, "莲藕排骨汤","莲藕排骨汤详述","￥12.0");
            resfoods.add(f11);
            Resfood f12 = new Resfood(R.mipmap.first_t12, "豆花牛肉盖饭","豆花牛肉盖饭详述","￥9.0");
            resfoods.add(f12);
            Resfood f13 = new Resfood(R.mipmap.first_t13, "金针菇肥牛汤","金针菇肥牛汤详述","￥12.0");
            resfoods.add(f13);
            Resfood f14 = new Resfood(R.mipmap.first_t14, "锅包肉盖饭","锅包肉盖饭详述","￥9.0");
            resfoods.add(f14);
            Resfood f15 = new Resfood(R.mipmap.first_t15, "麻辣土豆粉","麻辣土豆粉详述","￥7.0");
            resfoods.add(f15);

            Resfood f16 = new Resfood(R.mipmap.first_t16, "黄瓜鸡蛋汤","黄瓜鸡蛋汤详述","￥7.0");
            resfoods.add(f16);
            Resfood f17 = new Resfood(R.mipmap.first_t17, "木耳肉丝盖饭","木耳肉丝盖饭详述","￥9.0");
            resfoods.add(f17);
            Resfood f18 = new Resfood(R.mipmap.first_t18, "泡菜炒饭","泡菜炒饭详述","￥7.0");
            resfoods.add(f18);
            Resfood f19 = new Resfood(R.mipmap.first_t19, "茄子牛肉盖饭","茄子牛肉盖饭详述","￥9.0");
            resfoods.add(f19);
            Resfood f20 = new Resfood(R.mipmap.first_t20, "麻辣土豆粉","麻辣土豆粉详述","￥7.0");
            resfoods.add(f20);
        }else if(res_no.equals("2")){
            resfoods = new ArrayList<Resfood>();

        }else if(res_no.equals("3")){
            resfoods = new ArrayList<Resfood>();
            Resfood f1 = new Resfood(R.mipmap.three_t1, "凉皮","凉皮详述","￥5.0");
            resfoods.add(f1);
            Resfood f2 = new Resfood(R.mipmap.three_t2, "八宝粥","八宝粥详述","￥3.0");
            resfoods.add(f2);
            Resfood f3 = new Resfood(R.mipmap.three_t3, "卷饼加鸡蛋加奥尔良","卷饼加鸡蛋加奥尔良8.0","￥8.0");
            resfoods.add(f3);
            Resfood f4 = new Resfood(R.mipmap.three_t4, "咖喱鸡块饭","咖喱鸡块饭详述","￥13.0");
            resfoods.add(f4);
            Resfood f5 = new Resfood(R.mipmap.three_t5, "尖椒鸡块","尖椒鸡块详述","￥6.0");
            resfoods.add(f5);
            Resfood f6 = new Resfood(R.mipmap.three_t6, "炒面","炒面详述","￥5.0");
            resfoods.add(f6);
            Resfood f7 = new Resfood(R.mipmap.three_t7, "脆皮豆腐","脆皮豆腐详述","￥4.0");
            resfoods.add(f7);
            Resfood f8 = new Resfood(R.mipmap.three_t8, "饺子","饺子详述","￥6.0");
            resfoods.add(f8);
            Resfood f9 = new Resfood(R.mipmap.three_t9, "酱牛肉","酱牛肉详述","￥6.0");
            resfoods.add(f9);
        }else if(res_no.equals("4")){
            resfoods = new ArrayList<Resfood>();
        }

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_fragment_one);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Res_FoodAdapter adapter = new Res_FoodAdapter(getActivity(),resfoods);
        recyclerView.setAdapter(adapter);

        //设置item之间的间隔
        SpacesItemDecoration decoration = new SpacesItemDecoration(16);
        recyclerView.addItemDecoration(decoration);

        return view;
    }


}
