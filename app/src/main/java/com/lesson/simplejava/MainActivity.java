package com.lesson.simplejava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageFilterButton button=findViewById(R.id.ib_car);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(count==1) button.setImageDrawable(getResources().getDrawable(R.drawable.car1));
                if(count==2) button.setImageDrawable(getResources().getDrawable(R.drawable.car2));
                if(count==3) button.setImageDrawable(getResources().getDrawable(R.drawable.car3));
                if(count%3==0) count=0;
            }
        });
    }
}