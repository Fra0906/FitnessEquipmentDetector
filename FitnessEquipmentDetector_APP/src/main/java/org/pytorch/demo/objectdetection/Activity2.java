package org.pytorch.demo.objectdetection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ImageView im1 = (ImageView)findViewById(R.id.im1);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivity3(); }
        });

        ImageView im2 = (ImageView)findViewById(R.id.im2);
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivity4(); }
        });

        ImageView im3 = (ImageView)findViewById(R.id.im3);
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivity5(); }
        });

        ImageView im4 = (ImageView)findViewById(R.id.im4);
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivity6(); }
        });

        ImageView im5 = (ImageView)findViewById(R.id.im5);
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivity7(); }
        });

        ImageView im6 = (ImageView)findViewById(R.id.im6);
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivity8(); }
        });

        ImageView im7 = (ImageView)findViewById(R.id.im7);
        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivity9(); }
        });

    }
    public void openActivity3() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    public void openActivity4() {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void openActivity5() {
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }

    public void openActivity6() {
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
    }

    public void openActivity7() {
        Intent intent = new Intent(this, Activity7.class);
        startActivity(intent);
    }

    public void openActivity8() {
        Intent intent = new Intent(this, Activity8.class);
        startActivity(intent);
    }

    public void openActivity9() {
        Intent intent = new Intent(this, Activity9.class);
        startActivity(intent);
    }
}