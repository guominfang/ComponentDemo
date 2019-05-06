package com.kwok.newsmodule;

import android.app.Application;

import com.kwok.component.IAppComponent;
import com.kwok.component.ServiceFactory;

public class NewsApplication extends Application implements IAppComponent {

    private static Application application;

    public Application getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application app) {
        application = app;
        ServiceFactory.getInstance().setNewsService(new NewsService());
    }
}
