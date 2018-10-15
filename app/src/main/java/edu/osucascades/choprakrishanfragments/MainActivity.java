package edu.osucascades.choprakrishanfragments;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a reference to buttons
        Button fragment1btn = (Button) findViewById(R.id.fragmentbtn1);
        Button fragment2btn = (Button) findViewById(R.id.fragment2btn);

        //create listeners
        fragment1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(v);
            }
        });

        fragment2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(v);
            }
        });
    }

    public void changeFragment(View view) {
        //create a reference to a fragment object
        Fragment fragment;
        if (view == findViewById(R.id.fragmentbtn1)) {
            fragment = new Fragment1();
            //create an instance of the fragment manager
            FragmentManager fn = getSupportFragmentManager();
            fn.beginTransaction() //starts the fragment mapping
                    .replace(R.id.fragment_container, fragment)
                    .commit();
        }

        if (view == findViewById(R.id.fragment2btn)) {
            fragment = new Fragment2();
            //create an instance of the fragment manager
            FragmentManager fn = getSupportFragmentManager();
            fn.beginTransaction() //starts the fragment mapping
                    .replace(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
