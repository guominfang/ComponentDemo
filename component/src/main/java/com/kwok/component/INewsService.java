package com.kwok.component;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public interface INewsService {
    void launch(Context context, String targetClass);

    Fragment newNewsDetailsFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);
}
