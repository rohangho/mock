package com.getterexample.android.screenshot1;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<CustomClass> products=new ArrayList<CustomClass>();
    ListAdapter adapt;
    String[] name;
    TypedArray im;
    ListView l;
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_notifications:
                    return true;
                case R.id.offer:
                    return true;
                case R.id.basket:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTextMessage = (TextView) findViewById(R.id.message);
        l=(ListView)findViewById(R.id.list);
        name=getResources().getStringArray(R.array.productlist);
        im=getResources().obtainTypedArray(R.array.picture);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        for(int i=0;i<name.length;i++)
        {
            CustomClass cc=new CustomClass(name[i],im.getResourceId(i,-1));
            products.add(cc);
        }
        ListAdapter adapter=new ListAdapter(this,products);
        l.setAdapter(adapter);
    }



}
