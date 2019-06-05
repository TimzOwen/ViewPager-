package com.owen.viewpager;

import android.animation.ArgbEvaluator;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    List <Model> models;
    Adapter adapter;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        
        
        //add the products using the models
        models = new ArrayList<>(models);
        models.add(new Model(R.drawable.brochure, "Bronchure", "The biggest Logos Design"));
        models.add(new Model(R.drawable.sticker, "Sticker", "Sticker sellers in the Market"));
        models.add(new Model(R.drawable.poster, "Poster", "Get your Poster Designed Here"));
        models.add(new Model(R.drawable.namecard, "Name Card", "What's your taf name Owen?"));

        adapter = new Adapter(models, this);

        viewPager = findViewById(R.id.scrollViewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);
        
        //set the onPager listener to the view adapter setter to the adapter
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }
    }
}
