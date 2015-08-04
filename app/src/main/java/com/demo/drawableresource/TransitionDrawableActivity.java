package com.demo.drawableresource;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class TransitionDrawableActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transition_drawable);
		ImageView imageView = (ImageView) findViewById(R.id.image);
		TransitionDrawable transitionDrawable = (TransitionDrawable) imageView.getDrawable();
		transitionDrawable.startTransition(1000);
	}

}
