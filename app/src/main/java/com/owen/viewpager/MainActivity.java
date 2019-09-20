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
    
       //set color picker in inter form
        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };

        
        //set the onPager listener to the view adapter setter to the adapter
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, floatpositionOffset , int  positionPixel 1) 
            {
                  //check if the adapter has no image then set default background
                if (position < (adapter.getCount() -1 ) && position < (colors.length -1) )
                {
                    //TODO
                    viewPager.setBackgroundColor((Integer)
                            argbEvaluator.evaluate( positionOffset,
                                    colors[position],
                                    colors[position + 1] ));
                }
                else
                {
                    viewPager.setBackgroundColor(colors[colors.length -1]);
                }
                
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) 
            {
                //get the numbers of pagers
            }
        });

    }
    }
}
