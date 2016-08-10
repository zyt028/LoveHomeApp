package com.lovehome.publish;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/8/10.
 */
public class ChildClassify extends Activity {
    Object[] objects={"买卖","租赁","其他"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        //准备好适配器
        ArrayAdapter adapter=new ArrayAdapter(this, R.layout.listview__model_layout, R.id.city_name, objects);

        //获取ListView控件,以便填充数据进去
        ListView myList=(ListView)findViewById(R.id.publish_listview);
        myList.setAdapter(adapter);

        //设置ListView的项选择事件
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //	TextView textView=(TextView)view.findViewById(R.id.city_name);
                //	String msg="点击了第"+position+"项,名字是:"+textView.getText();
                String msg="点击了第"+position+"项,名字是:"+objects[position];
                Toast.makeText(ChildClassify.this,msg, Toast.LENGTH_LONG).show();
            }
        });
    }
}
