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
import android.widget.ImageView;

import com.example.dell.muc_foods.Interface.RecycleItemClickListener;
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
            Resfood f1 = new Resfood(R.mipmap.first_r1, "肉末蛋包饭","米饭，西红柿，鸡肉，番茄酱，肉丁，鸡蛋。","￥9.0");
            resfoods.add(f1);
            Resfood f2 = new Resfood(R.mipmap.first_r2, "糖醋里脊盖饭","以猪里脊肉为主材，配以面粉，淀粉，醋等作料，色泽红亮，酸甜味美，外酥里嫩。让人食欲大开","￥9.0");
            resfoods.add(f2);
            Resfood f3 = new Resfood(R.mipmap.first_r3, "芋儿鸡火锅","这个火锅鸡最适合人多吃了，吃起来才有气氛、做兔子火锅也是这样做的","￥17.0");
            resfoods.add(f3);
            Resfood f4 = new Resfood(R.mipmap.first_r4, "豌豆牛肉盖饭","将牛肉切成丝状,依次加入生粉,蚝油,十三香,酱油,麻油,拌匀,腌制15分钟左右,备用;切碎香菜","￥9.0");
            resfoods.add(f4);
            Resfood f5 = new Resfood(R.mipmap.first_r5, "铁板黑椒牛柳","香嫩入味的牛肉遇到浓郁的黑椒酱料，再加上一个饱满的鸡蛋，营养丰富，口感饱满 回味悠长 ","￥9.0");
            resfoods.add(f5);
            Resfood f6 = new Resfood(R.mipmap.first_r6, "蒜苔肉丝","一道地道的川菜。口味咸鲜，制作以炒为主。蒜苔是家庭常吃之蔬菜，含有多种维生素和一些矿物质","￥16.0");
            resfoods.add(f6);
            Resfood f7 = new Resfood(R.mipmap.first_r7, "铁板香辣鸡腿肉","香辣的鸡腿与洋葱，胡萝卜进行翻炒，加以香辣的调料，热锅上油，翻炒入味，一口回味无穷","￥9.0");
            resfoods.add(f7);
            Resfood f8 = new Resfood(R.mipmap.first_r8, "铁板香辣鸡腿肉","铁板香辣鸡腿肉是一道以鸡腿为主要食材制作的美食","￥9.0");
            resfoods.add(f8);
            Resfood f9 = new Resfood(R.mipmap.first_r9, "香辣牛排","大葱 大蒜 花椒 酱油 料酒 辣椒酱 辣椒粉 蒜泥 白糖 香油","￥10.0");
            resfoods.add(f9);
            Resfood f10 = new Resfood(R.mipmap.first_r10, "香辣牛肉火锅","香辣牛肉火锅是一道家常川菜，味道麻辣鲜香，滑嫩适口","￥17.0");
            resfoods.add(f10);
        }else if(res_no.equals("2")){
            resfoods = new ArrayList<Resfood>();

        }else if(res_no.equals("3")){
            resfoods = new ArrayList<Resfood>();
            Resfood f1 = new Resfood(R.mipmap.three_r1, "小炒肉","主要食材是五花肉和青椒、红椒，主要烹饪工艺是炒","￥4.0");
            resfoods.add(f1);
            Resfood f2 = new Resfood(R.mipmap.three_r2, "手撕包菜","将包菜用手撕成片状，以保持其原汁原味不流失，再用干红辣椒和花椒爆炒","￥2.3");
            resfoods.add(f2);
            Resfood f3 = new Resfood(R.mipmap.three_r3, "杏鲍菇牛柳","杏鲍菇Q弹爽滑，牛肉鲜嫩多汁，看起来色泽鲜亮，入口更是层次丰富回味无穷","￥10.0");
            resfoods.add(f3);
            Resfood f4 = new Resfood(R.mipmap.three_r4, "牛肉米线","米线于开水中稍煮后捞出，放入肉汤中，一般拌入葱花、酱油、盐、味精、油辣、肉酱，趁热吃，滋味令人流连忘返","￥13.0");
            resfoods.add(f4);
            Resfood f5 = new Resfood(R.mipmap.three_r5, "羊杂米线","大碗内放青花椒，味精，盐，花椒面，卤油，竹漏瓢中装米线，在滚烫的羊肉汤中烫热，放入碗内，加羊肉汤","￥13.0");
            resfoods.add(f5);
            Resfood f6 = new Resfood(R.mipmap.three_r6, "西红柿鸡蛋面","西红柿、鸡蛋和面条。三者皆是日常可见、且容易寻得的食材。面品色泽鲜艳、味道鲜美","￥5.0");
            resfoods.add(f6);
            Resfood f7 = new Resfood(R.mipmap.three_r7, "香菇炒青菜","青菜（香港人管青菜叫小唐菜）、干香菇（放新鲜香菇也可以的）","￥4.0");
            resfoods.add(f7);
            Resfood f8 = new Resfood(R.mipmap.three_r8, "麻辣鸡丝面","鲜嫩的鸡肉被撕成松散的鸡丝，筋道的面条在热锅中翻滚，打捞入碗，加上特制的料汁，撒上葱花，香菜，辣椒粉","￥7.0");
            resfoods.add(f8);
        }else if(res_no.equals("4")){
            resfoods = new ArrayList<Resfood>();
        }


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_fragment_two);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Res_FoodAdapter adapter = new Res_FoodAdapter(getActivity(),resfoods);
        recyclerView.setAdapter(adapter);

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
