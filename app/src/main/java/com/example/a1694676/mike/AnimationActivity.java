package com.example.a1694676.mike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import static android.R.attr.animation;

public class AnimationActivity extends AppCompatActivity {
    ViewGroup myContainer;
    boolean visibility=false;
    ImageView image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        myContainer=(ViewGroup) findViewById(R.id.AnimationCreation);

image1=(ImageView)findViewById(R.id.image);
    }
    public void showImage(View v)
    {
        TransitionManager.beginDelayedTransition(myContainer);
        visibility=!visibility;
       // image1.setVisibility(visibility? View.VISIBLE:View.INVISIBLE);
        ((ViewGroup.MarginLayoutParams)image1.getLayoutParams()).topMargin += 10;
        image1.requestLayout();
        if(visibility) {
            TranslateAnimation animation = new TranslateAnimation(0, 0, 0, 1000);
            animation.setDuration(1000);
            animation.setFillAfter(true);
            animation.setAnimationListener(new MyAnimationListener());

            image1.startAnimation(animation);
        } else {
            TranslateAnimation animation = new TranslateAnimation( 0,0, 1000, 0);
            animation.setDuration(1000);
            animation.setFillAfter(true);
            animation.setAnimationListener(new MyAnimationListener());

            image1.startAnimation(animation);
        }

    }
    private class MyAnimationListener implements Animation.AnimationListener {

        @Override
        public void onAnimationEnd(Animation animation) {

        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }

        @Override
        public void onAnimationStart(Animation animation) {
        }

    }

    @Override
    public void onBackPressed() {
        // Do Here what ever you want do on back press;
    }
}
