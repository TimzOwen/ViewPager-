package com.owen.viewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

//create an adapter inflator view

public class Adapter extends PagerAdapter {


    private List<Model> models;
    private LayoutInflater layoutInflater;
    private Context context;

    //generate constructor
    public Adapter(List<Model> models, Context context)
    {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount()
    {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object)
    {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position)
    {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item, container , false);

        ImageView imgView;
        TextView tvTitle, tvDesc;

        imgView = view.findViewById(R.id.iv_Image);
        tvTitle = view.findViewById(R.id.tvTitle);
        tvDesc = view.findViewById(R.id.description);

        //set the next image, text, and title on line
        imgView.setImageResource(models.get(position).getImage());
        tvTitle.setText(models.get(position).getTitle());
        tvDesc.setText(models.get(position).getDesc());

        //adds a view to the created child from the text of the inflater tev
        container.addView(view);

        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((View)object);
    }
}
