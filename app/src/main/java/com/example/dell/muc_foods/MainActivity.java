package com.example.dell.muc_foods;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.dell.muc_foods.Interface.RecycleItemClickListener;
import com.example.dell.muc_foods.adapter.Food_Adapte;
import com.example.dell.muc_foods.recyclerview.SpacesItemDecoration;
import com.example.dell.muc_foods.util.Food;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView mRecyclerView;
    private List<String> mDatas;
    private Food_Adapte mAdapter;
    private List<Food> foodList;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    SharedPreferences sharePreferState;
    private String state = null;
    private String user_name = null;

    private View headerLayout;
    private TextView tvUsername;
    private TextView tvUserdes;

    SharedPreferences sp_state;
    SharedPreferences.Editor editor_state;

    private String img_position = null;

    public String getImg_position() {
        return img_position;
    }

    public void setImg_position(String img_position) {
        this.img_position = img_position;
    }

    public static MainActivity instance = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instance = this;

        sharePreferState = getSharedPreferences("user_state", MODE_PRIVATE);
        state = sharePreferState.getString("state", null);// 读取SharedPreferences得到登录状态
        user_name = sharePreferState.getString("user_name", null);// 读取SharedPreferences得到登录用户名

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        headerLayout = navigationView.inflateHeaderView(R.layout.nav_header_main);
        tvUsername = (TextView)headerLayout.findViewById(R.id.username);
        tvUserdes = (TextView)headerLayout.findViewById(R.id.userdes);

        tvUsername.setText(user_name);
        tvUserdes.setText("muc food");

//        initDatas();
//        initViews();
//        mAdapter = new FoodAdapter(this,mDatas);
//        mRecyclerView.setAdapter(mAdapter);

//        //设置RecyclerView的布局管理
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
//        mRecyclerView.setLayoutManager(linearLayoutManager);
//
//        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));

        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerView);
        //设置layoutManager
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        //设置adapter
        initData();


//        RecycleItemClickListener itemClickListener = new RecycleItemClickListener() {
//            @Override
//            public void onItemClick(View view, int position) {
//                Log.e("position", "=" + position);
////                Toast.makeText(CommentMainActivity.this, productList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent();
//                intent.setClass(CommentMainActivity.this, FoodDetailActivity.class);
//                startActivity(intent);
//
//            }
//        };

        mAdapter = new Food_Adapte(foodList);
        mRecyclerView.setAdapter(mAdapter);
        //设置item之间的间隔
        SpacesItemDecoration decoration = new SpacesItemDecoration(16);
        mRecyclerView.addItemDecoration(decoration);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();


        // 获取只能被本应用程序读写的SharedPreferences对象
        sp_state = getSharedPreferences("choose_res", MODE_PRIVATE);
        editor_state = sp_state.edit();

        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter.setOnItemClickListener(new RecycleItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                setImg_position(String.valueOf(position));
                Log.e("position", "=" + position);
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, FoodDetailActivity.class);
                startActivity(intent);
            }
        });

    }

//    private void initViews() {
//
//        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerView);
//    }
//
//    private void initDatas() {
//        mDatas = new ArrayList<String>();
//        for (int i = 'A'; i <= 'z'; i++) {
//            mDatas.add("" + (char) i);
//        }
//    }

    private void initData() {
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

//        Food f16 = new Food(R.mipmap.f1, "美食1");
//        foodList.add(f16);
//        Food f17 = new Food(R.mipmap.f2, "美食2");
//        foodList.add(f17);
//        Food f18 = new Food(R.mipmap.f3, "美食3");
//        foodList.add(f18);
//        Food f19 = new Food(R.mipmap.f4, "美食4");
//        foodList.add(f19);
//        Food f20 = new Food(R.mipmap.f5, "美食5");
//        foodList.add(f20);
//        Food f21 = new Food(R.mipmap.f6, "美食6");
//        foodList.add(f21);
//        Food f22 = new Food(R.mipmap.f7, "美食7");
//        foodList.add(f22);
//        Food f23 = new Food(R.mipmap.f8, "美食8");
//        foodList.add(f23);
//        Food f24 = new Food(R.mipmap.f9, "美食9");
//        foodList.add(f24);
//        Food f25 = new Food(R.mipmap.f10, "美食0");
//        foodList.add(f25);
//        Food f26 = new Food(R.mipmap.f11, "美食11");
//        foodList.add(f26);
//        Food f27 = new Food(R.mipmap.f12, "美食12");
//        foodList.add(f27);
//        Food f28 = new Food(R.mipmap.f13, "美食13");
//        foodList.add(f28);
//        Food f29 = new Food(R.mipmap.f14, "美食14");
//        foodList.add(f29);
//        Food f30 = new Food(R.mipmap.f15, "美食15");
//        foodList.add(f30);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
//            case R.id.action_settings:
//
//                break;
            case R.id.action_add:
                mAdapter.addItem(1);
                break;
            case R.id.action_delete:
                mAdapter.deleteItem(1);
                break;
        }


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.one_restaurant) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, ResDatailActivity.class);
            intent.putExtra("click_meau", "1");

            editor_state.putString("res_no", "1");//存入登录状态
            editor_state.commit();//提交所有存入的数据

            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.two_restaurant) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,ResDatailActivity.class);
            intent.putExtra("click_meau", "2");

            editor_state.putString("res_no", "2");//存入登录状态
            editor_state.commit();//提交所有存入的数据

            startActivity(intent);

        } else if (id == R.id.three_restaurant) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,ResDatailActivity.class);
            intent.putExtra("click_meau", "3");
            editor_state.putString("res_no", "3");//存入登录状态
            editor_state.commit();//提交所有存入的数据

            startActivity(intent);

        } else if (id == R.id.four_restaurant) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,ResDatailActivity.class);
            intent.putExtra("click_meau", "4");

            editor_state.putString("res_no", "4");//存入登录状态
            editor_state.commit();//提交所有存入的数据

            startActivity(intent);

        } else if (id == R.id.my_collect) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, FavoriteActivity.class);
            startActivity(intent);

        } else if (id == R.id.setting) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.dell.muc_foods/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.dell.muc_foods/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        this.finish();
    }
}
