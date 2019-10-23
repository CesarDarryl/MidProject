package com.example.midproject.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.midproject.R;

import fragments.TentangFragment;

public class MainActivity extends AppCompatActivity {
    private TentangFragment tentangFragment;

    public MainActivity(TentangFragment tentangFragment) {
        this.tentangFragment = tentangFragment;

        Intent intent= new Intent(this, TentangActivity.class);
        startActivity(intent);
    }

    public static void addToBackStack(Object o) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IceCream(View view) {
    }

    public void HotDrink(View view) {
    }

    public void ColdDrink(View view) {
    }

    public void Tentang(View view) {
    }
}
