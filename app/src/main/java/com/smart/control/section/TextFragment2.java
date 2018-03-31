package com.smart.control.section;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * @author:dongpo 创建时间: 2016/9/3
 * 描述:
 * 修改:
 */
public class TextFragment2 extends Fragment {

    int count;
    View rootView;
    private FragmentStack mFragmentStack;
    public static final String KEY_COUNT = "count";
    private int mCount;
    Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.activity_main2, container, false);
        rootView = inflate;
        mContext = getActivity();
        initView();

        Log.e("====<", "onCreateView");

        return inflate;
    }

    private void initView() {
        mFragmentStack = FragmentStack.create(getActivity().getSupportFragmentManager(), R.id.fl_container2);
        rootView.findViewById(R.id.btn_push).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCount++;
                TemFragment fragment = new TemFragment();
                Bundle args = new Bundle();
                args.putInt(KEY_COUNT, mCount);
                fragment.setArguments(args);
                mFragmentStack.push(fragment, null);
            }
        });

        rootView.findViewById(R.id.btn_pop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mFragmentStack.hasBackStack()) {
                    mCount--;
                    mFragmentStack.pop(true);
                }
            }
        });

        rootView.findViewById(R.id.btn_replace).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFragmentStack.replace(new TextFragment3(), null);
            }
        });

        rootView.findViewById(R.id.btn_clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFragmentStack.clear();
            }
        });

    }


    @Override
    public void onResume() {
        super.onResume();
        Log.e("====<", "onResume2：" + count);
    }
}
