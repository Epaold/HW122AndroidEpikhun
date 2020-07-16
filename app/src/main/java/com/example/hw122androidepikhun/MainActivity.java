package com.example.hw122androidepikhun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textresult = findViewById(R.id.textresult);
        int a = (int) ( Math.random() * 100 );
        textresult.setText("http://myfile.org/"+ Integer.toString(a));
    }


    public void btnGoClicked(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity.class);

        startActivity(intent);


    }
    public void btnbackClicked(View view){
        finish();
    }

}
