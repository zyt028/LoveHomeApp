package com.lovehome.lovehomeapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.lovehome.lovehome.LoveHome;
import com.lovehome.my.My;
import com.lovehome.publish.Publish;

public class MainActivity extends FragmentActivity {

    public void myclick(View view){
        switch(view.getId()){
            case R.id.home_btn:{
                FragmentTransaction ft=fm.beginTransaction();
                LoveHome f=new LoveHome();
                ft.replace(R.id.content, f);
                ft.addToBackStack(null);
                ft.commit();
                break;
            }
            case R.id.publish_btn:{
                FragmentTransaction ft=fm.beginTransaction();
                Publish f=new Publish();
                ft.replace(R.id.content, f);
                ft.addToBackStack(null);
                ft.commit();
                break;
            }
            case R.id.wode_btn:{
                FragmentTransaction ft=fm.beginTransaction();
                My f=new My();
                ft.replace(R.id.content, f);
                ft.addToBackStack(null);
                ft.commit();
                break;
            }
        }
    }


    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        //加载的第一个碎片界面
        fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        LoveHome lh=new LoveHome();
        ft.add(R.id.content, lh);
        ft.commit();

    }
}
