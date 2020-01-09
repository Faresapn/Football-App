package com.faresa.footballapp.fragment;


import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.faresa.footballapp.R;
import com.google.android.material.tabs.TabLayout;

import static android.view.View.INVISIBLE;


/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends Fragment {

    private ViewPager viewPager;
    public TwoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_two, container, false);

        TabLayout tl = v.findViewById(R.id.viewpagertab);
        viewPager = v.findViewById(R.id.viewpager);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        viewPager.setAdapter(new viewpageradapter(getFragmentManager(), tl.getTabCount()));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tl));
        tl.setTabMode(TabLayout.MODE_FIXED);
        tl.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return  v;
    }

    private class viewpageradapter extends FragmentStatePagerAdapter {
        int no;
        private viewpageradapter(FragmentManager fm, int tabCount) {
            super(fm);
            this.no = tabCount;
        }

        @Override
        public int getCount() {
            return no;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new BPL_fragment();
                case 1:
                    return  new Laliga_Fragment();
                default:
                    return null;
            }

        }


    }
}
