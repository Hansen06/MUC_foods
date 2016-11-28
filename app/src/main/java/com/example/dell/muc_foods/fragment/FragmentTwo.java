package com.example.dell.muc_foods.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.muc_foods.R;
import com.example.dell.muc_foods.adapter.Fooddetail_Adapter;
import com.example.dell.muc_foods.adapter.ViewFlowAdapter;
import com.example.dell.muc_foods.util.Food;
import com.example.dell.muc_foods.util.Resfood_Viewflow;
import com.example.dell.muc_foods.viewflow.CircleFlowIndicator;
import com.example.dell.muc_foods.viewflow.ViewFlow;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by clevo on 2015/7/30.
 */
public class FragmentTwo  extends Fragment {

    private List<Food> foodList;

    private List<Resfood_Viewflow> resfoods;

    private ViewFlow mViewFlow;
    private CircleFlowIndicator mFlowIndicator;

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

        initBanner();
        return view;

    }

    private void initBanner() {

        mViewFlow = (ViewFlow) getActivity().findViewById(R.id.viewflow);
        mFlowIndicator = (CircleFlowIndicator) getActivity().findViewById(R.id.viewflowindic);

        resfoods = new ArrayList<Resfood_Viewflow>();
        Resfood_Viewflow f1_1 = new Resfood_Viewflow(R.drawable.f1);
        resfoods.add(f1_1);
        Resfood_Viewflow f1_2 = new Resfood_Viewflow(R.drawable.f1);
        resfoods.add(f1_2);
        Resfood_Viewflow f1_3 = new Resfood_Viewflow(R.drawable.f1);
        resfoods.add(f1_3);
        Resfood_Viewflow f1_4 = new Resfood_Viewflow(R.drawable.f1);
        resfoods.add(f1_4);

        ViewFlowAdapter viewadapter = new ViewFlowAdapter(getActivity(),resfoods);
        mViewFlow.setAdapter(viewadapter);

        mViewFlow.setmSideBuffer(resfoods.size()); // 实际图片张数，
        // 我的ImageAdapter实际图片张数为3
        mViewFlow.setFlowIndicator(mFlowIndicator);
        mViewFlow.setTimeSpan(4500);
        mViewFlow.setSelection(resfoods.size() * 1000); // 设置初始位置
        mViewFlow.startAutoFlowTimer(); // 启动自动播放
    }
}
