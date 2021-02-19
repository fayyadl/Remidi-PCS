package com.fayyad.qiuqiubola;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;


import com.fayyad.qiuqiubola.Fragment.ClubPremierFragment;
import com.fayyad.qiuqiubola.Fragment.FavoriteFragment;
import com.fayyad.qiuqiubola.Fragment.SportsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentPage(new ClubPremierFragment());
        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                switch (item.getItemId()){
                    case R.id.clubs:
                        fragment = new ClubPremierFragment();
                        break;

                    case R.id.team:
                        fragment = new SportsFragment();
                        break;

                    case R.id.favorite:
                        fragment = new FavoriteFragment();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });
    }


    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}