package com.kwok.mainmodule;

import android.app.Application;

import com.kwok.component.AppConfig;
import com.kwok.component.IAppComponent;

public class MainApplication extends Application implements IAppComponent {

    private static MainApplication application;

    public MainApplication getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application app) {
        for (String component : AppConfig.COMPONENT) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof IAppComponent) {
                    ((IAppComponent)object).initialize(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
