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
import com.example.dell.muc_foods.adapter.Res_FoodAdapter;
import com.example.dell.muc_foods.fragment.FragmentThree;
import com.example.dell.muc_foods.util.Resfood;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by clevo on 2015/7/30.
 */
public class Res_FragmentThree extends Fragment {

    private List<Resfood> resfoods;
    public static FragmentThree newInstance(){
        return new FragmentThree();
    }


    public Res_FragmentThree() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_fragment_three,container,false );

        resfoods = new ArrayList<Resfood>();
        Resfood f1 = new Resfood(R.mipmap.f1, "美食1","美食1","美食1");
        resfoods.add(f1);
        Resfood f2 = new Resfood(R.mipmap.f2, "美食2","美食1","美食1");
        resfoods.add(f2);
        Resfood f3 = new Resfood(R.mipmap.f3, "美食3","美食1","美食1");
        resfoods.add(f3);
        Resfood f4 = new Resfood(R.mipmap.f4, "美食4","美食1","美食1");
        resfoods.add(f4);
        Resfood f5 = new Resfood(R.mipmap.f5, "美食5","美食1","美食1");
        resfoods.add(f5);
        Resfood f6 = new Resfood(R.mipmap.f6, "美食6","美食1","美食1");
        resfoods.add(f6);
        Resfood f7 = new Resfood(R.mipmap.f7, "美食7","美食1","美食1");
        resfoods.add(f7);
        Resfood f8 = new Resfood(R.mipmap.f8, "美食8","美食1","美食1");
        resfoods.add(f8);
        Resfood f9 = new Resfood(R.mipmap.f9, "美食9","美食1","美食1");
        resfoods.add(f9);
        Resfood f10 = new Resfood(R.mipmap.f10, "美食10","美食1","美食1");
        resfoods.add(f10);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_fragment_three);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Res_FoodAdapter adapter = new Res_FoodAdapter(getActivity(),resfoods);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
