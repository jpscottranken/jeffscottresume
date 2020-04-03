package com.example.jeffscottresume.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.jeffscottresume.fragment.CompanyFragment;
import com.example.jeffscottresume.fragment.ProfileFragment;
import com.example.jeffscottresume.fragment.ProjectFragment;
import com.example.jeffscottresume.fragment.SchoolFragment;

//	NOTE: 	The ViewPager is what allows a user the opportunity
//			flip left and right through the screesn in the app.
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment selectedFragment;

        switch (position) {
            case 0:
                selectedFragment = new ProfileFragment();
                break;

            case 1:
                selectedFragment = new SchoolFragment();
                break;

            case 2:
                selectedFragment = new ProjectFragment();
                break;

            case 3:
                selectedFragment = new CompanyFragment();
                break;

            default:
                selectedFragment = new ProfileFragment();
                break;
        }

        return selectedFragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";

        switch (position)
        {
            case 0:
                title = "Personal Info";
                break;

            case 1:
                title = "Education";
                break;

            case 2:
                title = "Projects";
                break;

            case 3:
                title = "Employment";
                break;
        }

        return title;
    }
}
