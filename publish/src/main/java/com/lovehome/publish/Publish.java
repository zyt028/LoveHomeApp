package com.lovehome.publish;

import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lovehome.publish.http.HttpUrl;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/9.
 */
public class Publish extends Fragment {


    int[] imgs={R.mipmap.meishi,R.mipmap.yule,R.mipmap.fangchan,R.mipmap.che,
                R.mipmap.hunqing,R.mipmap.zhuangxiu,R.mipmap.jiaoyu,R.mipmap.gongzuo,
                R.mipmap.baihuo,R.mipmap.tiaozhao,R.mipmap.shangwu,R.mipmap.bianmin,
                R.mipmap.laoxianghui,R.mipmap.qita};//图片数据源
    String[] msgs={"美食","娱乐","房产","车",
                   "婚庆","装修","教育","工作",
                   "百货","跳蚤","商务","便民",
                   "老乡会","其他" };//文字数据源


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.publish_layout, null);

        GridView gw= (GridView) v.findViewById(R.id.grid_view);
        gw.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {return msgs.length;}

            @Override
            public Object getItem(int i) {return null;}

            @Override
            public long getItemId(int i) {return 0;}

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {

                view=LayoutInflater.from(getActivity()).inflate(R.layout.gridview_layout, null);
                ((ImageView)view.findViewById(R.id.classify_img)).setImageResource(imgs[i]);
                ((TextView)view.findViewById(R.id.classify_text)).setText(msgs[i]);
                return view;
            }
        });

        gw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {
                //Toast.makeText(getActivity(), msgs[i], Toast.LENGTH_SHORT).show();
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        PopupWindow pp=new PopupWindow();
                    }
                });
            }
        });

        return v;

    }

}