package tk.zielony.materialrecents;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Created by Marcin on 2015-07-08.
 */
public class MyAdapter extends FragmentPagerAdapter
{
    static final int NUM_ITEMS = 10;

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {
        return RecentsFragment.newInstance();
    }
}
