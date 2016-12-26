package com.example.dell.muc_foods.res_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.muc_foods.Interface.RecycleItemClickListener;
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
            Resfood f1 = new Resfood(R.mipmap.first_t1, "宫保鸡丁","选用鸡肉为主料，佐以花生米、黄瓜、辣椒等辅料烹制而成","￥14.0");
            resfoods.add(f1);
            Resfood f2 = new Resfood(R.mipmap.first_t2, "黑椒肉炒饭","香软Q弹的牛肉粒，遇到顺滑的鸡蛋，撒上正宗的黑椒，加油，翻炒，让每一粒米与调料相遇，颗颗晶莹剔透，醇香入味","￥6.0");
            resfoods.add(f2);
            Resfood f3 = new Resfood(R.mipmap.first_t3, "滑蛋牛柳盖饭","软嫩的牛肉被炒得鲜嫩多汁，火候恰当，使得牛肉不硬不老。菜色泽浅黄，肉质鲜滑，蛋香浓郁。","￥9.0");
            resfoods.add(f3);
            Resfood f4 = new Resfood(R.mipmap.first_t4, "火腿鸡蛋炒饭","用火腿和鸡蛋配以调料炒制而成。火腿炒蛋取材方便，做法简单，色泽美观，鲜咸软嫩，清香适口，营养丰富","￥8.0");
            resfoods.add(f4);
            Resfood f5 = new Resfood(R.mipmap.first_t5, "京酱肉丝","咸甜适中，酱香浓郁，风味独特。选用猪里脊肉为主料，辅以黄酱或甜面酱及其它调味品","￥16.0");
            resfoods.add(f5);
            Resfood f6 = new Resfood(R.mipmap.first_t6, "麻辣小面","一碗简单朴素的素面，油红面黄叶绿，麻辣鲜香滑爽，食后口留余香，食而思再不倦，几乎是所有爱辣人的至爱","￥7.0");
            resfoods.add(f6);
            Resfood f7 = new Resfood(R.mipmap.first_t7, "白菜牛肉盖饭","白菜牛肉盖饭详述","￥9.0");
            resfoods.add(f7);
            Resfood f8 = new Resfood(R.mipmap.first_t8, "香辣排骨","酥脆的排骨与正宗的辣椒相遇，味道醇厚，香味扑鼻，香辣可口，老少皆宜，深受大家喜爱","￥18.0");
            resfoods.add(f8);
            Resfood f9 = new Resfood(R.mipmap.first_t9, "鱼香肉丝煲仔饭","主料为猪肉、黑木耳，辅料为胡萝卜、竹笋、辣椒等。猪肉选用三成肥、七成瘦的切丝滑炒，吃起来肉丝质地鲜嫩","￥8.0");
            resfoods.add(f9);
            Resfood f10 = new Resfood(R.mipmap.first_t10, "小炒鸡","主料为鸡腿，配以青红椒，口感鲜、香、麻、辣,鸡肉肉质细嫩、汤浓味美，老少皆宜","￥8.0");
            resfoods.add(f10);
            Resfood f11 = new Resfood(R.mipmap.first_t11, "莲藕排骨汤","莲藕排骨汤详述","￥12.0");
            Resfood f12 = new Resfood(R.mipmap.first_t18, "泡菜炒饭","鲜香入味的泡菜，与米饭在锅中翻炒，炒至粒粒金黄，再加入秘制的调味料，最后佐上一个鸡蛋，蛋液包裹住米饭，炒饭的层次便更丰富，入口更加香滑","￥7.0");
            resfoods.add(f12);

        }else if(res_no.equals("2")){
            resfoods = new ArrayList<Resfood>();

        }else if(res_no.equals("3")){
            resfoods = new ArrayList<Resfood>();
            Resfood f1 = new Resfood(R.mipmap.three_t1, "凉皮","凉皮性平、甘、温肺、健脾、和胃、冬天吃面皮能保暖，夏天吃能消署，春天吃能解乏，秋天吃能去湿，真可谓是四季皆宜","￥5.0");
            resfoods.add(f1);
            Resfood f2 = new Resfood(R.mipmap.three_t2, "八宝粥","将大米，红豆，绿豆，薏米等多种材料提前浸泡，小火慢煮，成品色泽鲜艳、质软香甜、清香诱人、滑而不腻","￥3.0");
            resfoods.add(f2);
            Resfood f3 = new Resfood(R.mipmap.three_t3, "卷饼加鸡蛋加奥尔良","松软的饼皮包裹着鲜嫩多汁的奥尔良鸡腿肉，再加上一个完美的煎鸡蛋，生菜的清爽，辣椒粉的火热，甜酱的细腻","￥8.0");
            resfoods.add(f3);
            Resfood f4 = new Resfood(R.mipmap.three_t4, "咖喱鸡块饭","洋葱、香菇、胡萝卜、土豆、鸡胸肉切块，蒜切片，煸炒入味，融合咖喱，小火慢炖，收汁入味","￥13.0");
            resfoods.add(f4);
            Resfood f5 = new Resfood(R.mipmap.three_t5, "尖椒鸡块","辣椒与鸡块的完美搭配，香脆麻辣的大块鸡肉，一口咬下去各种鲜美，然后辣椒的感觉留在舌尖，是下饭菜中不可多得的好味","￥6.0");
            resfoods.add(f5);
            Resfood f6 = new Resfood(R.mipmap.three_t6, "炒面","家常的青菜，胡萝卜丝，碰上筋道的面条，裹上鲜亮的酱油，在锅中翻滚，每一根面条都浸透了酱汁，入口回味无穷","￥5.0");
            resfoods.add(f6);
            Resfood f7 = new Resfood(R.mipmap.three_t7, "脆皮豆腐","在豆腐表面挂上一层糊．再下入油锅中炸至酥脆，淋上鲜香可口的酱汁，表皮松脆，内嫩香醇的脆皮豆腐总是很受欢迎","￥4.0");
            resfoods.add(f7);
            Resfood f8 = new Resfood(R.mipmap.three_t8, "饺子","饺子皮薄馅嫩，味道鲜美，形状独特，一口下去，汤汁四溢，香味扑鼻，多少年来受到人们的喜爱，对其简直百食不厌","￥6.0");
            resfoods.add(f8);
            Resfood f9 = new Resfood(R.mipmap.three_t9, "酱牛肉","以牛肉为主要食材，干辣椒、八角、桂皮少许为辅助食材烹饪而成，肉质松软，味道鲜美，入口回味无穷","￥6.0");
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

        adapter.setOnItemClickListener(new RecycleItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                Log.e("resposition", "=" + position);
//                Intent intent = new Intent();
//                intent.setClass(getActivity(), FoodDetailActivity.class);
//                startActivity(intent);
            }
        });

        return view;
    }


}
