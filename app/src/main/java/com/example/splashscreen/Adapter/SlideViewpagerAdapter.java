package com.example.splashscreen.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.splashscreen.R;

public class SlideViewpagerAdapter extends PagerAdapter {
    public SlideViewpagerAdapter(Context ctx) {
        this.ctx = ctx;
    }

    Context ctx;


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slidescreen, container,false);

        ImageView logo = view.findViewById(R.id.image1);
        ImageView ind1 =view.findViewById(R.id.ind1);
        ImageView ind2 =view.findViewById(R.id.ind2);
        ImageView ind3 =view.findViewById(R.id.ind3);
        ImageView ind4 = view.findViewById(R.id.ind4);

        TextView text1= view.findViewById(R.id.textview1);
        TextView text2=view.findViewById(R.id.textview2);
        TextView text3=view.findViewById(R.id.textview3);
       
        switch (position){
            case 0:
                logo.setImageResource(R.drawable.join);
                ind1.setImageResource(R.drawable.scrolling1);
                ind2.setImageResource(R.drawable.scrolling);
                ind3.setImageResource(R.drawable.scrolling);
                ind4.setImageResource(R.drawable.scrolling);
                text1.setText("JOIN CONTEST");
                text2.setText("Play as many contests and tournaments to complete with users worldwide.");
                text3.setText("Get Started");

                break;
            case 1:
                logo.setImageResource(R.drawable.earn);
                ind1.setImageResource(R.drawable.scrolling);
                ind2.setImageResource(R.drawable.scrolling1);
                ind3.setImageResource(R.drawable.scrolling);
                ind4.setImageResource(R.drawable.scrolling);
                text1.setText("EARN CONTEST");
                text2.setText("Each contest and tournament will give you a chance to earn your winnings.");
                text3.setText("Get Started");
                break;
            case 2:
                logo.setImageResource(R.drawable.pvt);
                ind1.setImageResource(R.drawable.scrolling);
                ind2.setImageResource(R.drawable.scrolling);
                ind3.setImageResource(R.drawable.scrolling1);
                ind4.setImageResource(R.drawable.scrolling);
                text1.setText("PRIVATE CONTEST");
                text2.setText("Each contest and tournament will give you a chance to earn your winnings");
                text3.setText("Get Started");
                break;
            case 3:
                logo.setImageResource(R.drawable.refer);
                ind1.setImageResource(R.drawable.scrolling);
                ind2.setImageResource(R.drawable.scrolling);
                ind3.setImageResource(R.drawable.scrolling);
                ind4.setImageResource(R.drawable.scrolling1);
                text1.setText("REFER AND EARN");
                text2.setText("Each contest and tournament will give you a chance to earn your winnings");
                text3.setText("Get Started");
                break;


        }


        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}
