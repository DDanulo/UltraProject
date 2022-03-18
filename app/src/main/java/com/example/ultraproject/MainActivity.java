package com.example.ultraproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private final NavigationFragment navigationFragment = new NavigationFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.MainActivity, navigationFragment);
        ft.commit();
    }
}
<<<<<<< HEAD
=======
//test
>>>>>>> 7f7b838 (test)
