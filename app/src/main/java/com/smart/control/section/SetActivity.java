package com.smart.control.section;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class SetActivity extends AppCompatActivity {

    private List<Fragment> mList;
    private FragmentPagerAdapter adapter;
    private ViewPager viewPager;
    Button btn;
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);
        initData();
        initView();
    }

    private void initData() {
        mList = new ArrayList<>();
        TextFragment fragmentEzviz = new TextFragment();
        TextFragment2 fragmentEzviz2 = new TextFragment2();
        TextFragment3 fragmentEzviz3 = new TextFragment3();
        TextFragment4 fragmentEzviz4 = new TextFragment4();
        mList.add(fragmentEzviz);
        mList.add(fragmentEzviz2);
        mList.add(fragmentEzviz3);
        mList.add(fragmentEzviz4);

        adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {

            @Override
            public int getCount() {
                return mList.size();
            }

            @Override
            public Fragment getItem(int arg0) {
                return mList.get(arg0);
            }
        };
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                btn.setTextColor(getResources().getColor(R.color.write));
                btn1.setTextColor(getResources().getColor(R.color.write));
                btn2.setTextColor(getResources().getColor(R.color.write));
                btn3.setTextColor(getResources().getColor(R.color.write));
                switch (position) {
                    case 0:
                        btn.setTextColor(getResources().getColor(R.color.colorAccent));
                        break;
                    case 1:
                        btn1.setTextColor(getResources().getColor(R.color.colorAccent));
                        break;
                    case 2:
                        btn2.setTextColor(getResources().getColor(R.color.colorAccent));
                        break;
                    case 3:
                        btn3.setTextColor(getResources().getColor(R.color.colorAccent));
                        break;
                }

            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        btn = (Button) findViewById(R.id.viewpager_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0, true);
            }
        });
        btn1 = (Button) findViewById(R.id.viewpager_btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1, true);
            }
        });
        btn2 = (Button) findViewById(R.id.viewpager_btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2, true);
            }
        });
        btn3 = (Button) findViewById(R.id.viewpager_btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(3, true);
            }
        });


    }


}
