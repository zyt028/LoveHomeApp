package com.lovehome.publish.http;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lovehome.publish.http.HttpUrl;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/10.
 */
public class HttpPublish extends Fragment {

    /*
    private ArrayList<Publishdata> weathers = new ArrayList<>();

    int[] imgs={};//图片数据源
    String[] msgs={};//文字数据源

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
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), msgs[i], Toast.LENGTH_SHORT).show();
            }
        });

        initData();
        return v;

    }
    */


    /*获取网络数据*/
    /*
    public void initData() {
        new AsyncTask(){

            @Override
            protected Object doInBackground(Object[] params) {
                try {
                    URL url = new URL(HttpUrl.CLASSIFY_IMG);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("GET");
                    conn.setReadTimeout(6000);

                    if(conn.getResponseCode() == 200){
                        InputStream in = conn.getInputStream();
                        byte[] bytes = new byte[1024*512];
                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                        int len = 0;
                        while ((len = in.read(bytes)) > 0){
                            baos.write(bytes , 0 , len);
                        }

                        String result = new String(baos.toByteArray());

                        baos.close();
                        in.close();
                        conn.disconnect();

                        JSONObject obj = new JSONObject(result);
                        String status = obj.getString("msg");
                        if(status.equals("success")){
                            JSONArray lists = obj.getJSONArray("list");
                            JSONObject jo = lists.getJSONObject(0);

                            //使用Gson
                            //1.创建Gson对象
                            Gson gson = new Gson();

                            String list = jo.getString("list");
                            Log.e("TAG","名字：：" + list);

                            //先清空数据源里的老数据
                            weathers.clear();
                            //专门用于将json字符串转化为对应形式的集合
                            //参数2：Type类型

                            ArrayList<Publishdata> data = gson.fromJson(list,new TypeToken<ArrayList<Publishdata>>(){}.getType());
                            weathers.addAll(data);
                            Log.e("TAG","W:"+weathers);
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
                protected void onPostExecute(Object o) {
                    super.onPostExecute(o);
                   // Toast.makeText(MainActivity.this , result , Toast.LENGTH_SHORT).show();

                    cityName.setText(currentCity);
                    titleCity.setText(currentCity);
                    if(weathers != null && weathers.size() > 0){
                        Weather e = weathers.get(0);

                        String weatherStr = e.getWeather();
                        String windStr = e.getWind();
                        String dayPicStr = e.getDayPictureUrl();

                        weatherDesc.setText(weatherStr);
                        wind.setText(windStr);
                        //使用Picasso框架将图片加载到对应控件
                        Picasso.with(MainActivity.this).load(dayPicStr).into(dayWeatherPic);

                        //通知适配器更新
                        adapter.notifyDataSetChanged();

                    }
                }

        }.execute();



    }
    */
}
