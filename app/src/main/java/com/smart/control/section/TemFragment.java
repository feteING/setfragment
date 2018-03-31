package com.smart.control.section;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * @author:dongpo 创建时间: 2016/9/3
 * 描述:
 * 修改:
 */
public class TemFragment extends Fragment implements View.OnClickListener {

    int count;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_section, container, false);

        count = getArguments().getInt(MainActivity.KEY_COUNT);
        TextView tvCount = (TextView) inflate.findViewById(R.id.tv_count);
        tvCount.setText("This is " + count + " fragment");
        Log.e("====<", "onCreateView");

        return inflate;
    }

    @Override
    public void onClick(View v) {
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("====<", "onResume==：" + count);
    }
}
