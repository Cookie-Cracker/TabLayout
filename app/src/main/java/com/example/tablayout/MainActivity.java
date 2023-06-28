package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Adapter;

import com.example.tablayout.adapters.ViewPagerAdapter;
import com.example.tablayout.fragment.FavouritesFragment;
import com.example.tablayout.fragment.HomeFragment;
import com.example.tablayout.fragment.SettingsFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        setUpTabs();
    }

    private void setUpTabs() {

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabs);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new HomeFragment(), "Home");
        adapter.addFragment(new FavouritesFragment(), "Settings");
        adapter.addFragment(new SettingsFragment(), "Favourites");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.baseline_home_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.baseline_settings_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.baseline_favorite_24);
    }


}