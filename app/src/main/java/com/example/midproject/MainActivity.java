package com.example.midproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.midproject.activities.TentangActivity;

public class MainActivity extends AppCompatActivity {
    private TentangFragment tentangFragment;

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
        Intent intent= new Intent(this, TentangActivity.class);
        startActivity(intent);
    }
}
