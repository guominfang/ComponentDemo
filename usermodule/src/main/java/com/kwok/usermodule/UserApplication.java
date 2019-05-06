package com.kwok.usermodule;

import android.app.Application;

import com.kwok.component.IAppComponent;
import com.kwok.component.ServiceFactory;

public class UserApplication extends Application implements IAppComponent {

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
        ServiceFactory.getInstance().setUserService(new UserService());
    }
}
