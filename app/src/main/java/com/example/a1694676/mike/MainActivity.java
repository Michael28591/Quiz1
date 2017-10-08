package com.example.a1694676.mike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void showFirst(View v)
    {
        Intent i=new Intent(this,ColorActivity.class);
        startActivity(i);
    }
    public void showSecond(View v)
    {
        Intent i=new Intent(this,calculatorActivity.class);
        startActivity(i);
    }
    public void showThird(View v)
    {
        Intent i=new Intent(this,AnimationActivity.class);
        startActivity(i);

        finish();
    }
}
