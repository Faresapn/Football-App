package com.faresa.footballapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.faresa.footballapp.fragment.OneFragment;
import com.faresa.footballapp.fragment.TwoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView navigation = findViewById(R.id.btm_nav);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        moveFragment(new OneFragment());


    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            switch (menuItem.getItemId()) {
                case R.id.first:
                    moveFragment(new OneFragment());

                    break;

                case R.id.search:

                    moveFragment(new TwoFragment());
                    break;
                case R.id.dolar:
                    moveFragment(new TwoFragment());
                    break;
                case R.id.akun:
                    moveFragment(new TwoFragment());
                    break;

            }
            menuItem.setCheckable(true);
            menuItem.setChecked(true);

            return false;
        }
    };
    void moveFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View v) {

    }
}


