package com.example.android.theworldofharrypotter;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the viewpager
        ViewPager viewPager = findViewById(R.id.viewPager);

        //Find the tablayout
        TabLayout tabLayout = findViewById(R.id.tabs);
    }
}
