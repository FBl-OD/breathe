

package com.breathe.ting.android.opensdk.test.fragment.base;

import android.support.v4.app.Fragment;
import android.view.View;

public class BaseFragment extends Fragment {

    public void refresh() {
    }


    public View findViewById(int id) {
        return getView().findViewById(id);
    }
}

