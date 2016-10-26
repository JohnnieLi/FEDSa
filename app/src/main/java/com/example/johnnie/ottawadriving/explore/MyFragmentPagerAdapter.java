package com.example.johnnie.ottawadriving.explore;



import android.content.Context;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.johnnie.ottawadriving.R;
import com.example.johnnie.ottawadriving.listcomponent.InsuranceFragment;
import com.example.johnnie.ottawadriving.listcomponent.LawyerFragment;
import com.example.johnnie.ottawadriving.listcomponent.LicenseTranFragment;
import com.example.johnnie.ottawadriving.listcomponent.DealerFragment;
import com.example.johnnie.ottawadriving.listcomponent.TrainingCourseFragment;


/**
 * Created by Johnnie on 2016-09-14.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {


     private Fragment mMyListFragment;
    final int PAGE_COUNT = 5;
    // Tab Titles
    private String[] tabtitles;
    Resources res;


    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        res = context.getResources();
        tabtitles = res.getStringArray(R.array.mainPageTitles);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }


    //initialize the different fragments when the page selected, pass the title
    //so the listFragment will use title as the search key word.
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: //License
                mMyListFragment =  LicenseTranFragment.newInstance("bmw");
                break;
            case 1: // Training
                mMyListFragment =  TrainingCourseFragment.newInstance("audi");
                break;
            case 2: //Dealer
                mMyListFragment =  DealerFragment.newInstance("bmw");
                break;

            case 3: //Insurance
                mMyListFragment =  InsuranceFragment.newInstance("mercedes");
                break;
            case 4://Lawyer
                mMyListFragment =  LawyerFragment.newInstance("audi");
                break;
            default:
                mMyListFragment =  DealerFragment.newInstance("bmw");

        }
        return mMyListFragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitles[position];
    }
}
