package com.demo.drawableresource;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class ClipDrawableActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clip_drawable);
		ImageView imageView = (ImageView) findViewById(R.id.image);
		ClipDrawable clipDrawable = (ClipDrawable) imageView.getDrawable();
		clipDrawable.setLevel(20);
	}

}
