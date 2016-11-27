package com.example.dell.muc_foods.res_fragment;

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
import com.example.dell.muc_foods.ResDatailActivity;
import com.example.dell.muc_foods.adapter.Res_FoodAdapter;
import com.example.dell.muc_foods.util.Resfood;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by clevo on 2015/7/30.
 */
public class Res_FragmentTwo extends Fragment {
    private  ImageView imageView;
    private List<Resfood> resfoods;

    private String  res_no = ResDatailActivity.res_instance.getShow_res_no();

    public static Res_FragmentTwo newInstance(){

        return new Res_FragmentTwo();
    }


    public Res_FragmentTwo() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_fragment_two,container,false );

        if(res_no.equals("1")){
            resfoods = new ArrayList<Resfood>();
            Resfood f1 = new Resfood(R.mipmap.first_r1, "肉末蛋包饭","肉末蛋包饭详述","￥9.0");
            resfoods.add(f1);
            Resfood f2 = new Resfood(R.mipmap.first_r2, "玉米鸡丁盖饭","玉米鸡丁盖饭详述","￥9.0");
            resfoods.add(f2);
            Resfood f3 = new Resfood(R.mipmap.first_r3, "芋儿鸡火锅","芋儿鸡火锅详述","￥17.0");
            resfoods.add(f3);
            Resfood f4 = new Resfood(R.mipmap.first_r4, "豌豆牛肉盖饭","豌豆牛肉盖饭详述","￥9.0");
            resfoods.add(f4);
            Resfood f5 = new Resfood(R.mipmap.first_r5, "铁板土豆牛肉","铁板土豆牛肉详述","￥9.0");
            resfoods.add(f5);
            Resfood f6 = new Resfood(R.mipmap.first_r6, "铁板孜然牛肉","铁板孜然牛肉详述","￥9.0");
            resfoods.add(f6);
            Resfood f7 = new Resfood(R.mipmap.first_r7, "铁板孜然鸡腿","铁板孜然鸡腿详述","￥9.0");
            resfoods.add(f7);
            Resfood f8 = new Resfood(R.mipmap.first_r8, "铁板香辣鸡腿肉","铁板香辣鸡腿肉9.0","￥9.0");
            resfoods.add(f8);
            Resfood f9 = new Resfood(R.mipmap.first_r9, "香辣牛排","香辣牛排详述","￥10.0");
            resfoods.add(f9);
            Resfood f10 = new Resfood(R.mipmap.first_r10, "香辣牛肉火锅","香辣牛肉火锅详述","￥17.0");
            resfoods.add(f10);
        }else if(res_no.equals("2")){
            resfoods = new ArrayList<Resfood>();

        }else if(res_no.equals("3")){
            resfoods = new ArrayList<Resfood>();
            Resfood f1 = new Resfood(R.mipmap.three_r1, "小炒肉","小炒肉详述","￥4.0");
            resfoods.add(f1);
            Resfood f2 = new Resfood(R.mipmap.three_r2, "手撕包菜","手撕包菜详述","￥2.3");
            resfoods.add(f2);
            Resfood f3 = new Resfood(R.mipmap.three_r3, "杏鲍菇牛柳","杏鲍菇牛柳详述","￥10.0");
            resfoods.add(f3);
            Resfood f4 = new Resfood(R.mipmap.three_r4, "牛肉米线","牛肉米线详述","￥13.0");
            resfoods.add(f4);
            Resfood f5 = new Resfood(R.mipmap.three_r5, "羊杂米线","羊杂米线详述","￥13.0");
            resfoods.add(f5);
            Resfood f6 = new Resfood(R.mipmap.three_r6, "西红柿鸡蛋面","西红柿鸡蛋面详述","￥5.0");
            resfoods.add(f6);
            Resfood f7 = new Resfood(R.mipmap.three_r7, "香菇炒青菜","香菇炒青菜详述","￥4.0");
            resfoods.add(f7);
            Resfood f8 = new Resfood(R.mipmap.three_r8, "麻辣鸡丝面","麻辣鸡丝面详述","￥7.0");
            resfoods.add(f8);
        }else if(res_no.equals("4")){
            resfoods = new ArrayList<Resfood>();
        }


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_fragment_two);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Res_FoodAdapter adapter = new Res_FoodAdapter(getActivity(),resfoods);
        recyclerView.setAdapter(adapter);
        return view;

//        View view=inflater.inflate(R.layout.commodity_details_fragment, container, false);
//        imageView = (ImageView) view.findViewById(R.id.imageView);
//        imageLoader = new ImageLoader(getActivity().getApplicationContext());
//        imageLoader.DisplayImage(getUrl(), imageView);
//        return view;

    }
}
