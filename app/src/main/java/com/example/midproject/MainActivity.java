package com.example.midproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TentangFragment tentangFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstante) {
        View view= inflater.inflate(R.layout.fragment_tentang, container, false);
        return view;
    }

    public void IceCream(View view) {
    }

    public void HotDrink(View view) {
    }

    public void ColdDrink(View view) {
    }
}
