package com.test.hassan.codey;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static android.R.attr.value;

/**
 * Created by Hassan on 13-Oct-16.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int arg0)
    {
        switch(arg0){
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentExtra();
            case 3:
                return new FragmentThree();
            case 4:
                return new FragmentFour();
            case 5:
                return new FragmentFive();
            case 6:
                return new FragmentSix();
            case 7:
                return new FragmentSeven();
            case 8:
                return new FragmentEight();
            case 9:
                return new FragmentNine();
            case 10:
                return new FragmentTen();
            case 11:
                return new FragmentEleven();
            case 12:
                return new FragmentTwelve();
            case 13:
                return new FragmentThirteen();
            case 14:
                return new FragmentFourteen();
            case 15:
                return new FragmentFifteen();
            default:
                break;
        }


        return null;
    }

    @Override
    public int getCount()
    {
        return 16;
    }


}
