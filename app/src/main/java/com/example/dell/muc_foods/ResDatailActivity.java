package com.example.dell.muc_foods;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.example.dell.muc_foods.res_fragment.Res_FragmentOne;
import com.example.dell.muc_foods.res_fragment.Res_FragmentTwo;

/**
 * Created by DELL on 2016/11/9.
 */
public class ResDatailActivity extends AppCompatActivity{


    SharedPreferences sharePreferState;

    private String show_res_no = null;

    public String getShow_res_no() {
        return show_res_no;
    }

    public void setShow_res_no(String show_res_no) {
        this.show_res_no = show_res_no;
    }

    public static ResDatailActivity res_instance = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_detail);

        res_instance = this;

        ViewPager viewPager= (ViewPager) findViewById(R.id.re_view_pager_detail );
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.re_tab_layout);
        tabLayout.setTabsFromPagerAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        Toolbar tb= (Toolbar) findViewById(R.id.re_detail);
        tb.setNavigationIcon(R.mipmap.ic_arrow_back_white);

        Intent intent = getIntent();
        String meau_id = intent.getStringExtra("click_meau");


//        sharePreferState = getSharedPreferences("choose_res", MODE_PRIVATE);
//        String meau_id = sharePreferState.getString("res_no", null);// 读取SharedPreferences得到登录状态
        Log.e("meau_id", "=" + meau_id);

        if(meau_id.equals("1")){
            tb.setTitle("第一学生餐厅（风味餐厅）");
            setShow_res_no("1");
        }else if(meau_id.equals("2")){
            tb.setTitle("第二学生餐厅");
            setShow_res_no("2");
        }else if(meau_id.equals("3")){
            tb.setTitle("第三学生餐厅");
            setShow_res_no("3");
        }else if(meau_id.equals("4")){
            tb.setTitle("第四学生餐厅");
            setShow_res_no("4");
        }

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ResDatailActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }


    private class MyPagerAdapter extends FragmentStatePagerAdapter {


        private MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:return Res_FragmentOne.newInstance();
                case 1:return Res_FragmentTwo.newInstance();
//                case 2:return Res_FragmentThree.newInstance();
                default:return Res_FragmentOne.newInstance();
            }
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:return "推荐";
                case 1:return "热门";
//                case 2:return "最新";
                default:return "热门";
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /**
     * Created by DELL on 2016/12/19.
     */

    public static class FavoriteActivity extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.favoritem);
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
        }
    }
}
