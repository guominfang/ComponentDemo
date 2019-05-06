package com.kwok.usermodule;

import android.content.Context;
import android.content.Intent;

import com.kwok.component.IUserService;

public class UserService implements IUserService {

    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context, LoginActivity.class);
        intent.putExtra(LoginActivity.EXTEA_TARGET_CLASS, targetClass);
        context.startActivity(intent);
    }
}
