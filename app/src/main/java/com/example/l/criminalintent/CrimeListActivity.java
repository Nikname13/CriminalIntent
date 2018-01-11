package com.example.l.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by L on 13.10.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
