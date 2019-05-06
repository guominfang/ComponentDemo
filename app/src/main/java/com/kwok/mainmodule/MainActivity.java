package com.kwok.mainmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kwok.component.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpUserModule(View view) {
        ServiceFactory.getInstance().getUserService().launch(MainActivity.this,"");
    }

    public void jumpNewsModule(View view) {
        ServiceFactory.getInstance().getNewsService().launch(MainActivity.this, "");
    }

    public void addFragment(View view) {
        Bundle bundle = new Bundle();
        ServiceFactory.getInstance().getNewsService().newNewsDetailsFragment(getSupportFragmentManager(),
                R.id.container,bundle);
    }
}
