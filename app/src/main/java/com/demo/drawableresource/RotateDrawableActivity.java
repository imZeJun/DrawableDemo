package com.demo.drawableresource;

import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class RotateDrawableActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rotate_drawable);
		ImageView imageView = (ImageView) findViewById(R.id.image);
		RotateDrawable rotateDrawable = (RotateDrawable) imageView.getDrawable();
		rotateDrawable.setLevel(2500);
	}
}
