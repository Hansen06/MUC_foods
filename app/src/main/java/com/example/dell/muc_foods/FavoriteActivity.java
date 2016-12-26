package com.example.dell.muc_foods;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.dell.muc_foods.adapter.FavoriteAdapter;
import com.example.dell.muc_foods.adapter.Food_Adapte;
import com.example.dell.muc_foods.recyclerview.SpacesItemDecoration;
import com.example.dell.muc_foods.util.Favfood;
import com.example.dell.muc_foods.util.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2016/12/19.
 */

public class FavoriteActivity extends Activity {

    private RecyclerView mRecyclerView;
    FavoriteAdapter adapter;
    private List<Favfood> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favoritem);

        mRecyclerView = (RecyclerView) findViewById(R.id.fav_recyclerView);
        //设置layoutManager
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        //设置adapter
        initData();

        adapter = new FavoriteAdapter(this,foodList);
        mRecyclerView.setAdapter(adapter);
        SpacesItemDecoration decoration = new SpacesItemDecoration(16);
        mRecyclerView.addItemDecoration(decoration);
    }
    private void initData() {
        foodList = new ArrayList<Favfood>();
        Favfood f1 = new Favfood(R.mipmap.first_r6, "蒜苔肉丝","一道地道的川菜。口味咸鲜，制作以炒为主。蒜苔是家庭常吃之蔬菜，含有多种维生素和一些矿物质");
        foodList.add(f1);
        Favfood f2 = new Favfood(R.mipmap.first_t5, "京酱肉丝","咸甜适中，酱香浓郁，风味独特。选用猪里脊肉为主料，辅以黄酱或甜面酱及其它调味品");
        foodList.add(f2);
        Favfood f3 = new Favfood(R.mipmap.first_t9,"鱼香肉丝煲仔饭","主料为猪肉、黑木耳，辅料为胡萝卜、竹笋、辣椒等。猪肉选用三成肥、七成瘦的切丝滑炒，吃起来肉丝质地鲜嫩");
        foodList.add(f3);
        Favfood f4 = new Favfood(R.mipmap.three_t4, "咖喱鸡块饭","洋葱、香菇、胡萝卜、土豆、鸡胸肉切块，蒜切片，煸炒入味，融合咖喱，小火慢炖，收汁入味");
        foodList.add(f4);
        Favfood f5 = new Favfood(R.mipmap.three_t7, "脆皮豆腐","在豆腐表面挂上一层糊．再下入油锅中炸至酥脆，淋上鲜香可口的酱汁，表皮松脆，内嫩香醇的脆皮豆腐总是很受欢迎");
        foodList.add(f5);
        Favfood f6 = new Favfood(R.mipmap.three_t9, "酱牛肉","以牛肉为主要食材，干辣椒、八角、桂皮少许为辅助食材烹饪而成，肉质松软，味道鲜美，入口回味无穷");
        foodList.add(f6);
        Favfood f7 = new Favfood(R.mipmap.first_r5, "铁板黑椒牛柳","香嫩入味的牛肉遇到浓郁的黑椒酱料，再加上一个饱满的鸡蛋，营养丰富，口感饱满 回味悠长 ");
        foodList.add(f7);
        Favfood f8 = new Favfood(R.mipmap.three_r4, "牛肉米线","米线于开水中稍煮后捞出，放入肉汤中，一般拌入葱花、酱油、盐、味精、油辣、肉酱，趁热吃，滋味令人流连忘返");
        foodList.add(f8);
        Favfood f9 = new Favfood(R.mipmap.first_r9, "香辣牛排","大葱 大蒜 花椒 酱油 料酒 辣椒酱 辣椒粉 蒜泥 白糖 香油");
        foodList.add(f9);
        Favfood f10 = new Favfood(R.mipmap.first_r3, "芋儿鸡火锅","这个火锅鸡最适合人多吃了，吃起来才有气氛、做兔子火锅也是这样做的");
        foodList.add(f10);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
