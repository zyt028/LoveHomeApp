package com.lovehome.lovehome;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/8/9.
 */
public class LoveHome extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.home_pager_title_layout, null);
        return v;

    }

}
