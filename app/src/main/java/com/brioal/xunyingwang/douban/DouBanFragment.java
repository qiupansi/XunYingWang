package com.brioal.xunyingwang.douban;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.brioal.xunyingwang.R;
import com.brioal.xunyingwang.base.BaseFragment;

/**
 * email:brioal@foxmail.com
 * github:https://github.com/Brioal
 * Created by Brioal on 2017/8/1.
 */

public class DouBanFragment extends BaseFragment {
    private static DouBanFragment sFragment;

    public static synchronized DouBanFragment getInstance() {
        if (sFragment == null) {
            sFragment = new DouBanFragment();
        }
        return sFragment;
    }

    private View mRootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fra_layout_blank, container, false);
        return mRootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
