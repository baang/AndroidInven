package com.example.kangjisung.likeroom.FragmentStamp;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.kangjisung.likeroom.R;

import java.util.ArrayList;
import java.util.List;

public class StampPagerAdapter extends PagerAdapter
{
    private LayoutInflater mInflater;
    private ArrayList<Integer> stampNumList;

    private int numOfStamp;
    private int numOfPage;
    private Context context;

    public StampPagerAdapter(Context c, int _numOfStamp){
        super();
        mInflater = LayoutInflater.from(c);
        numOfStamp = _numOfStamp;
        numOfPage = (numOfStamp > 0)? ((numOfStamp - 1) / 10 + 1):(1);
        stampNumList = new ArrayList<Integer>();
        context = c;

        int nowStamp;

        for(int p = 0; p < numOfPage; p++)
        {
            if((p + 1) * 10 < numOfStamp){
                nowStamp = 10;
            }
            else {
                nowStamp = numOfStamp % 10;
            }
            stampNumList.add(p, nowStamp);
        }
    }

    @Override
    public int getCount() {
        return numOfPage;
    }

    @Override
    public Object instantiateItem(View pager, int position) {
        final View view = mInflater.inflate(R.layout.stamp_page, null);

        ArrayList<RelativeLayout> stampListInPage = new ArrayList<>();

        stampListInPage.add((RelativeLayout)view.findViewById(R.id.layout_stamp_1));
        stampListInPage.add((RelativeLayout)view.findViewById(R.id.layout_stamp_2));
        stampListInPage.add((RelativeLayout)view.findViewById(R.id.layout_stamp_3));
        stampListInPage.add((RelativeLayout)view.findViewById(R.id.layout_stamp_4));
        stampListInPage.add((RelativeLayout)view.findViewById(R.id.layout_stamp_5));
        stampListInPage.add((RelativeLayout)view.findViewById(R.id.layout_stamp_6));
        stampListInPage.add((RelativeLayout)view.findViewById(R.id.layout_stamp_7));
        stampListInPage.add((RelativeLayout)view.findViewById(R.id.layout_stamp_8));
        stampListInPage.add((RelativeLayout)view.findViewById(R.id.layout_stamp_9));
        stampListInPage.add((RelativeLayout)view.findViewById(R.id.layout_stamp_10));

        for(int p=9; p>stampNumList.get(position)-1; p--) {
            RelativeLayout nowLayout = stampListInPage.get(p);
            RelativeLayout childLayout = (RelativeLayout) nowLayout.findViewById(R.id.stamp_layout);
            if (p == 4 || p == 9) {
                AppCompatImageView viewOff = (AppCompatImageView) childLayout.findViewById(R.id.view_off);
                viewOff.setVisibility(View.VISIBLE);
            } else {
                childLayout.setVisibility(View.GONE);
            }
        }
        if(10 <= stampNumList.get(position)){
            RelativeLayout nowLayout = stampListInPage.get(9);
            RelativeLayout childLayout = (RelativeLayout) nowLayout.findViewById(R.id.stamp_layout);
            Button button = (Button)childLayout.findViewById(R.id.button);
            button.setOnClickListener(new Button.OnClickListener(){
                @Override
                public void onClick(View onClickView){
                    StampUseDialog stampUseDialog = new StampUseDialog(context);
                    stampUseDialog.show();
                }
            });
        }
        if(5 <= stampNumList.get(position)){
            RelativeLayout nowLayout = stampListInPage.get(4);
            RelativeLayout childLayout = (RelativeLayout) nowLayout.findViewById(R.id.stamp_layout);
            Button button = (Button)childLayout.findViewById(R.id.button);
            button.setOnClickListener(new Button.OnClickListener(){
                @Override
                public void onClick(View onClickView){
                    StampUseDialog stampUseDialog = new StampUseDialog(context);
                    stampUseDialog.show();
                }
            });
        }

        ((ViewPager)pager).addView (view);

        return view;
    }

    @Override
    public void destroyItem(View pager, int position, Object view) {
        ((ViewPager)pager).removeView((View)view);
    }

    @Override
    public boolean isViewFromObject(View pager, Object obj) {
        return pager == obj;
    }

    @Override public void restoreState(Parcelable arg0, ClassLoader arg1) {}
    @Override public Parcelable saveState() { return null; }
    @Override public void startUpdate(View arg0) {}
    @Override public void finishUpdate(View arg0) {}
}