package com.kwok.newsmodule;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.kwok.component.INewsService;

public class NewsService implements INewsService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context, NewsActivity.class);
        intent.putExtra(NewsActivity.EXTEA_TARGET_CLASS, targetClass);
        context.startActivity(intent);
    }

    @Override
    public Fragment newNewsDetailsFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        NewsDetailsFragment fragment = new NewsDetailsFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(viewId,fragment).commit();
        return fragment;
    }
}
