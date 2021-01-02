package com.example.androidshaper.databinddingbasic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.androidshaper.databinddingbasic.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //        setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        //        setContentView(activityMainBinding.getRoot());

        //        activityMainBinding.setMyVariable("Hello Databinding...");

        User user = new User("Yours Truly", 16, true, "https://i.picsum.photos/id/237/536/354.jpg?hmac=i0yVXW1ORpyCZpQ-CknuyV-jbtU7_x9EBQVhvT5aRr0");

        activityMainBinding.setUser(user);

        //        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View v) {
        //                Toast.makeText(MainActivity.this, "123", Toast.LENGTH_SHORT).show();
        //            }
        //        });
    }
}