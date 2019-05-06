package com.kwok.component;

public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return instance;
    }

    private ServiceFactory() {};

    private IUserService mUserService;
    private INewsService mNewsService;

    public IUserService getUserService() {
        return mUserService;
    }

    public void setUserService(IUserService mUserService) {
        this.mUserService = mUserService;
    }

    public INewsService getNewsService() {
        return mNewsService;
    }

    public void setNewsService(INewsService mNewsService) {
        this.mNewsService = mNewsService;
    }
}
