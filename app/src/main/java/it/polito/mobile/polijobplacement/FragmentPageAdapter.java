package it.polito.mobile.polijobplacement;

/**
 * Created by Admin on 5/6/2015.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.ViewGroup;


public class FragmentPageAdapter extends FragmentPagerAdapter {

    private final FragmentManager mFragmentManager;
    private FragmentTransaction mCurTransaction = null;

    final int PAGE_COUNT = 3;
    private String  ku[]= {"Home","Inbox","My Application"};
    private List<Fragment> fragments;

    private Bundle searchResults=null;

    public FragmentPageAdapter(FragmentManager fm) {
        super(fm);
        this.mFragmentManager = fm;
    }

    /* @Override
     public Fragment getItem(int position) {
         Fragment fragment = new TabbedContentFragment();
         Bundle args = new Bundle();
         args.putInt(TabbedContentFragment.ARG_SECTION_NUMBER, position + 1);
         fragment.setArguments(args);
         return fragment;
     }*/





    private Context context;

    /*public FragmentPageAdapter(FragmentManager fm, Context context) {
        super(fm);
       this.mFragmentManager = fm;
        this.context = context;

    }
*/
    public void setSearchResults(Bundle results) {
        this.searchResults=results;
    }

    public Bundle getSearchResults() {
        return searchResults;
    }



    @Override
    public int getCount() {
        return PAGE_COUNT;

    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public Fragment getItem(int position) {


        switch (position) {
            case 0:{
                Fragment f=Compay_List_ViewFragment.newInstance("Company_2" ,"" ,"", searchResults);
                return  f;
            }
            case 1:{
                inboxFragment f= new inboxFragment();
                return  f;
            }
            case 2:
                Fragment f=InboxActivity.newInstance("" ,"" ,"", searchResults);
                return f;

            default:
                break;
        }
        return null;

    }



    /*@Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position

    	String tabTitles[]  =context.getResources().getStringArray(R.array.Tab_array);
        return tabTitles[position];

    }*/
    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();

        switch (position) {
            case 0:

                return ku[0];
            case 1:
                return ku[1];
            case 2:
                return ku[2];
        }
        return null;
    }

}
